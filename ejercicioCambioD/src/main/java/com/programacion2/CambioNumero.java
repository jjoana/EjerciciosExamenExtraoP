package com.programacion2;

import java.util.function.Consumer;

public class CambioNumero {

    public int cambioNumeroI(int numero) {
        int resultado = 0;
        int exponente = 0;

        while (numero > 0) {
            resultado += (numero % 2) * (Math.pow(10, exponente++));
            numero = numero / 2;
        }
        return resultado;
    }

    public int cambioNumeroRe(int numero, int exponente) {
        int resultado = 0;

        if (numero > 0) {
            double valor = (numero % 2) * (Math.pow(10, exponente));
            numero = numero / 2;
            resultado += valor + cambioNumeroRe(numero, exponente + 1);
        }
        return resultado;
    }

    public int cambioNumeroR(int numero) {
        return cambioNumeroRecursivo(numero, 0);
    }

    private int cambioNumeroRecursivo(int numero, int exponente) {
        if (numero < 2) {
            return numero * (int) Math.pow(10, exponente);
        }

        int resto = numero % 2;
        int primer_paso = resto * (int) Math.pow(10, exponente);
        int nuevoNumero = numero / 2;

        return primer_paso + cambioNumeroRecursivo(nuevoNumero, exponente + 1);
    }
}