package Desafios.URI1110;
/*
          ******************** Jogando Cartas Fora ********************

Dada uma pilha de n cartas enumeradas de 1 até n com a carta 1 no topo e a carta n na base.  A seguinte operação é
ralizada enquanto tiver 2 ou mais cartas na pilha.
Jogue fora a carta do topo e mova a próxima carta (a que ficou no topo) para a base da pilha.
Sua tarefa é encontrar a sequência de cartas descartadas e a última carta remanescente.
Cada linha de entrada (com exceção da última) contém um número n ≤ 50. A última linha contém 0 e não deve ser
processada. Cada número de entrada produz duas linhas de saída. A primeira linha apresenta a sequência de cartas
descartadas e a segunda linha apresenta a carta remanescente.

Entrada
A entrada consiste em um número indeterminado de linhas contendo cada uma um valor de 1 até 50. A última linha
contém o valor 0.

Saída
Para cada caso de teste, imprima duas linhas. A primeira linha apresenta a sequência de cartas descartadas,
cada uma delas separadas por uma vírgula e um espaço. A segunda linha apresenta o número da carta que restou.
Nenhuma linha tem espaços extras no início ou no final. Veja exemplo para conferir o formato esperado.


Exemplo de Entrada	        Exemplo de Saída
7                           Discarded cards: 1, 3, 5, 7, 4, 2
                            Remaining card: 6
19                          Discarded cards: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 4, 8, 12, 16, 2, 10, 18, 14
                            Remaining card: 6
10                          Discarded cards: 1, 3, 5, 7, 9, 2, 6, 10, 8
                            Remaining card: 4
6                           Discarded cards: 1, 3, 5, 2, 6
                            Remaining card: 4
0
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main1110 {
    public static void main(String[] args) {
        Stack<Integer> pilhaCartas = new Stack();
        Stack<Integer> pilhaProvisoria = new Stack();
        Queue<Integer> filaCartasDescartadas = new LinkedList();
        Queue<Integer> filaProvisoria = new LinkedList();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//n recebe a quantidade de cartas

        for (int i = n; i > 0; i--) {
            pilhaCartas.push(i);//coloca todas as cartas na pilhaCartas com a menor no topo e a maior na base
        }
        while (pilhaCartas.size() >= 2) {//enquanto tiver 2 ou mais cartas na pilhaCartas...
            filaCartasDescartadas.offer(pilhaCartas.pop());
            int num = pilhaCartas.pop();//variável para receber a carta que irá para a base da pilha
            int j = pilhaCartas.size();//variável para receber o tamanho da pilha
            for (int i = 0; i < j; i++) {
                filaProvisoria.offer(pilhaCartas.pop());//coloca toadas as cartas restantes na filaProvisória
            }

            j = filaProvisoria.size();//variável para receber o tamanho da fila
            for (int i = 0; i < j; i++) {
                pilhaProvisoria.push(filaProvisoria.poll());//coloca todas as cartas da filaProvisória para a pilhaProvisoria
            }
            pilhaCartas.push(num);//coloca na base a carta que está com a variável num

            j = pilhaProvisoria.size();//variável para receber o tamanho da pilha
            for (int i = 0; i < j; i++) {
                pilhaCartas.push(pilhaProvisoria.pop());//pilhaCartas recebe o restante das cartas na ordem correta
            }
        }

        int j = filaCartasDescartadas.size();
        System.out.print("Discarded cards: ");
        for (int i = 0; i < j; i++) {
            System.out.print(filaCartasDescartadas.peek());
            filaProvisoria.offer(filaCartasDescartadas.poll());
            if ((j - i) >= 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Remaining card: ");
        System.out.println(pilhaCartas.peek());
    }
}
/*!!!!!!!!!!!!!!!!!!!
OBS: Apesar do algorítmo trazer os resultados corretos, ele não passou nos testes durante a submissão.
!!!!!!!!!!!!!!!!!!!*/