package com.josehs.tema03.condicionales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int par=teclado.nextInt();
        if (par%2==0) {
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
        teclado.close();
    }
}
