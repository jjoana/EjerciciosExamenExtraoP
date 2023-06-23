package com.programacion2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.CollationElementIterator;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {

        try {
            Tablero tablero = new Tablero();
            System.out.println("SIMULACIÓN CON TABLERO LEÍDO");
            tablero.leerEstadoActual();
            System.out.println(tablero);

            for (int i = 0; i <= 5; i++) {

                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();
                System.out.println(tablero);
            }

            System.out.println("SIMULACIÓN CON TABLERO GENERADO MEDIANTE MONTECARLO");
            tablero.generarEstadoActualPorMontecarlo();
            System.out.println(tablero);

            for (int i = 0; i <= 15; i++) {

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
    private int[][] estadoActual = new int[DIMENSION][DIMENSION];
    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];
    private String nombreFichero = "C:/Users/jesus/OneDrive/Universidad/EjercicioTemporal.txt";

    public void leerEstadoActual() {

        try {
            FileReader fileReader = new FileReader(nombreFichero);
            int fila = 0;
            int elemento;
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (fila < DIMENSION) {
                int columna = 0;
                while (columna < DIMENSION) {
                    elemento = bufferedReader.read();
                    if(elemento != 10 && elemento != 13){
                        estadoActual[fila][columna] = elemento;
                        columna++;
                    }
                }
                fila++;
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.addSuppressed(e);
        }
    }

    public void generarEstadoActualPorMontecarlo() {

    }

    public void transitarAlEstadoSiguiente() {
        int celdaEstadoActual;
        int celdaEstadoSiguiente;
        int celulasVivas;
        
    
        celulasVivas = 0;
        if(estadoActual[0][1] == 1){
            celulasVivas ++;
        }
        if(estadoActual[1][1] == 1){
            celulasVivas++;
        }
        if(estadoActual[1][0] == 1){
            celulasVivas++;
        }
        if(estadoActual[0][0] == 1 && celulasVivas == 2 || celulasVivas == 3){
            estadoSiguiente[0][0] = 1;
        } else if (estadoActual[0][0] == 0 && celulasVivas == 3){
            estadoSiguiente[0][0] = 1;
        } else {
            estadoSiguiente[0][0] = 0;
        }

    }

    @Override
    public String toString() {
        return ""; // Esta línea hay que modificarla.
    }

}
