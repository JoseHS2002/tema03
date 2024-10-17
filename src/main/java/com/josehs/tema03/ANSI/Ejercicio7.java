package com.josehs.tema03.ANSI;

public class Ejercicio7 {
    public static void main(String[] args) {

        int a=1;
        int b=9;
        if (a<b) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 18 - i; j++) {
                    System.out.println(a++);
                }
                for (int k = 1; k <= i; k++) {
                    System.out.println(a++);
                }
                System.out.println();
            }
        }

    }
}
