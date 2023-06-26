package com.programacion2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class CambioMoneda {

    public static int cambioIterativo(int cambio, List<Integer> sistemaMonedas) {
        int resultado = 0;
        for (int i = 0; i < sistemaMonedas.size(); i++) {
            while (cambio > 0) {
                cambio -= sistemaMonedas.get(i);
                resultado++;
            }
        }
        return resultado;
    }

    public static int cambioRecursivo(int cambio, List<Integer> sistemaMonedas) {
        int[] resultado = new int[1];
        cambioRecursivo(cambio, 0, sistemaMonedas, resultado);
        return resultado[0];
    }

    private static void cambioRecursivo(int cambio, int i, List<Integer> sistemaMonedas, int resultado[]) {
        if (cambio > 0) {
            int elemento = sistemaMonedas.get(i);
            if (cambio >= elemento) {
                resultado[0] += cambio / sistemaMonedas.get(i);
                cambio = cambio % sistemaMonedas.get(i);
                cambioRecursivo(cambio, ++i, sistemaMonedas, resultado);
            } else {
                cambioRecursivo(cambio, ++i, sistemaMonedas, resultado);
            }
        }
    }

    public static int cambioLambda(int cambio, List<Integer> sistemaMonedas) {
        BiFunction<Integer, List<Integer>, Integer> interF = (a, b) -> {
            int resultado = 0;
            for (int i = 0; i < b.size(); i++) {
                while (a > 0) {
                    a -= b.get(i);
                    resultado++;
                }
            }
            return resultado;
        };
        return interF.apply(cambio, sistemaMonedas);
    }
}
