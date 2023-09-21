/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana006;

/**
 *
 * @author LAB-USR-PT116-E305
 */
public class OrdQuickSort {

    String mensaje;

    public String recorrer(int A[]) {

        for (int i = 0; i < A.length; i++) {
            mensaje = A[i] + "|";
        }

        return mensaje;
    }

    public void QuickSort(int A[], int izq, int der) {

        int pivote = A[izq];
        int i = izq;
        int j = der;
        int aux;

        mensaje = "I: " + izq + "(" + A[izq] + ")" + "D: " + der + "(" + A[der] + ")";
        System.out.println(mensaje);

        while (i < j) {

            while (A[i] <= pivote && i < j) {
                i++;
            }

            while (A[i] > pivote) {
                j--;
            }

            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
            System.out.println(recorrer(A));

            A[izq] = A[j];
            A[j] = pivote;
            System.out.println(recorrer(A));
            if (izq < j - 1) {
                QuickSort(A, izq, j - 1);
            }

            if (j + 1 < der) {
                QuickSort(A, j + 1, der);
            }

        }
    }
}
