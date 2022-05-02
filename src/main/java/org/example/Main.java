package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sentencias condicionales en Java - # 9");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora de propinas");
        System.out.println("Ingresa la cantidad a pagar");
        double cantidad = entrada.nextDouble();
        System.out.println("ingresa el % de propina");
        int porcentaje = entrada.nextInt();


        if (porcentaje < 15){
            System.out.println("el Servicio no fue muy bueno");

        }else if(15 < porcentaje  && porcentaje <30){
            System.out.println("el Servicio fue muy bueno");
        }else if(30 < porcentaje && porcentaje <60){
            System.out.println("el Servicio fue bueno");
        }else{
            System.out.println("el servicio fue Excelente");
        }

        double total = cantidad + (cantidad * porcentaje / 100);
        System.out.printf("> El total es %.1f",total);





    }
}