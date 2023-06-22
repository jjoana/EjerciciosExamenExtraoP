package com.programacion2;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        /* 

        TreeSet<Persona> miTreeSet = new TreeSet<Persona>();
        Persona objeto = new Persona("Jesus", 20);
        miTreeSet.add(objeto);
        objeto = new Persona("Julio", 30);
        miTreeSet.add(objeto);
        objeto = new Persona("Ana", 25);
        miTreeSet.add(objeto);

        for(Persona persona: miTreeSet){
            System.out.println(persona);
        }
        */

        TreeSet<Integer> miTreeSet = new TreeSet<>();
        miTreeSet.add(2);
        miTreeSet.add(1);
        miTreeSet.add(3);

        for(Integer lista: miTreeSet){
            System.out.println(lista);
        }

        ArrayList<Integer> miArray = new ArrayList<>();
        miArray.add(2);
        miArray.add(1);
        miArray.add(3);

        for(Integer miLista : miArray){
            System.out.println(miLista);
        }

    }
}
