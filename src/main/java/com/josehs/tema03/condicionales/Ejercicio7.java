package com.josehs.tema03.condicionales;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int descuentoM=250;
        int descuentoS=175;
        int descuentoNS=125;
        int socio;
        System.out.println("Dime tu edad");
        int edad = teclado.nextInt();
        int dinero = 500;
        if (edad>65) {
            System.out.println(dinero - descuentoM);
        } else if (edad<18) {
            System.out.println("Padres socios (y=1/n=0)");
            socio = teclado.nextInt();
            if (socio==1){
                System.out.println(dinero-descuentoS);
            } else if (socio==0){
                System.out.println(dinero - descuentoNS);
            }
        }
        teclado.close();
    }
}
