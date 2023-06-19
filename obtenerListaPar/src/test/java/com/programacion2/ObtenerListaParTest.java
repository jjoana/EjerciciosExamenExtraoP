package com.programacion2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ObtenerListaParTest {
    ObtenerListaPar objeto = new ObtenerListaPar();

    @Test
    void obtenerListaParRTest() throws MiExcepcion{
        ArrayList<Integer> listaInicial = new ArrayList<Integer>();
        listaInicial.add(1);
        listaInicial.add(2);
        listaInicial.add(3);
        objeto.obtenerListaParR(listaInicial);

        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        listaEsperada.add(2);

        assertEquals(listaEsperada, objeto.listaTerminada);
    }


    @Test
    void obtenerListaParRTest1() throws MiExcepcion {
        ArrayList<Integer> listaInicial = new ArrayList<Integer>();
        listaInicial.add(1);
        listaInicial.add(3);
        listaInicial.add(5);
        objeto.obtenerListaParR(listaInicial);

        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();

        assertEquals(listaEsperada, objeto.listaTerminada);
    }


    @Test
    void obtenerListaParRTest2() throws MiExcepcion {
        ArrayList<Integer> listaInicial = new ArrayList<Integer>();
        objeto.obtenerListaParR(listaInicial);

        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();

        assertEquals(listaEsperada, objeto.listaTerminada);
    }


    @Test
    void obtenerListaParRTest3() throws MiExcepcion {
        ArrayList<Integer> listaInicial = new ArrayList<Integer>();
        listaInicial.add(2);
        listaInicial.add(4);
        listaInicial.add(6);
        objeto.obtenerListaParR(listaInicial);

        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        listaEsperada.add(2);
        listaEsperada.add(4);
        listaEsperada.add(6);

        assertEquals(listaEsperada, objeto.listaTerminada);
    }

    @Test
    void obtenerListaParITest() {
        ArrayList<Integer> listaInicial = new ArrayList<Integer>();
        listaInicial.add(2);
        listaInicial.add(4);
        listaInicial.add(6);
        objeto.obtenerListaParI(listaInicial);

        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        listaEsperada.add(2);
        listaEsperada.add(4);
        listaEsperada.add(6);

        assertEquals(listaEsperada, objeto.listaTerminada);
    }

    @Test
    void obtenerListaParITest1() {
        ArrayList<Integer> listaInicial = new ArrayList<Integer>();

        objeto.obtenerListaParI(listaInicial);

        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();


        assertEquals(listaEsperada, objeto.listaTerminada);
    }

    @Test
    void obtenerListaParITest2() {
        ArrayList<Integer> listaInicial = new ArrayList<Integer>();
        listaInicial.add(1);
        listaInicial.add(2);
        listaInicial.add(3);
        objeto.obtenerListaParI(listaInicial);

        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        listaEsperada.add(2);

        assertEquals(listaEsperada, objeto.listaTerminada);
    }

    @Test
    void obtenerListaParLambdaTest1() {
        ArrayList<Integer> listaInicial = new ArrayList<Integer>();
        listaInicial.add(1);
        listaInicial.add(2);
        listaInicial.add(3);
        objeto.obtenerListaParLambda(listaInicial);

        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        listaEsperada.add(2);

        assertEquals(listaEsperada, objeto.listaTerminada);
    }

    @Test
    void obtenerListaParLambdaTest2() {
        ArrayList<Integer> listaInicial = new ArrayList<Integer>();

        objeto.obtenerListaParLambda(listaInicial);

        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();


        assertEquals(listaEsperada, objeto.listaTerminada);
    }

    @Test
    void obtenerListaParLambdaTest3() {
        ArrayList<Integer> listaInicial = new ArrayList<Integer>();
        listaInicial.add(2);
        listaInicial.add(4);
        listaInicial.add(6);

        objeto.obtenerListaParLambda(listaInicial);

        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        listaEsperada.add(2);
        listaEsperada.add(4);
        listaEsperada.add(6);


        assertEquals(listaEsperada, objeto.listaTerminada);
    }

    

}
