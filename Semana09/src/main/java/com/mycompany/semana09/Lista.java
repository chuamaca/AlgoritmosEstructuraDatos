/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana09;

/**
 *
 * @author LAB-USR-PT116-E305
 */
public class Lista {

    private Nodo inicio, nuevo, p, q;

    public void InsertarNodoInicio(String nombre) {

        nuevo = new Nodo(nombre);

        if (inicio == null) {
            inicio = nuevo;
        } else {
            nuevo.setSgtenodo(inicio);
            inicio = nuevo;
        }
    }

    public void InsertarNodoFinal(String nombre) {

        nuevo = new Nodo(nombre);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            p = inicio;
            while (p.getSgtenodo() != null) {
                p = p.getSgtenodo();
            }

            p.setSgtenodo(nuevo);
        }

    }

    public void EliminarNodo(String nombre) {
        if (inicio != null) {
            if (inicio.getSgtenodo() == null) {
                inicio = null;
            }
        } else {
            p = inicio;

            while (p.getSgtenodo() != null) {
                q = p;
                p = p.getSgtenodo();
            }

            q.setSgtenodo(null);
        }

    }

    public void EliminarNodoInicio() {

        if (inicio != null) {
            inicio = inicio.getSgtenodo();

        }
    }

    public String recorrer() {
        p = inicio;
        String cadena = "";
        while (p != null) {

            cadena += p.getNombre() + "\n";

            p = p.getSgtenodo();
        }

        System.out.println(cadena);
        return cadena;
    }

}
