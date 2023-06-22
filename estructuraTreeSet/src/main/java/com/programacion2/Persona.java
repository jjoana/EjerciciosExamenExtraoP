package com.programacion2;

public class Persona implements Comparable<Persona> {
    
    String nombre;
    int edad;

    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona o) {

        return nombre.compareTo(o.nombre);

    }

    public String toString(){
        return "nombre: " + nombre + " edad: " + edad;
    }


}
