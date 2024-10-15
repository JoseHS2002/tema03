package com.josehs.tema03.ANSI;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int h = 0;
        int m = 0;
        int s = 0;

        do {
            System.out.println("Hora: ");
            h = teclado.nextInt();
            System.out.println("Minutos: ");
            m = teclado.nextInt();
            System.out.println("Segundos: ");
            s = teclado.nextInt();
        }
        while (!(h >= 0 && h <= 23) || !(m >= 0 && m <= 59) || !(s >= 0 && s <= 59));
        System.out.printf("%02d", h);
        System.out.print(":");
        System.out.printf("%02d", m);
        System.out.print(":");
        System.out.printf("%02d", s);
        teclado.close();

    }
}
