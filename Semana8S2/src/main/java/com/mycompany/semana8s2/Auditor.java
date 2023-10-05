/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8s2;

/**
 *
 * @author u19303143
 */
public class Auditor extends empleado<String>{
    
    String sede;

    public Auditor(String sede, String cod, String nombre, double sueldo) {
        super(cod, nombre, sueldo);
        this.sede = sede;
    }

    @Override
    public void calcularBono() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
}
