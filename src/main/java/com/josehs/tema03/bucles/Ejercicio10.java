package com.josehs.tema03.bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma=0;

        System.out.println("Ingresar numero");
        int n = teclado.nextInt();
        teclado.close();
        while (n != 0){
            suma = suma+n;
            break;
        }
        System.out.println("suma: "+suma);
    }
}
