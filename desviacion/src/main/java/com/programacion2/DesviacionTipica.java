package com.programacion2;

import java.util.ArrayList;
import java.util.List;

public class DesviacionTipica {



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
    
    private double desviacionTipicaR(List<Double> miLista, int tamano, double media){
        double resultado = 0;
        double valor = 0;

        if(!miLista.isEmpty()){
            valor = miLista.get(0);
            miLista.remove(0);
            resultado += Math.pow((valor - media),2)/ tamano + desviacionTipicaR(miLista, tamano, media);
        }
        return resultado;
    }

    public double DesviacionTipicaR(int tamano, List<Double> miLista){

        ArrayList<Double> copiaLista = new ArrayList<>(miLista);
        double media = mediaAritmeticaR(tamano, copiaLista);

        copiaLista = new ArrayList<>(miLista);
        double intermedio = desviacionTipicaR(copiaLista, tamano, media);
        double desviacion = Math.sqrt(intermedio);
        return desviacion;
    }
}
