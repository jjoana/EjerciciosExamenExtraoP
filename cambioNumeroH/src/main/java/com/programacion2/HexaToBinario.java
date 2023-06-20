package com.programacion2;

public class HexaToBinario {

    long resultado = 0;
    int exponente = 0;

    public void hexadecimalToBinarioI(String elemento) {
        String digitos = "0123456789ABCDEF";

        int longitudElemento = elemento.length();

        for (int i = (longitudElemento -1) ; i >= 0; i--) {

            int valor = digitos.indexOf(elemento.charAt(i));
            resultado += valor * Math.pow(16, exponente++);
        }
    }
}
