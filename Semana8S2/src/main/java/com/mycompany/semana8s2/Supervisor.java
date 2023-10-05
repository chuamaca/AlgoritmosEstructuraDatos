/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8s2;

/**
 *
 * @author u19303143
 */
public class Supervisor extends empleado<Integer> {
    
    private int nrotrb;

    public Supervisor(int nrotrb, Integer cod, String nombre, double sueldo) {
        super(cod, nombre, sueldo);
        this.nrotrb = nrotrb;
    }

    @Override
    public void calcularBono() {
        
         
        double bonosuper = (getSueldo() * 0.025) * nrotrb;
        setBono(bonosuper);
        
        
    }
    
    

}
