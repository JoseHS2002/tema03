package com.josehs.tema03.bucles;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int resultado=1;

        System.out.println("Dime el numero real");
        float a = teclado.nextInt();
        System.out.println("Dime el numero entero");
        int b = teclado.nextInt();
        teclado.close();

            for (int i =1; i<= b ; i++) {
                resultado *= a;
            }

        System.out.println(Math.pow(a,b));
        System.out.println(a+" ^ "+b+"= "+resultado);
    }
}
