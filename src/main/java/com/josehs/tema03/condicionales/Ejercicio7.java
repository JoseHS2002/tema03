package com.josehs.tema03.condicionales;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = teclado.nextInt();
        String socio = teclado.nextLine();
        int dinero = 500;
        if (edad>65) {
            System.out.println(dinero - 250);
        } else if (edad<18 && socio=="no") {
            System.out.println(dinero - 125);
        } else if (edad<18 && socio=="si") {
            System.out.println(dinero - 175);
        }
        teclado.close();
    }
}
