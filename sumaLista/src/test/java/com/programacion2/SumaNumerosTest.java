package com.programacion2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;

@DisplayName ("Tests para la clase …")
public class SumaNumerosTest {

    SumaNumeros objeto = new SumaNumeros();

    @Test
    void SumaRTest() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(1);
        miLista.add(2);
        objeto.sumaR(miLista);
        assertEquals(3, objeto.resultado);

    }

    @Test
    void SumaRTest1() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        objeto.sumaR(miLista);
        assertEquals(6, objeto.resultado);
    }

    @Test
    void SumaRTest2() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        objeto.sumaR(miLista);
        assertEquals(0, objeto.resultado);

    }

    @Test
    void SumaITest() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(1);
        miLista.add(2);
        objeto.sumaIterativa(miLista);
        assertEquals(3, objeto.resultado);

    }

    @Test
    void SumaITest1() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        objeto.sumaIterativa(miLista);
        assertEquals(6, objeto.resultado);
    }

    @Test
    void SumaITest2() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        objeto.sumaIterativa(miLista);
        assertEquals(0, objeto.resultado);

    }


    @Test
    void SumaLambdaTest() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(1);
        miLista.add(2);
        objeto.sumaLambda(miLista);
        assertEquals(3, objeto.resultado);

    }

    @Test
    void SumaLambdaTest1() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        objeto.sumaLambda(miLista);
        assertEquals(6, objeto.resultado);
    }

    @Test
    void SumaLambdaTest2() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        objeto.sumaLambda(miLista);
        assertEquals(0, objeto.resultado);

    }

    
    
}