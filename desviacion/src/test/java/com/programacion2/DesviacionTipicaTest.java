package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;

@DisplayName ("Tests para la clase …")
public class DesviacionTipicaTest {

    DesviacionTipica objeto = new DesviacionTipica();

    @Test
    void desviacionTipicaTestR() {
        ArrayList<Double> elementosLista = new ArrayList<Double>();
        elementosLista.add(3.0);
        elementosLista.add(2.0);
        elementosLista.add(1.0);

        assertEquals(0.81, objeto.DesviacionTipicaR(3, elementosLista),0.1);
    }

    @Test
    void desviacionTipicaTestR1() {
        ArrayList<Double> elementosLista = new ArrayList<Double>();
        elementosLista.add(0.0);

        assertEquals(0.0, objeto.DesviacionTipicaR(1, elementosLista),0.1);
    }

    @Test
    void desviacionTipicaTestR2() {
        ArrayList<Double> elementosLista = new ArrayList<Double>();
        elementosLista.add(1.0);

        assertEquals(0.0, objeto.DesviacionTipicaR(1, elementosLista),0.1);
    }

    @Test
    void desviacionTipicaTestR3() {
        ArrayList<Double> elementosLista = new ArrayList<Double>();
        elementosLista.add(6.0);
        elementosLista.add(4.0);
        elementosLista.add(2.0);

        assertEquals(1.63, objeto.DesviacionTipicaR(3, elementosLista),0.1);
    }


    
}
