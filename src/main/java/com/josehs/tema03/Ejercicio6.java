package com.josehs.tema03;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica un valor real");
        float dinero = teclado.nextInt();
        float dos = dinero/2;
        System.out.println(dos);
    }
}
