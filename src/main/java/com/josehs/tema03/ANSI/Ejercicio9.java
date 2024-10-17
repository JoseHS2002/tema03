package com.josehs.tema03.ANSI;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String ciudad= "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ciudad");
        ciudad = teclado.nextBigInteger().toString();
        System.out.println("Fecha");
        int fecha= teclado.nextInt();
        System.out.println("Hora de la media");
        int horaMedia= teclado.nextInt();
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
        teclado.nextInt();

        System.out.println(ciudad+fecha+";"+horaMedia+";"+velocidadViento+";"+temperatura+";"+presionAtmosferica+";"+probabilidadLluvia+";"+IRU);

    }
}
