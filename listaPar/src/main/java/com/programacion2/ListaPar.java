package com.programacion2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.swing.text.html.parser.Element;

public class ListaPar {

    List<Integer> miLista = new ArrayList<Integer>();

    public void listaParR(int n) throws MiExcepcion {
        int elemento = n;
        if (elemento >= 2) {
            if (elemento % 2 == 0) {
                miLista.add(elemento);
                listaParR(elemento - 1);
            } else {
                listaParR(elemento - 1);
            }
        }
    }

    public void listaParI(int n) throws MiExcepcion {
        int elemento = n;
        while (elemento >= 2) {
            if (elemento % 2 == 0) {
                miLista.add(elemento);
                elemento--;
            } else {
                elemento--;
            }
        }
    }

    public void listaParLambda(int n) throws MiExcepcion {
        Consumer<Integer> interF = (a) -> {
            int elemento = a;
            while (elemento>= 2) {
                if (elemento % 2 == 0) {
                    miLista.add(elemento);
                    elemento--;
                } else {
                    elemento--;
                }
            }
        };
        interF.accept(n);

    }
}

class MiExcepcion extends Exception {

}
