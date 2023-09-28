/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.dev.semana7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class Semana7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String valor = "";

        // OrdQuickSort quickSort= new OrdQuickSort();
        String str = "a,b, c, d";

        List<String> tokens = Arrays.asList(str.split("\\s*,\\s*"));
        System.out.println(tokens);

        Boolean estado = true;

        while (estado) {

            System.out.println("Menú:");
            System.out.println("1. Ingresar Los Numeros");
            System.out.println("2. Quickshort");
            System.out.println("3. Ver resultado");
            System.out.println("9. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    valor = IngresarNumero("Ingrese el primer número: ", true);

                    break;
                case 2:
                    estado = false;
                    break;
                case 3:
                    estado = false;

                    System.out.println("Resultado: " + valor);

                    //  System.out.println("Resultado es :" + multi(numero1, numero2));
                    //  System.out.println("========>>> Primer Numero: " + numero1 + " Segundo Numero: " + numero2);
                    break;
                case 4:
                    //quickSort.QuickSort(A, opcion, numero2);
                    break;
                case 9:
                    estado = false;
                    break;
                default:
                    System.out.println("========>>> Opción no válida");
            }

        }

    }

    /*
    
    Elabore un algoritmo que permita ingresar números enteros separados por coma con el siguiente menú:
1.generar
2.quicksort
3.mostrar
9.Salir
     */
    public static String IngresarNumero(String valor, Boolean estado) {

        String texto2 = "";
        Scanner scanner = new Scanner(System.in);

        texto2 = scanner.nextLine();

        return texto2;

    }

    public static void mergesor(int A[], int izq, int der) {

        if (izq < der) {
            int m = (izq + der) / 2;
            mergesor(A, m + 1, der);
            mezclar(A, izq, m, der);
        }

    }

    //metodo Mesclas
    public static void mezclar(int A[], int izq, int m, int der) {
        int i, j, k;
        int B[] = new int[A.length];

        for (int L = 0; L <= der; L++) {
            B[L] = A[L];
        }
        i = izq;
        j = m + 1;
        k = izq;

        while (j <= m && j <= der) {
            if (B[i] <= B[j]) {
                A[j++] = B[i++];
            } else {
                A[k++] = B[j++];
            }

        }

        while (i <= m) {
            A[j++] = B[i++];
        }
    }
}
