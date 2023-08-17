/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesion01;

/**
 *
 * @author LAB-USR-PT116-E305
 */
public class Experto {

    private String nombre;
    private int edad, experiencia, egresados;

    public Experto() {
    }

    public Experto(String nombre, int edad, int experiencia, int egresados) {
        this.nombre = nombre;
        this.edad = edad;
        this.experiencia = experiencia;
        this.egresados = egresados;
    }

    public void experiencia() {
        experiencia = edad - egresados;
    }

    public String mostrar() {
        String mensaje;
        mensaje = "Datos Generales";
        mensaje += "\nNombre" + nombre;
        mensaje += "Edad" + edad;
        mensaje += "\nEgresado a los " + egresados;
        mensaje += "\nIngeniero a los " + experiencia + " Años de experiencia";
        return mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEgresados() {
        return egresados;
    }

    public void setEgresados(int egresados) {
        this.egresados = egresados;
    }

}
