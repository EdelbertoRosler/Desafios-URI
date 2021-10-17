package Desafios.URI1009;
/*
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1009
 * **************** Salário com Bônus *****************
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1009Modularized {
    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static final int commission = 15; // commission value => 15 %

    public static void main(String[] args) throws IOException {
        String name = readName("");
        double baseSalary = readDouble("");
        double sales = readDouble("");
        double totalSalary = calculateSalary(baseSalary, sales);
        printSalary(totalSalary);
    }

    public static String readName(String txt) throws IOException {
        System.out.print(txt);
        return bf.readLine();
    }

    public static double readDouble(String txt) throws IOException{ // read a double number
        System.out.print(txt);
        return Double.parseDouble(bf.readLine());
    }

    public static double calculateSalary(double salary, double sales) {
        return (salary + (sales * commission/100));
    }

    public static void printSalary(double salary) { System.out.printf("TOTAL = R$ %.2f",salary); }

}