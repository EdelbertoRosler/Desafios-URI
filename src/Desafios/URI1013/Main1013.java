package Desafios.URI1013;
/*
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1013
 * **************** O Maior *****************
 */
import java.io.IOException;
import java.util.Scanner;

public class Main1013 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        if (A > B && A > C){ System.out.println(A + " eh o maior"); }
        else {
            if (B > C){ System.out.println(B + " eh o maior"); }
            else { System.out.println(C + " eh o maior"); }
        }
    }
}
