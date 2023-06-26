package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;

@DisplayName ("Tests para la clase …")
public class SumaDosListasTest {

    SumaDosListas objeto = new SumaDosListas();

    @Test
    void sumaListaTestR() {
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        objeto.sumaListasR(lista1, lista2);
        assertEquals(0, objeto.resultado);
    }

    @Test
    void sumaListaTestR2() {
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        lista1.add(0);
        lista1.add(1);

        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(0);
        lista2.add(1);
        objeto.sumaListasR(lista1, lista2);
        assertEquals(2, objeto.resultado);
    }

    @Test
    void sumaListaTestR1() {
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(3);
        lista2.add(1);
        lista2.add(4);
        objeto.sumaListasR(lista1, lista2);
        assertEquals(14, objeto.resultado);
    }

    @Test
    void sumaListasTestI() {
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(3);
        lista2.add(1);
        lista2.add(4);
        objeto.sumaListasI(lista1, lista2);
        assertEquals(14, objeto.resultado);
    }


    
}