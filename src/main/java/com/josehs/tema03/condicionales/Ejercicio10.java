package com.josehs.tema03.condicionales;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿El año es bisiesto?");
        int year = teclado.nextInt();


        if (year%4==0 && (year%400 == 0 || year%100 !=0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
        teclado.close();
    }
}
