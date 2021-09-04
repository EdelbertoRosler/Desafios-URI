package Desafios.URI1091;

import java.util.Scanner;

/*
             ****************** Divisão da Nlogônia ******************
Entrada
A entrada contém vários casos de teste. A primeira linha de um caso de teste contém um inteiro K indicando o número
de consultas que serão realizadas (0 < K ≤ 103). A segunda linha de um caso de teste contém dois números inteiros N e M
representando as coordenadas do ponto divisor (-104 < N, M < 104). Cada uma das K linhas seguintes contém dois
inteiros X e Y representando as coordenadas de uma residência (-104 ≤ X, Y ≤ 104).Em todas as coordenadas dadas,
o primeiro valor  corresponde à direção leste-oeste, e o segundo valor corresponde à direção norte-sul.
O final da entrada é indicado por uma linha que contém apenas o número zero.

Saída
Para cada caso de teste da entrada seu programa deve imprimir uma linha contendo:

a palavra divisa se a residência encontra-se em cima de uma das linhas divisórias (norte-sul ou leste-oeste);
NO se a residência encontra-se na Nlogônia do Noroeste;
NE se a residência encontra-se na Nlogônia do Nordeste;
SE se a residência encontra-se na Nlogônia do Sudeste;
SO se a residência encontra-se na Nlogônia do Sudoeste.
 */
public class Main1091 {
    public static void main(String[] args) {
        int K;
        Scanner scan = new Scanner(System.in);
        K = scan.nextInt();

        while (K != 0) {
            int zeroX = scan.nextInt();
            int zeroY = scan.nextInt();

            for (int i = 0; i < K; i++) {
                int pontoX = scan.nextInt();
                int pontoY = scan.nextInt();

                if (pontoX == zeroX || pontoY == zeroY) {
                    System.out.println("divisa");
                } else if (pontoX > zeroX && pontoY > zeroY) {
                    System.out.println("NE");
                } else if (pontoX > zeroX && pontoY < zeroY) {
                    System.out.println("SE");
                } else if (pontoX < zeroX && pontoY > zeroY) {
                    System.out.println("NO");
                } else if (pontoX < zeroX && pontoY < zeroY) {
                    System.out.println("SO");
                }
            }
            K = scan.nextInt();
        }
    }
}