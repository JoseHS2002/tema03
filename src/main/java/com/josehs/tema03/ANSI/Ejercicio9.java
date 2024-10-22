package com.josehs.tema03.ANSI;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String ciudad= "";
        Scanner teclado = new Scanner(System.in);

        int h = 0;
        int m = 0;
        int s = 0;
        int day=1;
        int month=1;
        int year=1;

        do {
            System.out.println("Hora: ");
            h = teclado.nextInt();
            System.out.println("Minutos: ");
            m = teclado.nextInt();
            System.out.println("Segundos: ");
            s = teclado.nextInt();
        }
        while (!(h >= 0 && h <= 23) || !(m >= 0 && m <= 59) || !(s >= 0 && s <= 59));

        System.out.println("Ciudad");
        ciudad = teclado.toString();
        System.out.println("Fecha");
        day= teclado.nextInt();
        month= teclado.nextInt();
        year= teclado.nextInt();
        System.out.println("Hora de la media");
        h= teclado.nextInt();
        m= teclado.nextInt();
        s= teclado.nextInt();
        System.out.println("Velocidad del viento");
        int velocidadViento= teclado.nextInt();
        System.out.println("Temperatura");
        int temperatura= teclado.nextInt();
        System.out.println("Presión atmosférica");
        int presionAtmosferica= teclado.nextInt();
        System.out.println("Probabildad de lluvia");
        int probabilidadLluvia= teclado.nextInt();
        System.out.println("Índice de radiación ultravioleta");
        int IRU= teclado.nextInt();

        System.out.println("Datos estación meteorológica");
        System.out.println("Ciudad: "+ciudad+";"+";"+velocidadViento+";"+temperatura+";"+presionAtmosferica+";"+probabilidadLluvia+";"+IRU);
        System.out.printf("Fecha: "+"%02d", h+":"+m+":"+s);
        System.out.printf("%02d", day+"/"+month+"/"+"%%"+"%04d", year);

    }
}
