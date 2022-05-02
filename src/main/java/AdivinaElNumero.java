import java.util.Scanner;

public class AdivinaElNumero {
    //private Scanner entrada = new Scanner(System.in);
    private boolean juegoActivo = true;


    public void jugar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola, cual es tu nombre ?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar \n", nombreJugador);


        while (juegoActivo) {

            int intentos = 0;
            int min = 0;
            int max = 100;

            int numeroJuego = (int) (Math.random() * ((max - min) + 1));

            System.out.printf("%s, he escogido un numero entre %d y %d, adivinalo", nombreJugador, max, min);
            int numeroJugador;
            do {
                System.out.println("\nEscoge un numero");
                numeroJugador = entrada.nextInt();

                if (numeroJuego < numeroJugador) {
                    System.out.println("Muy alto, adivina otra vez");

                } else if (numeroJuego > numeroJugador) {
                    System.out.println("Muy bajo, adivina otra vez");
                    intentos++;
                }
                intentos++;
            } while (numeroJuego != numeroJugador) ;

            System.out.println("Has ganado, lo hiciste en %d intentos",intentos);

            juegoActivo = false;
        }
    }
}
