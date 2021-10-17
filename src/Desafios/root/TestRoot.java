package Desafios.root;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestRoot{
    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        double number = readNumber("What number? ");
        double root = square(number);
        System.out.println("Number : " + number);
        System.out.println("Square Root : " + root);
    }

    public static double square(double number){
        double X;
        double squareroot = number / 2;
        do {
            X = squareroot;
            squareroot = (X + (number / X)) / 2;
        }
        while ((X - squareroot) != 0);
        return squareroot;
    }

    public static double readNumber(String txt) throws IOException {
        System.out.print(txt);
        return Double.parseDouble(bf.readLine());
    }

//    public static double square2(double number){
//        double t;
//        double squareroot = number / 2;
//        do
//        {
//            t = squareroot;
//            squareroot = (t + (number / t)) / 2;
//        }
//        while ((t - squareroot) != 0);
//        return squareroot;
//    }


}

