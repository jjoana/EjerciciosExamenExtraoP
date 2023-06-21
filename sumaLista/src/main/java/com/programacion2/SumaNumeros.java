package com.programacion2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class SumaNumeros {

    int resultado = 0;

    public void sumaR(List<Integer> miLista) {
        if (!miLista.isEmpty()) {
            resultado += miLista.get(0);
            miLista.remove(0);
            sumaR(miLista);
        }

    }

    public void sumaIterativa(List<Integer> miLista) {
        for (int i = 0; i < miLista.size(); i++) {
            resultado += miLista.get(i);
        }
    }

    public void sumaLambda(List<Integer> miLista) {

        Consumer<List<Integer>> interF = (a) -> {
            if (!a.isEmpty()) {
                resultado += a.get(0);
                a.remove(0);
                sumaR(a);
            }
        };
        interF.accept(miLista);
    }
}
