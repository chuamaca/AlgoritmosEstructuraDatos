/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.semana2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-PT116-E305
 */
public class Semana2 {

    public static void main(String[] args) {

//        char[] caracteres = new char[3];
//        int[] codigos = new int[3];
//
//        for (int i = 0; i < 3; i++) {
//            String input = JOptionPane.showInputDialog("Introduce el caracter " + (i + 1) + ":");
//            
//            if (input.length() != 1) {
//                JOptionPane.showMessageDialog(null, "Debes introducir solo un caracter.", "Error", JOptionPane.ERROR_MESSAGE);
//                i--;
//           
//            }
//            
//            caracteres[i] = input.charAt(0);
//            codigos[i] = (int) caracteres[i];
//            System.out.println("Mostrar Codigos "+codigos[i]);
//        }
//
//        String salida = "Codigos 1:\n";
//        
//        for (int i = 0; i < 3; i++) {
//            salida += codigos[i];
//            if (i != 2) {
//                salida += "\t";
//                System.out.println(" =>>" +salida + " " + i);
//            }
//        }
//
//        salida += "\nCaracteres:\n";
//        for (int i = 0; i < 3; i++) {
//            if (i == 1) {
//                salida += "'" + caracteres[i] + "'\t";
//            } else {
//                salida += caracteres[i] + "\t";
//            }
//        }
//
//        JOptionPane.showMessageDialog(null, salida, "Resultados", JOptionPane.INFORMATION_MESSAGE);
//    
//        
//        
//        Random rnd = new Random();
//        for (int i = 0; i < 61; i++) {
//            System.out.println(" Orden " + i + ":  " + rnd.nextInt(0, 60));
//            
//        }

        /*
Ordenamiento Insercion
         */
        String mensaje;

        int elementos[] = new int[5];
        Random random = new Random();

        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = random.nextInt(60);
        }

        System.out.println("Generando");
        recorrer(elementos);
        System.out.println("Ordenando");
        OrdenamientoInsercion.Ordenamiento(elementos);
        recorrer(elementos);

    }

    public static void recorrer(int lista[]) {

        String mensaje = "";
        for (int i = 0; i < lista.length; i++) {
            mensaje += lista[i] + "|";
        }
        System.out.println(mensaje);
    }
}
