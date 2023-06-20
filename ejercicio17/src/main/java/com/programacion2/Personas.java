package com.programacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Personas {

    List<Persona> lista = new ArrayList<Persona>();

    public void annadirPersona(Persona persona) {
        lista.add(persona);
    }

    public Persona elMasJoven() {

        MiInterf valor = (personas) -> {
            Persona objeto = new Persona();
            long edadInicial = 150;
            // Seleccionamos el primer elemento de la lista
            for (Persona seleccion : personas.lista) {
                try {
                    if (seleccion.calcularEdad() < edadInicial) {
                        edadInicial = seleccion.calcularEdad();
                        objeto = seleccion;
                    }
                } catch (MiExcepcion e) {
                    System.out.println("Ha ocurrido un error");
                }
            }
            return objeto;
        };
        return (valor.apply(this));
    }

    public long calcularSumaEdades() {
        MiInterf2 valor = (personas) -> {
            int resultado = 0;
            for (Persona seleccion : lista) {
                try {
                    resultado += seleccion.calcularEdad();
                } catch (MiExcepcion e) {
                    System.out.println("Ha ocurrido un error");
                }
            }
            return resultado;
        };
        return (valor.apply(this));
    }
}   
@FunctionalInterface
interface MiInterf {

    Persona apply(Personas personas);
}

@FunctionalInterface
interface MiInterf2 {

    long apply(Personas personas);
}
