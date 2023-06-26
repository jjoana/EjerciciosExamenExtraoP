package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

public class CambioNumeroTest {

    CambioNumero objeto = new CambioNumero();

    @Test
    void cambioNumeroTest1() {
        assertEquals(1100, objeto.cambioNumeroI(12));
    }

    @Test
    void cambioNumeroTest2() {
        assertEquals(101000, objeto.cambioNumeroI(40));
    }

    @Test
    void cambioNumeroTest3() {
        assertEquals(0, objeto.cambioNumeroI(0));
    }

    @Test
    void cambioNumeroTest4() {
        assertEquals(1, objeto.cambioNumeroI(1));
    }

    @Test
    void cambioNumeroRTest1() {
        assertEquals(1100, objeto.cambioNumeroR(12));
    }

    @Test
    void cambioNumeroRTest2() {
        assertEquals(101000, objeto.cambioNumeroR(40));
    }

    @Test
    void cambioNumeroRTest3() {
        assertEquals(0, objeto.cambioNumeroR(0));
    }

    @Test
    void cambioNumeroRTest4() {
        assertEquals(1, objeto.cambioNumeroR(1));
    }

    @Test
    void cambioNumeroTestRe() {
        assertEquals(1100, objeto.cambioNumeroRe(12,0));
    }   
}