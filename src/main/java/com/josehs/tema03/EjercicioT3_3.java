package com.josehs.tema03;

import java.util.Scanner;

public class EjercicioT3_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = teclado.nextInt();
        if (edad>17) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        teclado.close();
    }
}
