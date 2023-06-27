package com.programacion2;

public class HexaToBinario {

    String resultado = "";
    int exponente = 0;
    int resultadoR = 0;
    static String digitos = "0123456789ABCDEF";

    public void hexadecimalToBinarioI(String elemento) {
        int longitudElemento = elemento.length();
        
        for (int i = (longitudElemento - 1); i >= 0; i--) {
            int valor = digitos.indexOf(elemento.charAt(i));
            resultado += valor * Math.pow(16, exponente++);
        }
    }

    public void DecimalToHexa(int elemento) {
        if (elemento > 0) {
            int cifra = elemento % 16;
            elemento = elemento / 16;
            DecimalToHexa(elemento);
            resultado += digitos.charAt(cifra);
        }
    }
    
    public void DecimalToBinarioR(int elemento) {
        if (elemento > 0) {
            resultadoR += (elemento % 2) * Math.pow(10, exponente++);
            elemento = elemento / 2;
            DecimalToBinarioR(elemento);
        }
    }
}
