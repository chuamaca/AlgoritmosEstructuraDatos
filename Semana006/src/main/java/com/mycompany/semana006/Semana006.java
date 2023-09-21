/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.semana006;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-PT116-E305
 */
public class Semana006 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        
        OrdQuickSort quickSort= new OrdQuickSort();
        int A[]= {10,40,7,9,15,27};

        Boolean estado = true;

        while (estado) {

            System.out.println("Menú:");
            System.out.println("1. Ingresar número 1");
            System.out.println("2. Ingresar número 2");
            System.out.println("3. Ver resultado");
            System.out.println("9. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    numero1 = ValidarNumero("Ingrese el primer número: ");
                    break;
                case 2:
                    numero2 = ValidarNumero("Ingrese el segundo número: ");

                    if (numero2 < numero1) {

                        System.out.println("volver a ingresa el numero 1");
                        numero2 = 0;
                    }

                    break;
                case 3:

                    System.out.println("Resultado es :" + multi(numero1, numero2));

                  //  System.out.println("========>>> Primer Numero: " + numero1 + " Segundo Numero: " + numero2);
                    break;
                case 4:
                    quickSort.QuickSort(A, opcion, numero2);
                    break;
                case 9:
                    estado = false;
                    break;
                default:
                    System.out.println("========>>> Opción no válida");
            }

        }

    }
    
    /*TAREA 
    
    Imprimir los intermedios
    */

    private static int ValidarNumero(String valor) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print(valor);
            numero = scanner.nextInt();
        } while (numero < 0 || numero > 10);
        return numero;
        
    }

    private static int multi(int a, int b) {

        int resultado;
        if (a == 0 || b == 0) {
           resultado=0;
        } else {
            if (b>0) {
                 resultado = a + multi(a, b);
            }else{
                resultado=0;
            }
            
        }

        return resultado;
    }

}
