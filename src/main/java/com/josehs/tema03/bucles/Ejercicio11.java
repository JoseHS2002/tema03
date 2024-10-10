package com.josehs.tema03.bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n, s, e;
        float m;


            System.out.println("Ingresar un numero");
            n = teclado.nextInt();
            s=0;
            e=0;

        while (n >= 0) {
            s += n;
            e++;

            System.out.println("Ingresar otro numero");
            n = teclado.nextInt();
        }
        if (e==0){
            System.out.println("Error");
        }
        else{
            m=(float)s/e;
            System.out.println("Media: "+m);
        }
    }
}
