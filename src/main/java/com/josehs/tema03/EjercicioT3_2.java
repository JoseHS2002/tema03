package com.josehs.tema03;

import java.util.Scanner;

public class EjercicioT3_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int primerNumero = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        int segundoNumero = teclado.nextInt();
        if (primerNumero == segundoNumero) {
            System.out.println("El primer numero es igual al segundo numero");
        } else if (primerNumero > segundoNumero) {
            System.out.println("El primer numero es mayor que el segundo numero");
        } else if (primerNumero < segundoNumero) {
            System.out.println("El primer numero es menor que el segundo numero");

        }

    }
}