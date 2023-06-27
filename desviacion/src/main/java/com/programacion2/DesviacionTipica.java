package com.programacion2;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.MidiChannel;

public class DesviacionTipica {

    private double tamano(List<Float> miLista) {
        return miLista.size();
    }

    public float MediaAritmeticI(double tamanoLista, List<Float> miLista) {
        float resultado = 0;
        while (!miLista.isEmpty()) {
            resultado += miLista.get(0) / tamanoLista;
            miLista.remove(0);
        }
        return resultado;
    }

    private float MediaAritmeticR(double tamanoLista, List<Float> miLista) {
        float resultado = 0;
        while(!miLista.isEmpty()){
            resultado += miLista.get(0) / tamanoLista;
            miLista.remove(0);
            MediaAritmeticR(tamanoLista, miLista);
        }
        return resultado;
    }

    private float desviacionTipica(double tamanoLista, List<Float> miLista, float media) {
        float resultado = 0f;
        if (!miLista.isEmpty()) {
            float valor = (float) ((float) Math.pow((double) (miLista.get(0) - media), 2.0) / tamanoLista);
            miLista.remove(0);
            resultado += valor + desviacionTipica(tamanoLista, miLista, media);
        }
        return resultado;
    }

    public float desviacionTipica(List<Float> miLista) {
        double tamanoLista = tamano(miLista);

        ArrayList<Float> copiaLista = new ArrayList<Float>();
        copiaLista = new ArrayList<>(miLista);
        float media = MediaAritmeticR(tamanoLista, copiaLista);

        float desviacionSinRaiz = desviacionTipica(tamanoLista, miLista, media);
        float resultado = (float) Math.sqrt(desviacionSinRaiz);
        return resultado;
    }

    public float MediaAritmeticR(List<Float> miLista) {
        double tamanoLista = tamano(miLista);

        float media = MediaAritmeticR(tamanoLista, miLista);
        return media;
    }
}
