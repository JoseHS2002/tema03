package com.josehs.tema03.bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int i=1;
        int a = 0;
        System.out.println("Numeros primos");
        int n = teclado.nextInt();

        teclado.close();
        while (i <= n){
            if (n % i ==0){
                a++;
            }
            i++;
        }
        if (a == 2){
            System.out.println(n+" es un numero primo");
        }
        else{
            System.out.println(n+" no es un numero primo");
        }
    }
}
