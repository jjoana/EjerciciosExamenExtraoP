package com.programacion2;

import java.util.function.Consumer;
import java.util.function.Function;

public class Factorial {
    int resultado = 1;

    public int factorialRecursivo(int n) {
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

    public void factorialLambda(int n) {
        Consumer<Integer> interF = (a) -> {
            if (n > 1) {
                resultado = n * factorialRecursivo(n - 1);
            }
        };
        
        interF.accept(n);
    }

}


