package com.programacion2;

import java.time.LocalDate;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public long calcularEdad() throws MiExcepcion{
        LocalDate hoy = LocalDate.now();
        Period resultado = fechaDeNacimiento.until(hoy);
        int edad = resultado.getYears();
        if (edad < 0){
            throw new MiExcepcion(); 
        } else {
            return edad;
        }
    }

    //Metodo getter para nombre
    public String getNombre(){
        return nombre;
    }

    // Metodo getter para fechaDeNAcimiento
    public LocalDate getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }

    // Metodo setter para nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Metodo setter para fechaDeNacimiento
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}

class MiExcepcion extends Exception {

}
