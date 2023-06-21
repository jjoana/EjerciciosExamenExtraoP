package com.programacion2;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class calcularProductoEscalar {
    int resultado = 0;

    public void productoR(List<Integer> lista1, List<Integer> lista2) {
        if (!lista1.isEmpty()) {
            if (!lista2.isEmpty()) {
                resultado += lista1.get(0) * lista2.get(0);
                lista1.remove(0);
                lista2.remove(0);
                productoR(lista1, lista2);
            }
        }
    }

    public void productoIterativo(List<Integer> lista1, List<Integer> lista2) {
        while (!lista1.isEmpty()) {
            while (!lista2.isEmpty()) {
                for (int i = 0; i < lista1.size(); i++) {
                    resultado += lista1.get(i) * lista2.get(i);
                    lista1.remove(i);
                    lista2.remove(i);
                }
            }
        }
    }

    public void productoLambda(List<Integer> lista1, List<Integer> lista2) {
        BiConsumer<List<Integer>, List<Integer>> interF = (a, b) -> {

            if (!a.isEmpty()) {
                if (!b.isEmpty()) {
                    resultado += a.get(0) * b.get(0);
                    a.remove(0);
                    b.remove(0);
                    productoR(a, b);
                }
            }
        };
        interF.accept(lista1, lista2);
    }
}
