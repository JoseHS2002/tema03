package com.josehs.tema03.ANSI;

public class Ejercicio8 {
    public static void main(String[] args) {

        for (int negrita = 0; negrita <= 1; negrita++) {
                for (int colorTexto = 30; colorTexto <= 37; colorTexto++) {
                    for (int colorFondo = 40; colorFondo <= 47; colorFondo++) {
                        System.out.printf("\u001B["+negrita+";"+colorTexto+";"+colorFondo+ "m%9s \u001B[0m", negrita + ";" +  colorTexto + ";" + colorFondo);
                    }
                    System.out.println();
                }
        }

        /*
        "\u001B[negrita;texto;fondom Hola \u001B[0m"
        1negrita
        0negro, 1rojo, 2verde, 3amarillo, 4azul, 5magenta, 6cian, 7blanco
        3=texto
        4=fondo

"\u001B[negrita;colorTexto;colorFondom color \u001B[0m"

         */


    }
}
