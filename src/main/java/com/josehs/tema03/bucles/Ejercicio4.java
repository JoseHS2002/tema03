package com.josehs.tema03.bucles;

public class Ejercicio4 {
    public static void main(String[] args) {

        int par=0;
        int impar=0;
        System.out.println("Contar hasta 100 y decir cuantos son pares e impares");
        for (int parImpar=1; parImpar<101; parImpar++) {
            System.out.println(parImpar);
            if (parImpar%0) {
                par = par +1;
            } else {
                impar = impar +1;
            }
            System.out.println("Hay "+ par+ " pares "+ " y "+ impar+ " impares");
        }
    }
}
