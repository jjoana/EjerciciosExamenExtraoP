package com.programacion2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

public class HexaToBinarioTest {
     HexaToBinario objeto = new HexaToBinario();

    @Test
    void DecimalToHexaTest() {
        objeto.DecimalToHexa(19);
        assertEquals("13", objeto.resultado);
    }

    @Test
    void DecimalToHexaTest2(){
        objeto.DecimalToHexa(418);
        assertEquals("1A2", objeto.resultado);
    }

    @Test
    void DecimalToHexaTest3(){
        objeto.DecimalToBinarioR(12);
        assertEquals(1100, objeto.resultadoR);
    }
}
