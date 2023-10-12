/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana09;

/**
 *
 * @author LAB-USR-PT116-E305
 */
public class CdCola {

    public static void main(String[] args) {

        Lista cola = new Lista();

        cola.InsertarNodoFinal("Carlos");
        cola.InsertarNodoFinal("Juan");
        cola.InsertarNodoFinal("Marta");
        
        
        cola.recorrer();
        cola.EliminarNodoInicio();
        cola.recorrer();

    }
}
