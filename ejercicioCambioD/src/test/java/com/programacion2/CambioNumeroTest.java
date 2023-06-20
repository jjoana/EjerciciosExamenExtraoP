package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

public class CambioNumeroTest {

    CambioNumero objeto = new CambioNumero();

    @Test
    void cambioNumeroTest1() {
        objeto.cambioNumero(12);
        assertEquals(1100, objeto.resultado);
    }

    @Test
    void cambioNumeroTest2() {
        objeto.cambioNumero(0);
        assertEquals(0, objeto.resultado);
    }

    @Test
    void cambioNumeroTest3() {
        objeto.cambioNumero(1);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void cambioNumeroTest4() {
        objeto.cambioNumero(17);
        assertEquals(10001, objeto.resultado);
    }

    @Test
    void cambioNumeroTest5() {
        objeto.cambioNumero(23);
        assertEquals(10111, objeto.resultado);
    }


    @Test
    void binarioDecimalRTest1() {
        objeto.binarioDecimalR(100);
        assertEquals(4, objeto.resultado);
    }

    @Test
    void binarioDecimalRTest2() {
        objeto.binarioDecimalR(0);
        assertEquals(0, objeto.resultado);
    }

    @Test
    void cambioNumeroRTest3() {
        objeto.binarioDecimalR(1);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void cambioNumeroRTest4() {
        objeto.binarioDecimalR(10001);
        assertEquals(17, objeto.resultado);
    }

    @Test
    void binarioDecimalLAmbdaTest1() {
        objeto.cambioNumeroLambda(12);
        assertEquals(1100, objeto.resultado);
    }

    @Test
    void binarioDecimalLAmbdaTest2() {
        objeto.cambioNumeroLambda(0);
        assertEquals(0, objeto.resultado);
    }

    @Test
    void binarioDecimalLAmbdaTest3() {
        objeto.cambioNumeroLambda(1);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void binarioDecimalLAmbdaTest4() {
        objeto.cambioNumeroLambda(17);
        assertEquals(10001, objeto.resultado);
    }

}