package com.josehs.tema03.bucles;

public class Ejercicio5 {
    public static void main(String[] args) {

        int par=0;
        int impar=0;
        System.out.println("Contar hasta 100 y decir cuales son pares");
        for (int parImpar=0; parImpar<101; parImpar++) {
            System.out.println(parImpar);
            if (parImpar%0) {
                par = par +1;
                System.out.println(par+" es par");
            } else {
                impar = impar +1;
            }

        }
    }
}
