package com.josehs.tema03;

import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = teclado.nextInt();
        int dinero = 500;
        if (edad>65) {
            System.out.println(dinero - 325);
        } else if (edad<18) {
            System.out.println(dinero - 125);
        } else if (edad>=18 && edad<65) {
            System.out.println(dinero);
        }
    }
}
