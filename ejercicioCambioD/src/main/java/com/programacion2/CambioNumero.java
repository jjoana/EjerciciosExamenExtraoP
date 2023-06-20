package com.programacion2;

import java.util.function.Consumer;

public class CambioNumero {

    int resultado = 0;
    int exponente = 0;
    int resto = 0;

    public void cambioNumero(int numero) {

        while (numero >= 2) {
            resultado += (numero % 2) * (Math.pow(10, exponente++));
            numero = numero / 2;
        }
        if (numero < 2) {
            resultado += (numero) * (Math.pow(10, exponente));
        }
    }

    public void binarioDecimalR(int numero) {
        if (numero != 0) {
            resto = numero % 10;
            resultado += resto * (Math.pow(2, exponente++));
            numero /= 10;
            binarioDecimalR(numero);
        }
    }

    public void cambioNumeroLambda(int numero) {
        Consumer<Integer> interF = (a) -> {
            while (a >= 2) {
                resultado += (a % 2) * (Math.pow(10, exponente++));
                a = a / 2;
            }
            if (a < 2) {
                resultado += (a) * (Math.pow(10, exponente));
            }

        };

        interF.accept(numero);
    }

}