
package Desafios.URI1192;
import java.util.Scanner;

/*
           ******************** O jogo Matemático de Paula ********************

Paula simplesmente adora matemática. Seu maior passatempo é ficar inventando jogos ou atividades que a envolvam para
brincar com seus amiguinhos. Obviamente, nem todos eles não são tão apaixonados assim por matemática e têm muita
dificuldade para resolver as brincadeiras propostas por ela. Agora Paula inventou um pequeno passatempo que envolve
3 caracteres: um dígito numérico, uma letra e outro dígito numérico.
Se a letra for maiúscula, deve-se subtrair o primeiro dígito do segundo. Se a letra for minúscula, deve-se somar ambos
os dígitos e se os DÍGITOS forem iguais, deve-se desconsiderar a letra e mostrar o produto entre os dois dígitos.
Ela pediu para seu amigo Marcelo, que é bom em programação, para criar um programa para que encontre a solução para
cada uma das sequências que Paula lhe apresentar.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N, indicando o número de casos
de teste que virão a seguir. Cada caso de teste é uma sequência de três caracteres criada por Paula. Esta sequência
contém na primeira posição um caractere de '0' a '9', na segunda posição uma letra maiúscula ou minúscula do alfabeto
e na terceira posição outro caractere de '0' a '9'.

Saída
Para cada caso de teste, deve ser impressa uma linha com um valor inteiro que representa a solução da sequência
proposta por Paula.

Exemplo de Entrada	            Exemplo de Saída
5
4A5                             1
3A3                             9
4f2                             6
2G4                             2
7Z1                             -6
 */
public class Main1192 {
    public static void main(String[] args) {
        int N; // vai determinar quantas vezes irá jogar
        Scanner scan = new Scanner (System.in);
        N = scan.nextInt();

        for(int i = 0; i < N; i ++){
            String text = scan.next(); //recebe a string

            int A = Integer.parseInt(text.substring(0, 1)); // váriável que recebe o primeiro digito
            int B = Integer.parseInt(text.substring(2, 3)); // váriável que recebe o terceiro digito
            char C = text.charAt(1);//váriável que recebe o segundo digito

            if (A == B){
                System.out.println(A * B);
            }
            else if (Character.isUpperCase(C)){
                System.out.println(B - A);
            }
            else {
                System.out.println(A + B);
            }
        }
    }
}