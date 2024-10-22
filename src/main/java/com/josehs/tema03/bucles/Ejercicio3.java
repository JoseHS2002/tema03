package com.josehs.tema03.bucles;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int signoA;
        int signoB;
        int producto = 0;
        System.out.println("Dime el primer numero");
        int a = teclado.nextInt();
        System.out.println("Dime el segundo numero");
        int b = teclado.nextInt();

        signoA = a < 0 ? -1 : 1;
        a *= signoA;
        signoB = b < 0 ? -1 : 1;
        b *= signoB;
        for (int i=1 ; i <= a; i++) {
            producto = producto+b;
        }
        producto=producto*signoA*signoB;
        a *= signoA;
        b *= signoB;
        System.out.println(a+" x "+b+"= "+producto);
        System.out.println("Suma el primer numero "+b+" veces");
    }
}
