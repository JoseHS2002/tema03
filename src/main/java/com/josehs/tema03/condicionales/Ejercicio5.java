package com.josehs.tema03.condicionales;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu calificacion");
        int nota = teclado.nextInt();
        if (nota==0 && nota<5) {
            System.out.println("INSUFICIENTE");
        } else if (nota==5 && nota<6) {
            System.out.println("SUFICIENTE");
        } else if (nota==6 && nota<7) {
            System.out.println("BIEN");
        } else if (nota==7 && nota<9) {
            System.out.println("NOTABLE");
        } else if (nota==9 && nota==10) {
            System.out.println("SOBRESALIENTE");
        } else {
            System.out.println("ERROR");
        }
        teclado.close();
    }
}