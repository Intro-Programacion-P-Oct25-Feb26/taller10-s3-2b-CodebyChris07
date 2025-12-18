/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int[][] matA = new int[3][2];
        int[][] matB = new int[3][2];

        // Usamos dos banderas para controlar las dos condiciones del problema
        // Asumimos que A es siempre >= B (Condición 1)
        boolean mayorIgual = true;
        // Asumimos que A no ha ganado estrictamente aún (Condición 2)
        boolean estricto = false;
        // Matriz A
        System.out.println("---Matriz A---");
        for (int f = 0; f < matA.length; f++) { // filas
            for (int c = 0; c < matA[f].length; c++) { // columnas

                System.out.printf("Ingrese los valores de A en la posicion [%s]"
                        + "[%s]\n", f, c);
                matA[f][c] = entrada.nextInt();
            }
        }

        // Matriz B
        System.out.println("---Matriz B---");
        for (int f = 0; f < matB.length; f++) { // filas
            for (int c = 0; c < matB[f].length; c++) { // columnas
                System.out.printf("Ingrese los valores de B en la posicion [%s] "
                        + "[%s]\n", f, c);
                matB[f][c] = entrada.nextInt();
            }
        }

        System.out.println("La matriz A tiene los valores");
        for (int f = 0; f < matA.length; f++) {
            System.out.printf("%s\t%s\n", matA[f][0], matA[f][1]);
        }

        System.out.println("La matriz B tiene los valores");
        for (int f = 0; f < matB.length; f++) {
            System.out.printf("%s\t%s\n", matB[f][0], matB[f][1]);
        }

        // Comparación lógica
        for (int f = 0; f < matA.length; f++) {
            for (int c = 0; c < matA[f].length; c++) {

                // Si B es mayor que A en algún punto, A pierde inmediatamente
                if (matB[f][c] > matA[f][c]) {
                    mayorIgual = false;
                }

                // Si A es estrictamente mayor que B en algún punto, 
                // se hace la segunda condición
                if (matA[f][c] > matB[f][c]) {
                    estricto = true;
                }
            }
        }
        // Para que sea "mayor", no debe haber perdido nunca (mayorIgual) 
        // Y debe haber ganado al menos una vez (estricto)
        System.out.println("\n--- Resultado ---");
        if (mayorIgual == true && estricto == true) {
            System.out.println("La matriz A es mayor que la matriz B");
        } else {
            System.out.println("La matriz A no es mayor que la matriz B");
        }
    }
}
