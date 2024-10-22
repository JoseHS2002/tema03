package com.josehs.tema03.bucles;

public class Ejercicio4 {
    public static void main(String[] args) {

        int par=0;

        System.out.println("Contar hasta 100 y decir cuantos son pares e impares");
        for (int parImpar=1; parImpar<101; parImpar++) {
            System.out.println(parImpar);
            if (parImpar%2!=0) {
                par++;
                System.out.println(parImpar+" es impar");
            }
        }
        System.out.println("Hay "+par+" impares");
    }
}
