package com.programacion2;

import java.util.function.Function;

public class Fibonacci {
    int resultado = 0;
    public Integer resutado;

    public int FibonacciR(int n) {
        if (n == 0) {
            return 0;
        } else {
            if (n == 1) {
                return 1;
            } else {
                resultado = FibonacciR(n - 1) + FibonacciR(n - 2);
            }
        }
        return resultado;
    }

    public int FibonacciI(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {       
            int antepenultimo = 0;
            int penultimo = 1;
            for (int i = 2; i <= n; i++) {
                resultado = penultimo + antepenultimo;
                antepenultimo = penultimo;
                penultimo = resultado;
            }

        }
        return resultado;

    }

    public int FibonacciLambda(int n) {
        Function<Integer, Integer> interF = (a) -> {
            if (n == 0) {
                return 0;
            } else {
                if (n == 1) {
                    return 1;
                } else {
                    resultado = FibonacciR(n - 1) + FibonacciR(n - 2);
                }
            }
            return resultado;
        };
        return (interF.apply(n));
    }

}
