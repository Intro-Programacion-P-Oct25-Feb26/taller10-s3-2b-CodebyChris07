/*
Elabore una solución que permita ingresar valores numéricos para una matriz X 
de 3 filas y 3 columnas.
Una vez ingresados los datos, se debe realizar las siguientes acciones:
Para cada valor de la matriz X, calcular el resultado de la expresión:
(x + 1) * (x + 1)
y guardar estos resultados en una nueva matriz llamada A.
Para los mismos valores de la matriz X, calcular el resultado de la expresión:
x * x + 2 * x + 1
y guardar estos resultados en otra matriz llamada B.
Comparar las matrices A y B, posición por posición (misma fila y misma columna).
Verificar si en todas las posiciones los valores de la matriz A son iguales a 
los valores de la matriz B.
Mostrar un mensaje indicando: que la identidad algebraica se cumple, si todos 
los valores coinciden, o que la identidad algebraica no se cumple, si existe al
menos una posición donde los valores sean diferentes.
 */
package paquete7;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class Problema07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] matrizX = new double[3][3];
        double[][] matrizA = new double[3][3];
        double[][] matrizB = new double[3][3];
        boolean iguales = true;

        for (int fila = 0; fila < matrizX.length; fila++) {
            for (int col = 0; col < matrizX[fila].length; col++) {
                System.out.printf("Ingrese el valor para la posición [%d][%d]:\n",
                        fila, col);
                matrizX[fila][col] = entrada.nextDouble();
                matrizA[fila][col] = (matrizX[fila][col] + 1)
                        * (matrizX[fila][col] + 1);
                matrizB[fila][col] = (Math.pow(matrizX[fila][col], 2) + 2
                        * matrizX[fila][col] + 1);
            }
        }
        for (int fila = 0; fila < matrizX.length; fila++) {
            for (int col = 0; col < matrizX[fila].length; col++) {
                if (matrizA[fila][col] != matrizB[fila][col]) {
                    iguales = false;
                }
            }
        }
        if (iguales) {
            System.out.println("la identidad algebraica si se cumple");
        } else {
            System.out.println("la identidad algebraica no se cumple");
        }
    }
}
