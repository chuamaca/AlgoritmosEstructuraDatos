/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.semana09;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-PT116-E305
 */
public class Semana09 {

    public static void main(String[] args) {

        int option;

        int numeroElementos;

        int[] ventas = new int[9];
        int can = 0;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú:\n"
                    + "1. Ingresar Valores\n"
                    + "2. Mostrar\n"
                    + "3. Mostrar\n"
                    + "9. Salir"));

            switch (option) {
                case 1:

                    for (int i = 0; i < ventas.length; i++) {

                        numeroElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores"));

                        if (numeroElementos > 0) {
                            ventas[i] = numeroElementos;

                            System.out.println("" + ventas[i]);
                        } else {
                            JOptionPane.showMessageDialog(null, "Numero debe ser mayor a 0");
                        }

                    }

                    break;
                case 2:

                    JOptionPane.showMessageDialog(null, "\n" + Arrays.toString(ventas));

                    break;

                case 3:

                    JOptionPane.showMessageDialog(null, "\n" + Arrays.toString(ventas));

                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Nos vemos");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción o caracater no válido");
                    break;
            }
        } while (option != 9);

    }
}
