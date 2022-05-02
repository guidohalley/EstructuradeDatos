package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Estructura de Datos");
        System.out.println("Variables en Java - #6");

        int pizzas = 6 ;
        int personas = 3;
        int pizzaPorPersonas = pizzas / personas;

        System.out.printf("Si hay %d pizzas, y %d personas, a cada persona le corresponde %d pizzas "
                , pizzas, personas, pizzaPorPersonas);

        String auto = "Ferrari";
        double velocidad = 90.3;
        System.out.printf("\n\n El auto %s se desplaza a %f km/h", auto, velocidad);

        int precioLeche = 15;
        double precioJamon = 35.6;
        int precioHuevo = 23;

        double precioTotal = precioLeche + precioJamon + precioHuevo;

        System.out.printf("El precio total es >  %f\n",precioTotal);
        }
}
