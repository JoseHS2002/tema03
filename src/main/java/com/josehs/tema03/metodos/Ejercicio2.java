package com.josehs.tema03.metodos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void circunferencia(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el radio de la circunferencia: ");
        double radio = teclado.nextInt();
        double area = Math.PI * (radio * radio);
        double diametro = radio * 2;
        double longitud = diametro * Math.PI;
        System.out.print("La longitud de la circunferencia es " + longitud + " y el area de la circunferencia es " + area);
        teclado.close();
    }

}
