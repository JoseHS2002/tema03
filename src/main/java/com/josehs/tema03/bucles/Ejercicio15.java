package com.josehs.tema03.bucles;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int h=0;
        int m=0;
        int s=0;

        do {
            System.out.println("Hora: ");
            h = teclado.nextInt();
            System.out.println("Minutos: ");
            m = teclado.nextInt();
            System.out.println("Segundos: ");
            s = teclado.nextInt();
        }
        while (!(h>=0 && h<=23) || !(m>=0 && m<=59) || !(s>=0 && s<=59));
        System.out.println(h+":"+m+":"+s);
        teclado.close();

            if ( !(h>=0 && h<=23) || !(m>=0 && m<=59) || !(s>=0 && s<=59)){
                System.out.println("La hora no es valida");
            } else
            {
                System.out.println("La hora es valida");
            }
    }
}
