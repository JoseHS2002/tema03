package com.josehs.tema03.ANSI;

public class Ejercicio7 {
    public static void main(String[] args) {

        String s ="";
        String r;
        for (int a =1; a <= 9; a++){
            s=s+a;
            System.out.printf("%9s", s);
            r="";
            for (int b = s.length(); b >= 0; b--){
                r=r+s.charAt(b);
            }
            System.out.printf("%-9s\n", r);
        }
    }
}

/*
String s ="";
String r ="";
for (int a =1; a<= 9; a++){
s=s+a;
    soutf("%9s", s)
    r="";
    for (int b = s.length(); b >= 0; b--){
        r=r+s.charAt(b);
    }
    soutf("%-9s\n", r);
}

for (int a = 1; a <= 9; a++) {
                for (int b = 1; b <= 18 - a; b++) {
                    System.out.println(a);
                }
                for (int c = 1; c <= a; c++) {
                    System.out.println(a);
                }
                System.out.println();
            }

*/
