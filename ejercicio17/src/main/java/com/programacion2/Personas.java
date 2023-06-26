package com.programacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class Personas {

    List<Persona> lista = new ArrayList<Persona>();

    public void annadirPersona(Persona persona) {
        lista.add(persona);
    }

    public Persona elMasJoven() throws MiExcepcion{

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

    public long calcularSumaEdades() throws MiExcepcion{
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

    public long calcularEdadMinima() throws MiExcepcion{
    Supplier<Long> calcula = () -> {
            long edadInicial = 200;
            for (Persona p : lista) {
                try {
                    if (p.calcularEdad() < edadInicial) {
                        edadInicial = p.calcularEdad();
                    }
                } catch (MiExcepcion e) {
                    System.out.println("Ha ocurrido un error ");
                }
            }
            return edadInicial;
        };
        return calcula.get();
    }

    
    public double calcularMediaEdad() throws MiExcepcion{
        Supplier <Double> calcula = () -> {
            double resultado = 0;
            for (Persona p : lista) {
                try {
                    resultado += p.calcularEdad();
                } catch (MiExcepcion e) {
                    System.out.println("Ha ocurrido un error");
                }
            }
            return resultado/lista.size();
         };
        return calcula.get();
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
