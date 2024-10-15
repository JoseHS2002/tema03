package com.josehs.tema03.ANSI;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n;
        System.out.println("Escriba un numero");
        n = teclado.nextFloat();
        System.out.printf("%.2f", n);
    }
}
