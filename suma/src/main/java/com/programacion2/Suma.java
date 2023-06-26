package com.programacion2;

public class Suma {
    public int resultado = 0;

    public int sumaNumeroR(int n) throws MiExcepcion {
        if (n < 0) {
            throw new MiExcepcion();
        }
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            n += sumaNumeroR(n -1);
        }
        return n;
    }

    public void sumaNumeroRI(int n) throws MiExcepcion {
        if (n == 0) {
        } else if (n > 0) {
            resultado = n + sumaNumeroR(n - 1);
        }
    }

    public int sumaNumeroI(int n) throws MiExcepcion {
        for (int i = n; i > 0; i--) {
            resultado += i;
        }
        return resultado;
    }

    public int sumaNumeroLambda(int n) {
        MiInterfaz interF = (a) -> {
            for (int i = a; i > 0; i--) {
                resultado += i;
            }
            return resultado;
        };
        return (interF.apply(n));
    }
}

@FunctionalInterface
interface MiInterfaz {
    int apply(int n);
}

class MiExcepcion extends Exception {

}
