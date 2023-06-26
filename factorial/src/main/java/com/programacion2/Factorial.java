package com.programacion2;

import java.util.function.Consumer;
import java.util.function.Function;

public class Factorial {
    int resultado = 1;

    public int factorialRecursivo(int n) throws MiExcepcion{
        if (n > 1) {
            resultado = n * factorialRecursivo(n - 1);
        }
        return resultado;
    }

    public void factorialIterativo(int n) {
        for (int i = n; i > 0; i--) {
            resultado *= i;
        }
    }

    public void factorialLambda(int n) throws MiExcepcion {
        Consumer<Integer> interF = (a) -> {
            if (n > 1) {
                try {
                    resultado = n * factorialRecursivo(n - 1);
                } catch (MiExcepcion e) {
                    System.out.println("Error");
                }
            }
        };
        
        interF.accept(n);
    }
    
}

class MiExcepcion extends Exception {

}



