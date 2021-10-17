package Desafios.URI1036;
/*
* https://www.urionlinejudge.com.br/judge/pt/problems/view/1036
*      ********************** Fórmula de Bhaskara **********************
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1036Modularized {
    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        double A = readDouble("");
        double B = readDouble("");
        double C = readDouble("");

        double delta = getDelta(A,B,C);

        if (testValues(delta,A)) { System.out.println("Impossivel calcular"); }

        else {
            double X1 = (-B + Math.sqrt(delta)) / (2 * A);
            double X2 = (-B - Math.sqrt(delta)) / (2 * A);
            printRoots(X1, X2);
        }
    }

    public static boolean testValues(double delta, double A) {
        return delta < 0 || A == 0;
    }

    public static double readDouble(String txt) throws IOException { // read a double number
        System.out.print(txt);
        return Double.parseDouble(bf.readLine());
    }

    public static double getDelta (double A, double B, double C){ return ((B * B ) - 4 * A * C); } // return the Delta

    public static void printRoots(double X1, double X2){ System.out.printf("R1 = %.5f \nR2 = %.5f\n", X1, X2); }// print the two roots

}
