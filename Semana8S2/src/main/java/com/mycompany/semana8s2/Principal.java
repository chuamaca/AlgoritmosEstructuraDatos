/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8s2;

/**
 *
 * @author u19303143
 */
public class Principal {

    public static void main(String[] args) {

        Supervisor superv = new Supervisor(5, 9, "Cesar Huamani", 1500);
        superv.calcularBono();
        System.out.println(superv.mostrar());
        
        

    }
}
