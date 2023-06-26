package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;

@DisplayName ("Tests para la clase …")
public class DesviacionTipicaTest {

    DesviacionTipica objeto = new DesviacionTipica();

    @Test
    void mediaAritmeticaR1(){
        ArrayList<Float> elementosLista = new ArrayList<Float>();
        elementosLista.add(3f);
        elementosLista.add(2f);
        elementosLista.add(1f);

        assertEquals(2.0, objeto.MediaAritmeticR(elementosLista), 0.1);
    }

    @Test
    void mediaAritmeticaR2(){
        ArrayList<Float> elementosLista = new ArrayList<Float>();
        elementosLista.add(0f);

        assertEquals(0.0, objeto.MediaAritmeticR(elementosLista), 0.1);
    }

    @Test
    void mediaAritmeticaR3(){
        ArrayList<Float> elementosLista = new ArrayList<Float>();
        elementosLista.add(1f);

        assertEquals(1.0, objeto.MediaAritmeticR(elementosLista), 0.1);
    }

    @Test
    void desviacionTipica(){
        ArrayList<Float> elementosLista = new ArrayList<Float>();
        elementosLista.add(3f);
        elementosLista.add(2f);
        elementosLista.add(1f);

        assertEquals(0.81, objeto.desviacionTipica(elementosLista), 0.1);
    }

    @Test
    void desviacionTipica2(){
        ArrayList<Float> elementosLista = new ArrayList<Float>();
        elementosLista.add(0f);

        assertEquals(0.0, objeto.desviacionTipica(elementosLista), 0.1);
    }

    @Test
    void desviacionTipica3(){
        ArrayList<Float> elementosLista = new ArrayList<Float>();
        elementosLista.add(1f);

        assertEquals(0.0, objeto.desviacionTipica(elementosLista), 0.1);
    }

    @Test
    void mediaAritmeticaI(){
        ArrayList<Float> elementosLista = new ArrayList<Float>();
        elementosLista.add(3f);
        elementosLista.add(2f);
        elementosLista.add(1f);

        assertEquals(2.0, objeto.MediaAritmeticI(3,elementosLista), 0.1);
    }

    @Test
    void mediaAritmeticaI1(){
        ArrayList<Float> elementosLista = new ArrayList<Float>();
        elementosLista.add(1f);

        assertEquals(1.0, objeto.MediaAritmeticI(1,elementosLista), 0.1);
    }

    @Test
    void mediaAritmeticaI2(){
        ArrayList<Float> elementosLista = new ArrayList<Float>();

        assertEquals(0.0, objeto.MediaAritmeticI(1,elementosLista), 0.1);
    }
}