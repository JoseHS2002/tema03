package com.josehs.tema03;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica un valor real en centimos");
        int dinero =teclado.nextInt();
        int dosE =0;
        int unE =0;
        int cincuentaC=0;
        int veinteC=0;
        int diezC=0;
        int cincoC=0;
        int dosC=0;
        int unC=0;
        int centimo=0;

        teclado.close();
        if (dinero>=1 && dinero<=1000000) {
            dosE = dinero / 200;
            centimo = centimo % 200;

            unE = dinero / 100;
            centimo = centimo % 100;

            cincuentaC = dinero / 50;
            centimo = centimo % 50;

            veinteC = dinero / 20;
            centimo = centimo % 20;

            diezC = dinero / 10;
            centimo = centimo % 10;

            cincoC = dinero / 5;
            centimo = centimo % 5;

            dosC = dinero / 2;
            centimo = centimo % 2;

            unC = centimo / 1;

            System.out.println("Monedas de dosE: " + dosE);
            System.out.println("Monedas de unoE: " + unE);
            System.out.println("Monedas de cincuentaC: " + cincuentaC);
            System.out.println("Monedas de veinteC: " + veinteC);
            System.out.println("Monedas de diezC: " + diezC);
            System.out.println("Monedas de cincoC: " + cincoC);
            System.out.println("Monedas de dosC: " + dosC);
            System.out.println("Monedas de unC: " + unC);
        } else {
            System.out.println("ERROR valor no compila");
        }
    }
}
