package com.programacion2;

import java.text.CollationElementIterator;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {

        try {
            Tablero tablero = new Tablero();
            System.out.println("SIMULACIÓN CON TABLERO LEÍDO");
            tablero.leerEstadoActual();
            System.out.println(tablero);

            for(int i = 0; i <= 5; i++){

                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();
                System.out.println(tablero);
            }

            System.out.println("SIMULACIÓN CON TABLERO GENERADO MEDIANTE MONTECARLO");
            tablero.generarEstadoActualPorMontecarlo();
            System.out.println(tablero);

            for(int i = 0; i <= 15; i++){

                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();
                System.out.println(tablero);

            }

        } catch (InterruptedException e) {

            System.out.println(e);
        }
    }
}

class Tablero {

    private static int DIMENSION = 30;
    private int[][] estadoActual;
    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];
    String nombreFichero = "C:/Users/jesus/OneDrive/Universidad/EjercicioTemporal.txt";

    public void leerEstadoActual() {
        int fila = 0;
        while (fila < DIMENSION) {
            int columna = 0;
            while(columna < DIMENSION){
                if() {
                    estadoActual[fila][columna] = 1;

                } else{
                    estadoActual[fila][columna] = 0;
                }
                columna ++;
            }
            fila ++;
        }
    }

    public void generarEstadoActualPorMontecarlo() {

    }

    public void transitarAlEstadoSiguiente() {

    }

    @Override
    public String toString() {
        return ""; // Esta línea hay que modificarla.
    }

}
