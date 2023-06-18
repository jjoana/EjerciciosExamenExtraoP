package com.programacion2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    Fibonacci objeto = new Fibonacci();

    @Test
    void FibonacciR(){
        assertEquals(3, objeto.FibonacciR(4));
    }

    @Test
    void FibonacciRI(){
        assertEquals(1, objeto.FibonacciR(2));
    }

    @Test
    void FibonacciRII(){
        assertEquals(0, objeto.FibonacciR(0));
    }

    @Test
    void FibonacciLambda() {
        objeto.FibonacciLambda(4);
        assertEquals(3, objeto.resultado);
    }

    @Test
    void FibonacciLambdaI(){
        objeto.FibonacciLambda(2);
        assertEquals(1, objeto.resultado);
    }

    @Test
    void FibonacciLambdaII(){
        objeto.FibonacciLambda(0);
        assertEquals(0, objeto.resultado);
    }

    @Test
    void FibonacciI(){
        assertEquals(3, objeto.FibonacciI(4));
    }

    @Test
    void FibonacciI1(){
        assertEquals(1, objeto.FibonacciI(2));
    }


    @Test
    void FibonacciI2(){
        assertEquals(0, objeto.FibonacciI(0));
    }

    @Test
    void FibonacciI3(){
        assertEquals(1, objeto.FibonacciI(1));
    }



    


}
