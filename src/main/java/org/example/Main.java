package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ciclos de repetición en Java - #8");

        Scanner entrada = new Scanner(System.in);

        System.out.println(" cuantos Numeros quieres procesar ? ");
        int cantidad = entrada.nextInt();

        System.out.printf("\nProcesar %d " , cantidad);

        for (int i = 0; i < cantidad; i++) {
            System.out.printf("\n Dato %d \n", i);
            int num = entrada.nextInt();
            int resultado = num * 2;
            System.out.printf("\n Dato %d procesado: %d\n",i,resultado);

        }





    }
}