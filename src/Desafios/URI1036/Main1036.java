package Desafios.URI1036;
/*
*https://www.urionlinejudge.com.br/judge/pt/problems/view/1036
*      ********************** Fórmula de Bhaskara **********************
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
