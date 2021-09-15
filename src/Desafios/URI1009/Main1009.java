package Desafios.URI1009;
/*
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1009
 * **************** Salário com Bônus *****************
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main1009 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();

        int commission = 15;
        double baseSalary = Double.parseDouble(bf.readLine());
        double sales = Double.parseDouble(bf.readLine());

        double totalSalary = (baseSalary + (sales * commission/100));

        String formatted = "0.00";
        DecimalFormat df = new DecimalFormat(formatted);

        System.out.println("TOTAL = R$ " + df.format(totalSalary));
    }
}
