package Desafios.URI1049;
/*
* https://www.urionlinejudge.com.br/judge/pt/problems/view/1049
* **************** Animal *****************
* */
import java.util.Scanner;

public class Main1049 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String one = scan.next(); String two = scan.next(); String three = scan.next();

        if (one.equals("vertebrado") && two.equals("ave") && three.equals("carnivoro")){ System.out.println("aguia"); }
        else {
            if (one.equals("vertebrado") && two.equals("ave") && three.equals("onivoro")) {
                System.out.println("pomba");
            } else {
                if (one.equals("vertebrado") && two.equals("mamifero") && three.equals("onivoro")) {
                    System.out.println("homem");
                }
                else {
                    if (one.equals("vertebrado") && two.equals("mamifero") && three.equals("herbivoro")){
                        System.out.println("vaca");}
                }
            }
        }

        if (one.equals("invertebrado") && two.equals("inseto") && three.equals("hematofago")){System.out.println("pulga");}
        else {
            if (one.equals("invertebrado") && two.equals("inseto") && three.equals("herbivoro")) {
                System.out.println("lagarta");
            } else {
                if (one.equals("invertebrado") && two.equals("anelideo") && three.equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                else {
                    if (one.equals("invertebrado") && two.equals("anelideo") && three.equals("onivoro")){
                        System.out.println("minhoca");
                    }
                }

            }
        }

    }
}
