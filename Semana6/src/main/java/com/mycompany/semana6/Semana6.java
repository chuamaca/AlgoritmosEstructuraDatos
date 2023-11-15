/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.semana6;

import java.util.Scanner;

/**
 *
 * @author chuamani
 */
public class Semana6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero no negativo: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("El número debe ser no negativo.");
        } else {
            long factorial = calcularFactorial(n);
            System.out.println("El factorial de " + n + " es: " + factorial);
        }

        scanner.close();

    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            // Caso base: El factorial de 0 y 1 es 1.
            return 1;
        } else {
            // Caso recursivo: n! = n * (n-1)!
            return n * calcularFactorial(n - 1);
        }
    }

}
