/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana09;

/**
 *
 * @author LAB-USR-PT116-E305
 */
public class Nodo {
   private String nombre;
    private Nodo sgtenodo;

    
    //Se pone Nulo por que cada Null apunta a un NODO
    public Nodo(String nombre) {
        this.nombre = nombre;
        this.sgtenodo = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getSgtenodo() {
        return sgtenodo;
    }

    public void setSgtenodo(Nodo sgtenodo) {
        this.sgtenodo = sgtenodo;
    }
    
    
    
    
}
