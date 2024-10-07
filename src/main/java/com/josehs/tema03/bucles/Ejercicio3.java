package com.josehs.tema03.bucles;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int prod;
        int i;
        prod= 0;
        int x = teclado.nextInt();
        System.out.println("Dime el segundo numero");
        int y = teclado.nextInt();
        for (i=1 ; i<= y; i++) {
            prod = prod + x;
        }
        System.out.println(y);
    }
}
