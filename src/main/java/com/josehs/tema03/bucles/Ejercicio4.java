package com.josehs.tema03.bucles;

public class Ejercicio4 {
    public static void main(String[] args) {

        int par=0;

        System.out.println("Contar hasta 100 y decir cuantos son pares e impares");
        for (int parImpar=1; parImpar<101; parImpar+=2) {
            System.out.println(parImpar);
            if (parImpar%2!=0) {
                par = par +1;
            }
            System.out.println(par+" es impar");
        }
    }
}
