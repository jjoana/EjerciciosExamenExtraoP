package com.programacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.jupiter.api.DisplayName;


public class FactorialTest {

    Factorial objeto = new Factorial();


    @Test
    void factorialRecursivoTest() {
        assertEquals(1, objeto.factorialRecursivo(0));
    }

    @Test
    void factorialRecursivoTestI() {
        assertEquals(1, objeto.factorialRecursivo(1));
    }

    @Test
    void factorialRecursivoTestII(){
        assertEquals(24, objeto.factorialRecursivo(4));
    }

    @Test
    void factorialIteativo(){
        objeto.factorialIterativo(0);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void factorialIteativoI(){
        objeto.factorialLambda(1);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void factorialIteativoII(){
        objeto.factorialLambda(4);
        assertEquals(24, objeto.resultado);
    }

    @Test
    void factorialLambda() {
        objeto.factorialLambda(0);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void factorialLambdaI() {
        objeto.factorialLambda(1);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void factorialLambdaII() {
        objeto.factorialLambda(4);
        assertEquals(24, objeto.resultado);
    }


}
