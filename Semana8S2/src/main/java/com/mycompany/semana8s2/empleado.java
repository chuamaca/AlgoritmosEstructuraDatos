/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8s2;

/**
 *
 * @author u19303143
 */
public abstract class empleado<K> {

    private K cod;
    private String nombre;
    private double sueldo;
    private double bono;

    public abstract void calcularBono();
  
    

    public empleado(K cod, String nombre, double sueldo) {
        this.cod = cod;
        this.nombre = nombre;
        this.sueldo = sueldo;
 
    }

 
    

    public String mostrar() {
        String cadena;
        cadena = "Codigo" + cod;
        cadena += "\nNombre " + nombre;
        cadena += "\nSueldo" + sueldo;
        cadena += "\nBono " + bono;
        return cadena;
    }

    public K getCod() {
        return cod;
    }

    public void setCod(K cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    

}
