/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.semana8s2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author u19303143 pero esta eb el foro el ejemlp
 */
public class Semana8S2 {

   
    private static int vec[] = {19, 80, 75, 90, 28, 8, 97, 50, 12, 70, 99, 35, 60, 95};

    public static void main2(String[] args) {

        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú:\n"
                    + "1. Mostrar\n"
                    + "2. Merge\n"
                    + "9. Salir"));
            switch (option) {
                case 1:
                    

                    System.out.println("Vector original");
                    imprimirVector(vec);
                    break;
                case 2:
                    System.out.println("\nVector ordenado");
                    mergesort(vec, 0, vec.length - 1);
                    imprimirVector(vec);

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

    public static void mergesort(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
            mezclar(A, izq, m, der);
        }
    }

    public static void mezclar(int A[], int izq, int m, int der) {
        int i, j, k;
        int B[] = new int[A.length];
        for (int l = 0; l <= der; l++) {
            B[l] = A[l];
        }
        i = izq;
        j = m + 1;
        k = izq;
        while (i <= m && j <= der) {
            if (B[i] <= B[j]) {
                A[k++] = B[i++];
            } else {
                A[k++] = B[j++];
            }
        }
        while (i <= m) {
            A[k++] = B[i++];
        }
    }

    public static void imprimirVector(int vec[]) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
    }

}
