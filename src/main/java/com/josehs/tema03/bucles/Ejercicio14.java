package com.josehs.tema03.bucles;

import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int sumaUno=0;
        int sumaDos=0;
        int sumaTres=0;
        int sumaCuatro=0;
        int sumaCinco=0;
        int sumaSeis=0;

        for(int i=1; i<=1000000; i++) {
            int na = aleatorio.nextInt( 6);
            if (na==0){
                sumaUno++;
            }else if (na==1) {
                sumaDos++;
            }else if (na==2) {
                sumaTres++;
            }else if (na==3) {
                sumaCuatro++;
            }else if (na==4) {
                sumaCinco++;
            } else {
                sumaSeis++;
            }
        }

        System.out.println("1: "+(float)(sumaUno*100)/1000000+"%");
        System.out.println("2: "+(float)(sumaDos*100)/1000000+"%");
        System.out.println("3: "+(float)(sumaTres*100)/1000000+"%");
        System.out.println("4: "+(float)(sumaCuatro*100)/1000000+"%");
        System.out.println("5: "+(float)(sumaCinco*100)/1000000+"%");
        System.out.println("6: "+(float)(sumaSeis*100)/1000000+"%");

    }
}
