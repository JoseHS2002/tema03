package com.josehs.tema03.condicionales;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el valor del dado");
        int dado = teclado.nextInt();
        if (dado<1 || dado>6) {
            System.out.println("ERROR: Numero incorrecto");
        } else if (dado==1) {
            System.out.println("6");
        } else if (dado==2) {
            System.out.println("5");
        } else if (dado==3) {
            System.out.println("4");
        } else if (dado==4) {
            System.out.println("3");
        } else if (dado==5) {
            System.out.println("2");
        } else if (dado==6) {
            System.out.println("1");
        }
        teclado.close();
    }
}
