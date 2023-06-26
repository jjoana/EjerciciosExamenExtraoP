package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class IntegralTest {

    Integral objeto = new Integral();

    @Test
    void sumaNumeroRTest() {
        assertEquals(1, objeto.integralEXCuadrado(0, 1, 1));
    }

    @Test
    void sumaNumeroRTest2(){
        assertEquals(58, objeto.integralEXCuadrado(0, 3, 1), 1);
    }

    @Test
    void sumaNumeroRTest3() {
        assertEquals(0, objeto.integralEXCuadrado(0, 0, 1));
    }

    @Test
    void sumaNumeroRTest4() {
        assertEquals(3.71, objeto.integralEXCuadrado(0, 2, 1), 0.1);
    }

    


}
