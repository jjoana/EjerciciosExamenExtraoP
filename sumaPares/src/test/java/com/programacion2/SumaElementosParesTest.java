package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;

@DisplayName ("Tests para la clase …")
public class SumaElementosParesTest {

    SumaElementosPares objeto = new SumaElementosPares();

    @Test
    void SumaParesTest() {
        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(3);
        miLista.add(2);
        miLista.add(1);
        objeto.sumaParesR(miLista);
        assertEquals(2, objeto.resultado);
    }

    @Test
    void SumaParesTest1() {
        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(1);
        objeto.sumaParesR(miLista);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void SumaParesTest2() {
        ArrayList<Integer> miLista = new ArrayList<Integer>();
        objeto.sumaParesR(miLista);
        assertEquals(0, objeto.resultado);
    }

    @Test
    void SumaParesITest() {
        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(3);
        miLista.add(2);
        miLista.add(1);
        objeto.sumaParesI(miLista);
        assertEquals(6, objeto.resultado);
    }

    @Test
    void SumaParesITest1() {
        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(1);
        objeto.sumaParesI(miLista);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void SumaParesITest2() {
        ArrayList<Integer> miLista = new ArrayList<Integer>();
        objeto.sumaParesI(miLista);
        assertEquals(0, objeto.resultado);
    }

    @Test
    void SumaParesLambdaTest() {
        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(3);
        miLista.add(2);
        miLista.add(1);
        objeto.sumaLambda(miLista);
        assertEquals(6, objeto.resultado);
    }

    @Test
    void SumaParesLambdaTest1() {
        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(1);
        objeto.sumaLambda(miLista);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void SumaParesLambdaTest2() {
        ArrayList<Integer> miLista = new ArrayList<Integer>();
        objeto.sumaLambda(miLista);
        assertEquals(0, objeto.resultado);
    }

}
