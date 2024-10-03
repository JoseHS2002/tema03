package com.josehs.tema03;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuanto mide el primer lado");
        int A = teclado.nextInt();
        System.out.println("Dime cuanto mide el segundo lado");
        int B = teclado.nextInt();
        System.out.println("Dime cuanto mide el tercer lado");
        int C = teclado.nextInt();


        if (A==B && B==C) {
            System.out.println("El triangulo es equilatero");
        } else if (A==B && B!=C) {
            System.out.println("El triangulo es isosceles");
        } else if (A!=B && B==C) {
            System.out.println("El triangulo es isosceles");
        } else if (A!=B && B!=C) {
            System.out.println("El triangulo es escaleno");
        }
    }
}
