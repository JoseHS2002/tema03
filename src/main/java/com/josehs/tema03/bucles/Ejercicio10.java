package com.josehs.tema03.bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;
        int suma=0;

        n = teclado.nextInt();
        teclado.close();
        while (n != 0){
            System.out.println("Ingresar numero");
            suma = suma+n;
        }
        System.out.println("suma: "+suma);
    }
}
