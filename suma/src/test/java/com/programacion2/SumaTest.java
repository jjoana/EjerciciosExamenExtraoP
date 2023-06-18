package com.programacion2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class SumaTest {

    Suma objeto = new Suma();

    @Test
    void SumaRecursivoTest() throws MiExcepcion{
        assertEquals(10, objeto.sumaNumeroR(4));
    }
    
    @Test
    void SumaRecursivoTestI() throws MiExcepcion{
        assertEquals(10, objeto.sumaNumeroR(4));
    }

    @Test
    void SumaNumeroRTestIII() throws MiExcepcion{
        assertThrows(MiExcepcion.class, ()-> {
            objeto.sumaNumeroR(-2);
        });
    }

    @Test
    void sumaIterativoTest() throws MiExcepcion{
        assertEquals(0, objeto.sumaNumeroI(0));
    }
    
    @Test
    void SumaLambdaTest() {
        assertEquals(10, objeto.sumaNumeroLambda(4));
    }
}
