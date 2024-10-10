package com.josehs.tema03.bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma=0;
        int n;

        do {
            System.out.println("Ingresar numero");
            n = teclado.nextInt();
            suma = suma+n;
        }
        while (n != 0);
            teclado.close();
        System.out.println("suma: "+suma);
    }
}
