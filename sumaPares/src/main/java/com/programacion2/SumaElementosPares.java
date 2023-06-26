package com.programacion2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class SumaElementosPares {
    int resultado = 0;

    public void sumaParesR(List<Integer> lista) {
        if (!lista.isEmpty()) {
            resultado += lista.get(0);
            lista.remove(0);
            sumaParesR(lista);
        }

    }

    public void sumaParesI(List<Integer> lista) {
        while (! lista.isEmpty()) {
            if (lista.get(0) > 0) {
                resultado += lista.get(0);
                lista.remove(0);
            } else {
                lista.get(0);
            }
        }
    }

    public void sumaLambda(List<Integer> lista) {
        Consumer<List<Integer>> interF = (a) -> {
            if (!a.isEmpty()) {
                resultado += a.get(0);
                a.remove(0);
                sumaParesR(a);
            }
        };
        interF.accept(lista);
    }

}
