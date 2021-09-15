package Desafios.URI1006;
/*
*https://www.urionlinejudge.com.br/judge/pt/problems/view/1006
*************************** Média 2 ***************************
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1006 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        float A = Float.parseFloat(bf.readLine());
        float B = Float.parseFloat(bf.readLine());
        float C = Float.parseFloat(bf.readLine());

        float media = (((A * 2) + (B * 3) + (C * 5)) / 10);
        String formated = String.format("MEDIA = %,.1f", media);
        System.out.print(formated +"\n");
    }
}
