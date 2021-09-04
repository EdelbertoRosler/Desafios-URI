package Desafios.URI1036;
/*
      ********************** Fórmula de Bhaskara **********************

Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as
raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário,
imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo.
Imprima sempre o final de linha após cada mensagem.

Exemplos de Entrada     	Exemplos de Saída
10.0                        R1 = -0.29788
20.1                        R2 = -1.71212
5.1

0.0                         Impossivel calcular
20.0
5.0

10.3                        R1 = -0.02466
203.0                       R2 = -19.68408
5.0

10.0                        Impossivel calcular
3.0
5.0
 */
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1036 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        double A = Double.parseDouble(scan.next());
        double B = Double.parseDouble(scan.next());
        double C = Double.parseDouble(scan.next());

        double delta = ((B * B ) - 4 * A * C);

        if (delta < 0 || A == 0){
            System.out.println("Impossivel calcular");
        }
        else {
            double X1 = (-B + Math.sqrt(delta)) / (2 * A) ;
            double X2 = (-B - Math.sqrt(delta)) / (2 * A) ;

            String formato = "0.00000";
            DecimalFormat df = new DecimalFormat(formato);

            System.out.println("R1 = " + df.format(X1));
            System.out.println("R2 = " + df.format(X2));
        }
    }
}
