package Desafios.URI2813;


import java.io.IOException;
import java.util.Scanner;

public class Main2813{
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int casaComprado = 0;
        int casaSobrando = 0;
        int trabComprado = 0;
        int trabSobrando = 0;
        for (int i = 0; i < N; i++) {
            String irTrabalhar = leitor.next();
            String irCasa = leitor.next();
            if (irTrabalhar.equalsIgnoreCase("chuva") && casaSobrando == 0) {
                casaComprado++;
                trabSobrando++;
            } else if (irTrabalhar.equalsIgnoreCase("chuva") && casaSobrando > 0) {
                trabSobrando++;
                casaSobrando--;
            }
            if (irCasa.equalsIgnoreCase("chuva") && trabSobrando == 0) {
                trabComprado++;
                casaSobrando++;
            } else if (irCasa.equalsIgnoreCase("chuva") && trabSobrando > 0) {
                casaSobrando++;
                trabSobrando--;
            }
        }
        System.out.println(casaComprado + " " + trabComprado);
    }
}
