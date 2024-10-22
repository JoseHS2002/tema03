package com.josehs.tema03.condicionales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        int primerNumero = teclado.nextInt();
        System.out.println("Escribe el segundo numero");
        int segundoNumero = teclado.nextInt();
        if (primerNumero>segundoNumero) {
            System.out.println(segundoNumero + ", " + primerNumero);
        } else if (primerNumero<segundoNumero) {
            System.out.println(primerNumero + ", " + segundoNumero);
        }
        teclado.close();
    }
}
