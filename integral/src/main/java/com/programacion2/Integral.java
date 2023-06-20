package com.programacion2;

public class Integral {
    double limInf;
    double limSup;


    double integralEXCuadrado(double limInf, double limSup, double h){
        double area= 0.0;
        if(limInf < limSup){
            double valor_x = limInf;
            limInf += h;
            area = Math.exp(Math.pow(valor_x, 2))* h + integralEXCuadrado(limInf, limSup, h);
        }   
        return area;
    }
    
}
