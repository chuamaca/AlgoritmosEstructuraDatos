/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sesion01;

import java.rmi.server.Operation;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-PT116-E305
 */
public class Sesion01 {

    public static void main(String[] args) {

        String nombre, mensaje, titulo;
        int ope, edad, egresado;

        titulo = "Ingreso de Datos ";

        Experto experto = new Experto();

        do {
            ope = Menu();
            switch (ope) {
                case 1:
                    mensaje = "Ingrese tu nombre";

                    nombre = JOptionPane.showInputDialog(null, mensaje, titulo, 2);
                    edad = valor("Cuantos años tienes", 20,100);
                    /*La Edad debe ser mayor a la Edad que terminaste*/
                    egresado = valor("A que edad terminaste la carrera",20, edad);
                    experto.setEdad(edad);
                    experto.setEgresados(egresado);
                    experto.setNombre(nombre);
                    experto.experiencia();

                    break;
                case 2:
                    mensaje = experto.mostrar();
                    JOptionPane.showMessageDialog(null, mensaje);
                    break;

                case 9:
                    mensaje = "Nos vemos";
                    JOptionPane.showMessageDialog(null, mensaje);
                    break;

                default:
                    mensaje = "Opcion no implementada ";
                    JOptionPane.showMessageDialog(null, mensaje);

            }

        } while (ope != 9);

    }

    public static int Menu() {
        String opciones;
        int ope;
        opciones = "\nMenu de oipciones";
        opciones += "\n1|Ingresar";
        opciones += "\n2|Mostrar";
        ope = Integer.parseInt(JOptionPane.showInputDialog(opciones));
        return ope;
    }

    public static int valor(String pregunta, int minimo, int maximo) {
        boolean error = true;
        int dato;
        String mserror = "Ingrese un valor mayor a " +minimo+ " Menor a "+maximo;
        do {
            dato = Integer.parseInt(JOptionPane.showInputDialog(pregunta));
            if (dato > minimo && dato < maximo) {
                error = false;
            } else {
                JOptionPane.showMessageDialog(null, mserror);
            }

        } while (error != false);

        return dato;
    }
}
