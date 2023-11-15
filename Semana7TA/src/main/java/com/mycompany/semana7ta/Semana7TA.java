/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana7ta;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chuamani
 */
public class Semana7TA {

    public static void main(String[] args) {
        
           Scanner scanner = new Scanner(System.in);
        double[] notas = null;

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("a. Crear arreglo");
            System.out.println("b. Insertar notas nuevas");
            System.out.println("c. Mostrar los datos");
            System.out.println("d. Actualizar una nota");
            System.out.println("e. Eliminar una nota");
            System.out.println("f. Copiar a un arreglo nuevo");
            System.out.println("g. Clonar a un nuevo arreglo");
            System.out.println("q. Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Ingrese el tamaño del arreglo:");
                    int tamaño = scanner.nextInt();
                    notas = new double[tamaño];
                    System.out.println("Arreglo creado con éxito.");
                    break;

                case "b":
                    if (notas == null) {
                        System.out.println("El arreglo no ha sido creado aún.");
                    } else {
                        System.out.println("Ingrese la posición para insertar la nota:");
                        int posicion = scanner.nextInt();
                        System.out.println("Ingrese la nota:");
                        double nota = scanner.nextDouble();

                        if (posicion >= 0 && posicion < notas.length) {
                            notas[posicion] = nota;
                            System.out.println("Nota insertada con éxito.");
                        } else {
                            System.out.println("Posición fuera de rango.");
                        }
                    }
                    break;

                case "c":
                    if (notas == null) {
                        System.out.println("El arreglo no ha sido creado aún.");
                    } else {
                        System.out.println("Notas en el arreglo:");
                        for (int i = 0; i < notas.length; i++) {
                            System.out.println("Posición " + i + ": " + notas[i]);
                        }
                    }
                    break;

                case "d":
                    if (notas == null) {
                        System.out.println("El arreglo no ha sido creado aún.");
                    } else {
                        System.out.println("Ingrese la posición de la nota a actualizar:");
                        int actualizarPos = scanner.nextInt();
                        if (actualizarPos >= 0 && actualizarPos < notas.length) {
                            System.out.println("Ingrese la nueva nota:");
                            double nuevaNota = scanner.nextDouble();
                            notas[actualizarPos] = nuevaNota;
                            System.out.println("Nota actualizada con éxito.");
                        } else {
                            System.out.println("Posición fuera de rango.");
                        }
                    }
                    break;

                case "e":
                    if (notas == null) {
                        System.out.println("El arreglo no ha sido creado aún.");
                    } else {
                        System.out.println("Ingrese la posición de la nota a eliminar:");
                        int posEliminar = scanner.nextInt();
                        if (posEliminar >= 0 && posEliminar < notas.length) {
                            notas[posEliminar] = 0.0;
                            System.out.println("Nota eliminada con éxito.");
                        } else {
                            System.out.println("Posición fuera de rango.");
                        }
                    }
                    break;

                case "f":
                    if (notas == null) {
                        System.out.println("El arreglo no ha sido creado aún.");
                    } else {
                        double[] copiaNotas = Arrays.copyOf(notas, notas.length);
                        System.out.println("Arreglo copiado con éxito.");
                    }
                    break;

                case "g":
                    if (notas == null) {
                        System.out.println("El arreglo no ha sido creado aún.");
                    } else {
                        double[] clonNotas = notas.clone();
                        System.out.println("Arreglo clonado con éxito.");
                    }
                    break;

                case "q":
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

           
            scanner.nextLine();
        }
        
        
        
    }
}
