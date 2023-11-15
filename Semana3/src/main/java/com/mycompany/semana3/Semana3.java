/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.semana3;

/**
 *
 * @author chuamani
 */
public class Semana3 {

    public static void main(String[] args) {

        
        
        int[] lista = {45, 65, 9, 8, 15, 50};
        int n = lista.length;
        boolean intercambiado;
        int ciclos=0;
        do {
            intercambiado = false;
            for (int i = 1; i < n; i++) {
                if (lista[i - 1] > lista[i]) {
                    // Intercambiar los elementos si están en el orden incorrecto
                    int temp = lista[i - 1];
                    lista[i - 1] = lista[i];
                    lista[i] = temp;
                    intercambiado = true;
                }
                
                ciclos= ciclos +1;
                
            }
        } while (intercambiado);

        // Imprimir la lista ordenada
        for (int i = 0; i < n; i++) {
            System.out.print(lista[i] + " ");
        }
        
        System.out.println("Ciclos: "+ ciclos);
    }
}
