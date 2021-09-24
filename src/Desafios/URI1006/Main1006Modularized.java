package Desafios.URI1006;
/*
*https://www.urionlinejudge.com.br/judge/pt/problems/view/1006
*************************** Media 2 ***************************
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1006Modularized {
    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        double A = readDouble("");
        double B = readDouble("");
        double C = readDouble("");

        System.out.printf("MEDIA = %,.1f", calculateMedia(A,B,C));
    }

    public static double readDouble(String txt) throws IOException {
        System.out.print(txt);
        return Double.parseDouble(bf.readLine());
    }

    public static double calculateMedia(double A, double B, double C) {
        return (((A * 2) + (B * 3) + (C * 5)) / 10);
    }

}
