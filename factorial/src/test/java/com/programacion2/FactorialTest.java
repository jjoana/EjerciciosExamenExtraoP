package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.jupiter.api.DisplayName;


public class FactorialTest {

    Factorial objeto = new Factorial();


    @Test
    void factorialRecursivoTest() throws MiExcepcion {
        assertEquals(1, objeto.factorialRecursivo(0));
    }

    @Test
    void factorialRecursivoTestI() throws MiExcepcion {
        assertEquals(1, objeto.factorialRecursivo(1));
    }

    @Test
    void factorialRecursivoTestII() throws MiExcepcion{
        assertEquals(24, objeto.factorialRecursivo(4));
    }

    @Test
    void factorialIteativo() throws MiExcepcion{
        objeto.factorialIterativo(0);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void factorialIteativoI() throws MiExcepcion{
        objeto.factorialLambda(1);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void factorialIteativoII() throws MiExcepcion{
        objeto.factorialLambda(4);
        assertEquals(24, objeto.resultado);
    }

    @Test
    void factorialLambda() throws MiExcepcion{
        objeto.factorialLambda(0);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void factorialLambdaI() throws MiExcepcion {
        objeto.factorialLambda(1);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void factorialLambdaII() throws MiExcepcion {
        objeto.factorialLambda(4);
        assertEquals(24, objeto.resultado);
    }


}
