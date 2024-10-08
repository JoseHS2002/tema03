package com.josehs.tema03.bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int fact=1;
        System.out.println("Dime el numero entero");
        int n = teclado.nextInt();
        teclado.close();
        for (int i=n;i>0;i--){
            fact *= i;
        }
        System.out.println("Factorial: "+fact);
    }
}
