package com.josehs.tema03.metodos;

import java.util.Scanner;

public class Ejercicio6 {
    public static int contarCaracteres(char caracter, int i, int j){
        while (caracter!=0){
            i++;
            j++;

        }
        return caracter;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i=0;
        boolean caracter;
        int j=0;
        System.out.println("Escribe un caracter: "+caracter);
        caracter=teclado.nextBoolean();
        System.out.println(caracter);
        System.out.println("Numero de veces en las que el caracter se repite: "+i);
        System.out.println("Numero de lineas que se imprime: "+j);
    }
}
