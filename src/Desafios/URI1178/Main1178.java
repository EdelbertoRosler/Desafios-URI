package Desafios.URI1178;
/*
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1178
 * **************** Preenchimento de Vetor III *****************
 * */

import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

class Main1192 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double X = 0; X = leitor.nextDouble();
        BigDecimal[] N = new BigDecimal[100];
        N[0] = new BigDecimal(X);

        for (int i = 1; i < N.length; ++i) {
            N[i] = N[i - 1].divide(new BigDecimal(2));
        }

        leitor.close();
        DecimalFormat df = new DecimalFormat("0.0000");

        for (int i = 0; i < N.length; ++i) {
            System.out.println("N[" + i + "] = " + df.format(N[i]));
        }
    }
}

