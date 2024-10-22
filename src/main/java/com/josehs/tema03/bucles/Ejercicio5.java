package com.josehs.tema03.bucles;

public class Ejercicio5 {
    public static void main(String[] args) {

        int nump=0;
        int sump=0;
        int sumi=0;
        int numi=0;
        int multn=0;
        int mults=0;
        System.out.println("Contar hasta 100 y decir cuales son pares");
        for (int parImpar=0; parImpar<101; parImpar++) {
            System.out.println(parImpar);
            if (parImpar % 2 == 0) {
                sump = sump + parImpar;
                nump++;
                System.out.println(parImpar+" es par");
            } else {
                sumi = sumi + parImpar;
                numi++;
                System.out.println(parImpar+" es impar");
            }

            if (parImpar % 5 == 0) {
                mults= mults+parImpar;
                multn++;
                System.out.println(parImpar+" es multiplo de 5");
            }

        }
        System.out.println("Hay " +nump + " pares");
        System.out.println("Hay " +numi + " impares");
        System.out.println("Hay " +mults + " multiplos de 5");
    }
}
