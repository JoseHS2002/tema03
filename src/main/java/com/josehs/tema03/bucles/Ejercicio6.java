package com.josehs.tema03.bucles;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //tabla de multiplicar del 1 al 10
        System.out.println("Dime el primer numero");
        int a = teclado.nextInt();
        System.out.println("Dime el segundo numero");
        int b = teclado.nextInt();

        teclado.close();
        if (a>10 || b>10) {
            System.out.println("Error");
        } else {
            System.out.println(a*b);
        }
    }
}
