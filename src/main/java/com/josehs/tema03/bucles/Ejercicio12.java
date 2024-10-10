//nombre del archivo
package com.josehs.tema03.bucles;

//Decimos que trabaje con numeros que introduzcamos y numeros aleatorios
import java.util.Scanner;
import java.util.Random;

//Le ponemos una clase y utilizamos main
public class Ejercicio12 {
    public static void main(String[] args) {
        //Indicamos que cree un objeto para el valor introducido y el valor aleatorio
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        //Indicamos las variables
        int na = aleatorio.nextInt(1,101);

        int nu;
        //El usuario tiene 5 intentos
        int i=5;

        boolean a=false;

        //Le decimos que pida un numero al usuario entre 1 y 100 mientras no acierte ni se acaben los intentos
        while (!a && i>0) {
            System.out.println("Adivina el numero entre 1 a 100");
            nu=teclado.nextInt();

            if (nu == na) {
                a=true;
            } else if (nu > na) {
                System.out.println("El numero aleatorio es menor al introducido");
                i--;
                System.out.println("Tienes "+i+" intentos");
            } else {
                System.out.println("El numero aleatorio es mayor al introducido");
                i--;
                System.out.println("Tienes "+i+" intentos");
            }
        }
        teclado.close();
        if(a) {
            System.out.println("You won");
        }else{
            System.out.println("You lost");
        }
    }
}
