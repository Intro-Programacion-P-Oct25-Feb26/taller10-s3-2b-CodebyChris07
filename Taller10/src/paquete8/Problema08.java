/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class Problema08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        int[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        int[][] resultado = new int[2][3];
        for (int fila = 0; fila < dato1.length; fila++) {
            for (int col = 0; col < dato1[fila].length; col++) {
                if (dato1[fila][col] > dato2[fila][col]) {
                    resultado[fila][col] = dato2[fila][col];
                } else {
                    resultado[fila][col] = dato1[fila][col];
                }
            }
        }
        for (int f = 0; f < resultado.length; f++) {
            for (int c = 0; c < resultado[f].length; c++) {
                System.out.printf("%s\t", resultado[f][c]);
            }
            System.out.println("");
        }
    }
}
