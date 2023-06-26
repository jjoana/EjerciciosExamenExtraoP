package com.programacion2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

public class HexaToBinarioTest {
     HexaToBinario objeto = new HexaToBinario();

    @Test
    void HexaToDeciTest() {
        objeto.hexadecimalToBinarioI("13");
        assertEquals(19, objeto.resultado);
    }

    @Test
    void HexaToDeciTest1(){
        objeto.hexadecimalToBinarioI("1A2");
        assertEquals(418, objeto.resultado);
    }

    @Test
    void HexaToDeciTest2(){
        objeto.hexadecimalToBinarioI("1AB3");
        assertEquals(6835, objeto.resultado);
    }

    @Test
    void HexaToDeciTest3(){
        objeto.hexadecimalToBinarioI("FE05");
        assertEquals(65029, objeto.resultado);
    }

    @Test
    void HexaToDeciTest4(){
        objeto.hexadecimalToBinarioI("0");
        assertEquals(0, objeto.resultado);
    }
    

    @Test
    void DecimalToBinario(){
        objeto.DecimalToBinarioR(0);
        assertEquals(0, objeto.resultado);
    }

    @Test
    void DecimalToBinario1(){
        objeto.DecimalToBinarioR(19);
        assertEquals(10011, objeto.resultado);
    }

    @Test
    void DecimalToBinario2(){
        objeto.DecimalToBinarioR(20);
        assertEquals(10100, objeto.resultado);
    }

    @Test
    void DecimalToBinario3(){
        objeto.DecimalToBinarioR(100);
        assertEquals(1100100, objeto.resultado);
    }

    @Test
    void DecimalToHexaTest() {
        objeto.DecimalToHexa(19);
        assertEquals("013", objeto.resultado);
    }

    @Test
    void DecimalToHexaTest2(){
        objeto.DecimalToHexa(418);
        assertEquals("01A2", objeto.resultado);
    }
}
