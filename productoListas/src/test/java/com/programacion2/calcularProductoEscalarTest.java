package com.programacion2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;

@DisplayName ("Tests para la clase …")
public class calcularProductoEscalarTest {

    calcularProductoEscalar objeto = new calcularProductoEscalar();


    @Test
    void productoTestR() {
        ArrayList<Integer> primeraLista = new ArrayList<Integer>();
        primeraLista.add(3);
        primeraLista.add(2);

        ArrayList<Integer> segundaLista = new ArrayList<Integer>();
        segundaLista.add(2);
        segundaLista.add(3);
        objeto.productoR(primeraLista, segundaLista);
        assertEquals(12, objeto.resultado);
    }

    @Test
    void productoTestI() {
        ArrayList<Integer> primeraLista = new ArrayList<Integer>();
        primeraLista.add(3);
        primeraLista.add(2);

        ArrayList<Integer> segundaLista = new ArrayList<Integer>();
        segundaLista.add(2);
        segundaLista.add(3);
        objeto.productoIterativo(primeraLista, segundaLista);
        assertEquals(12, objeto.resultado);
    }

    @Test
    void productoLambdaTest() {
        ArrayList<Integer> primeraLista = new ArrayList<Integer>();
        primeraLista.add(3);
        primeraLista.add(2);

        ArrayList<Integer> segundaLista = new ArrayList<Integer>();
        segundaLista.add(2);
        segundaLista.add(3);
        objeto.productoLambda(primeraLista, segundaLista);
        assertEquals(12, objeto.resultado);
    }
}
