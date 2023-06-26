package com.programacion2;

import java.util.List;

public class SumaDosListas {
    int resultado = 0;
    

    public void sumaListasR(List<Integer> lista1, List<Integer> lista2){
        if(!lista1.isEmpty()){
            if(!lista2.isEmpty()){
                resultado += lista1.get(0) + lista2.get(0);
                lista1.remove(0);
                lista2.remove(0);
                sumaListasR(lista1, lista2);
            }
        }

    }

    public void sumaListasI(List<Integer> lista1, List<Integer> lista2){
      while(!lista1.isEmpty()){
            while(!lista2.isEmpty()){
                resultado += lista1.get(0) + lista2.get(0);
                lista1.remove(0);
                lista2.remove(0);
            }
        }  
    }
}
