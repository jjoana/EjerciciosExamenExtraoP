package com.programacion2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListaParTest {
    ListaPar objeto = new ListaPar();

    @Test
    void listaParTest() throws MiExcepcion{
        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        listaEsperada.add(8);
        listaEsperada.add(6);
        listaEsperada.add(4);
        listaEsperada.add(2);
        objeto.listaParR(8);
        assertEquals(listaEsperada, objeto.miLista);
    }

    @Test
    void listaParTest1() throws MiExcepcion{
        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        objeto.listaParR(0);
        assertEquals(listaEsperada, objeto.miLista);
    }

    @Test
    void listaParTest2() throws MiExcepcion{
        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        objeto.listaParR(1);
        assertEquals(listaEsperada, objeto.miLista);
    }


    @Test
    void listaParITest() throws MiExcepcion{
        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        listaEsperada.add(8);
        listaEsperada.add(6);
        listaEsperada.add(4);
        listaEsperada.add(2);
        objeto.listaParI(8);
        assertEquals(listaEsperada, objeto.miLista);
    }

    @Test
    void listaParITest1() throws MiExcepcion{
        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        objeto.listaParI(0);
        assertEquals(listaEsperada, objeto.miLista);
    }

    @Test
    void listaParITest2() throws MiExcepcion{
        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        objeto.listaParI(1);
        assertEquals(listaEsperada, objeto.miLista);
    }


    @Test
    void listaParLambdaTest() throws MiExcepcion{
        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        listaEsperada.add(8);
        listaEsperada.add(6);
        listaEsperada.add(4);
        listaEsperada.add(2);
        objeto.listaParLambda(8);
        assertEquals(listaEsperada, objeto.miLista);
    }

    @Test
    void listaParLambdaTest1() throws MiExcepcion{
        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        objeto.listaParLambda(0);
        assertEquals(listaEsperada, objeto.miLista);
    }

    @Test
    void listaParLambdaTest2() throws MiExcepcion{
        ArrayList<Integer> listaEsperada = new ArrayList<Integer>();
        objeto.listaParLambda(1);
        assertEquals(listaEsperada, objeto.miLista);
    }
}