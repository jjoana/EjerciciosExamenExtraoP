package com.programacion2;

import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MediaAritmetica {

    List<Double> lista = new ArrayList<Double>();

    public double mediaAritmeticaR(int tamano, List<Double> miLista) {
        double valor = 0;

        if (!miLista.isEmpty()) {
            valor = miLista.get(0) / tamano;
            miLista.remove(0);
            if (tamano > 1) {
                valor += mediaAritmeticaR(tamano, miLista);
            }
        }
        return valor;
    }

    public double mediaAritmeticaI(int tamano, List<Double> miLista) {
        double valor = 0;

        while (!miLista.isEmpty()) {
            if (tamano > 1) {
                valor += miLista.get(0) / tamano;
                miLista.remove(0);
            }
        }
        return valor;
    }

    public double mediaAritmeticaLambda(int tamano, List<Double> miLista) {
        BiFunction<Integer, List<Double>, Double> interF = (a, b) -> {
            double valor = 0;
            
            if (!b.isEmpty()) {
                valor = b.get(0) / a;
                b.remove(0);
                if (a > 1) {
                    valor += mediaAritmeticaR(a, b);
                }
            }
            return valor;

        };
        return interF.apply(tamano, miLista);
    }
}
