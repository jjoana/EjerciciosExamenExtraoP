package com.programacion2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ObtenerListaPar {
    int elemento = 0;

    List<Integer> listaTerminada = new ArrayList<Integer>();

    public void obtenerListaParR(ArrayList<Integer> miLista) throws MiExcepcion {
        if (!miLista.isEmpty()) {
            elemento = miLista.get(0);
            if (elemento >=2 ) {
                if (elemento % 2 == 0) {
                    listaTerminada.add(elemento);
                    miLista.remove(0);
                    obtenerListaParR(miLista);
                } else {
                    miLista.remove(0);
                    obtenerListaParR(miLista);
                }
            } else if (elemento < 2) {
                throw new MiExcepcion();
            }
        }
    }

    public void obtenerListaParI(ArrayList<Integer> miLista) {
        while (!miLista.isEmpty()) {
            elemento = miLista.get(0);
            if (elemento % 2 == 0) {
                listaTerminada.add(elemento);
                miLista.remove(0);
            } else {
                miLista.remove(0);
            }
        }
    }

    public void obtenerListaParLambda(ArrayList<Integer> miLista) {
        Consumer<ArrayList<Integer>> interF = (a) -> {
            if (!miLista.isEmpty()) {
            elemento = miLista.get(0);
            if (elemento % 2 == 0) {
                    listaTerminada.add(elemento);
                    miLista.remove(0);
                    obtenerListaParLambda(miLista);
                } else {
                    miLista.remove(0);
                    obtenerListaParLambda(miLista);
                }
            }
        };
        interF.accept(miLista);
    }
}

class MiExcepcion extends Exception {

}
