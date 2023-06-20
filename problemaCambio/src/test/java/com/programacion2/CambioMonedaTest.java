package com.programacion2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CambioMonedaTest {

    @Test
    void cambioMonedaTest1() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(3);
        miLista.add(2);
        miLista.add(1);
        
        assertEquals(2, CambioMoneda.cambioIterativo(5, miLista));
    }

    @Test
    void cambioMonedaTest2() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(3);
        miLista.add(2);
        miLista.add(1);
        
        assertEquals(0, CambioMoneda.cambioIterativo(0, miLista));
    }

    @Test
    void cambioMonedaTest3() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(3);
        miLista.add(2);
        miLista.add(1);
        
        assertEquals(1, CambioMoneda.cambioIterativo(1, miLista));
    }

    @Test
    void cambioMonedaTest4() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(6);
        miLista.add(4);
        miLista.add(2);
        miLista.add(1);

        
        assertEquals(3, CambioMoneda.cambioIterativo(13, miLista));
    }

    @Test
    void cambioMonedaRTest1() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(3);
        miLista.add(2);
        miLista.add(1);
        
        assertEquals(2, CambioMoneda.cambioRecursivo(5, miLista));
    }

    @Test
    void cambioMonedaRTest2() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(3);
        miLista.add(2);
        miLista.add(1);
        
        assertEquals(0, CambioMoneda.cambioRecursivo(0, miLista));
    }

    @Test
    void cambioMonedaRTest3() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(3);
        miLista.add(2);
        miLista.add(1);
        
        assertEquals(1, CambioMoneda.cambioRecursivo(1, miLista));
    }

    @Test
    void cambioMonedaRTest4() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(6);
        miLista.add(4);
        miLista.add(2);
        miLista.add(1);

        assertEquals(3, CambioMoneda.cambioRecursivo(13, miLista));
    }


    @Test
    void cambioLambdaTest1() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(2);
        miLista.add(3);
        miLista.add(1);
        Collections.sort(miLista, Comparator.reverseOrder());
        assertEquals(2, CambioMoneda.cambioLambda(5, miLista));
        
    }

    @Test
    void cambioLambdaTest2() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(2);
        miLista.add(3);
        miLista.add(1);

        assertEquals(0, CambioMoneda.cambioLambda(0, miLista));
        Collections.sort(miLista, Comparator.reverseOrder());
    }

    @Test
    void cambioLambdaTest3() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(3);
        miLista.add(2);
        miLista.add(1);
        
        assertEquals(1, CambioMoneda.cambioLambda(1, miLista));
    }

    @Test
    void cambioLambdaTest4() {

        ArrayList<Integer> miLista = new ArrayList<Integer>();
        miLista.add(6);
        miLista.add(4);
        miLista.add(2);
        miLista.add(1);

        assertEquals(3, CambioMoneda.cambioLambda(13, miLista));
    }
}
