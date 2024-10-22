package com.josehs.tema03.bucles;

public class Ejercicio2 {
    public static void main(String[] args) {

        int suma=0;
        for (int i = 1; i < 1001; i++) {
            System.out.println(i);
                suma=suma+i;
        }
        System.out.println("La suma es: "+suma);
    }
}
