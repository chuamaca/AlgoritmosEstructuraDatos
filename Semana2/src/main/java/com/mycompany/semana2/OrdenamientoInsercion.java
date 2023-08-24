/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana2;

/**
 *
 * @author LAB-USR-PT116-E305
 */
public class OrdenamientoInsercion {

    public static void Ordenamiento(int elementos[]) {
        int x, aux, j;
        String mensaje;

        //Primer elemento se ignora por eso se pone i= 1
        for (int i = 1; i < elementos.length; i++) {
            aux = elementos[i];
            
            //Recorremos y saber quien es el anterior
            j = i - 1;
            x = 0;
            while (j >= 0 && elementos[j] > aux) {
                elementos[j + 1] = elementos[j];
                j--;
                x++;
            }

            mensaje = "Cantidad de Movimientos " + x + ".";
            System.out.println(mensaje);
            elementos[j + 1] = aux;
            //System.out.println( elementos[j + 1] = aux );

        }

    }
}
