package com.josehs.tema03.ANSI;

public class Ejercicio5 {
    public static void main(String[] args) {

        int a=1;
        System.out.print("        ");
        System.out.println("\u001B[0;36;40m"+a+"\u001B[0m");
        System.out.print("       ");
        for (int b=1; b<=2; b++){
            System.out.print("\u001B[1;31;40m"+b+"\u001B[0m");
        }
        System.out.println("");
        System.out.print("      ");
        for (int c=1; c<=3; c++){
            System.out.print("\u001B[1;32;40m"+c+"\u001B[0m");
        }
        System.out.println("");
        System.out.print("     ");
        for (int d=1; d<=4; d++){
            System.out.print("\u001B[1;33;40m"+d+"\u001B[0m");
        }
        System.out.println("");
        System.out.print("    ");
        for (int e=1; e<=5; e++){
            System.out.print("\u001B[1;34;40m"+e+"\u001B[0m");
        }
        System.out.println("");
        System.out.print("   ");
        for (int f=1; f<=6; f++){
            System.out.print("\u001B[1;35;40m"+f+"\u001B[0m");
        }
        System.out.println("");
        System.out.print("  ");
        for (int g=1; g<=7; g++){
            System.out.print("\u001B[1;36;40m"+g+"\u001B[0m");
        }
        System.out.println("");
        System.out.print(" ");
        for (int h=1; h<=8; h++){
            System.out.print("\u001B[1;36;40m"+h+"\u001B[0m");
        }
        System.out.println("");
        for (int i=1; i<=9; i++){
            System.out.print("\u001B[1;36;40m"+i+"\u001B[0m");
        }

    }
}
