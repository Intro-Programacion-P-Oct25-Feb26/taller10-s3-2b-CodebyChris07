/*
 Diseñe un algoritmo que permita leer un número entero o real y, posteriormente,
ingresar los valores numéricos de una matriz de 5 filas y 6 columnas.
Una vez ingresados los datos, el algoritmo debe:
Multiplicar cada elemento de la matriz original por el número leído.
Almacenar el resultado de cada multiplicación en la misma posición de una nueva 
matriz, llamada matriz resultante.
Mostrar en pantalla la matriz original.
Mostrar en pantalla la matriz resultante, producto de la multiplicación por el 
número ingresado.
Cada elemento de la matriz resultante debe corresponder al producto entre el 
número ingresado y el valor ubicado en la misma fila y columna de la matriz 
original.
 */
package paquete6;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double num;
        double[][] matriz1 = new double[5][6]; // matriz original
        double[][] matrizResult = new double[5][6]; // matriz original

        String reporte = "";

        System.out.println("Ingrese un número entero o real: ");
        num = entrada.nextDouble();

        System.out.println("\nValores para la matriz(5x6):");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.printf("Posicion [%d][%d]: ", i, j);
                matriz1[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizResult[i][j] = matriz1[i][j] * num;
            }
        }

        reporte = String.format("%s\nMatriz Original:\n", reporte);
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                reporte = String.format("%s%.1f ", reporte,
                        matriz1[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        reporte = String.format("%s\nMatriz Resultante (multiplicada "
                + "por %.1f):\n",
                reporte, num);

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                reporte = String.format("%s%.1f ", reporte,
                        matrizResult[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        System.out.println(reporte);
    }
}
