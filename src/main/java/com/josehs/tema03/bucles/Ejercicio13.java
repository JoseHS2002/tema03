package com.josehs.tema03.bucles;

import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int sumaCaras=0;
        int sumaCruces=0;

        for(int i=1; i<=1000000; i++) {
            int na = aleatorio.nextInt(2);
            if (na==0){
                sumaCaras++;
            }else {
                sumaCruces++;
            }
        }

        System.out.println("Caras: "+(sumaCaras*100)/1000000+"%");
        System.out.println("Cruces: "+(sumaCruces*100)/1000000+"%");

    }
}
//1000000--100
//sumaCaras--%
//(sumaCaras*100)/1000000