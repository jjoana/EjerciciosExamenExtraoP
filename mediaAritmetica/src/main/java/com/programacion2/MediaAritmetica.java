package com.programacion2;


import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.List;

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
}

