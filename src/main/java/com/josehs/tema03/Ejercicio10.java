package com.josehs.tema03;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿El año es bisiesto?");
        int year = teclado.nextInt();
        int bisiesto=year%4;

        if (bisiesto==0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
