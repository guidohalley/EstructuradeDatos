package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Leer datos desde teclado en Java - #7");

        Scanner entrada = new Scanner(System.in);

        System.out.println("cual es tu nombre ?");
        String nombre = entrada.nextLine( );

        System.out.println("\n tu nombre es> " + nombre);

        System.out.println("\n cual es tu edad ?");
        String edad = entrada.nextLine();
        System.out.println("tu edad es " + edad );



    }
}