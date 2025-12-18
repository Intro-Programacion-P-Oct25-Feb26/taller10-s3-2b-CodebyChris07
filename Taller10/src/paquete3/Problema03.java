/*
Sensores de seguridad instalados en 4 zonas durante 6 revisiones.

boolean[][] sensores = {
    {true, true, true, true, true, true},
    {true, false, true, false, true, false},
    {false, false, false, false, false, false},
    {true, true, false, true, true, false}
};
Actividades:

Determine cuántas zonas funcionan sin fallos.

Indique qué zonas presentan al menos un fallo (false).
 */
package paquete3;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}
        };
        int[] zonas = new int[4];
        int suma;
        String report = "";
        for (int fila = 0; fila < sensores.length; fila++) {
            suma = 0;
            for (int col = 0; col < sensores[fila].length; col++) {
                if (sensores[fila][col] == false) {
                    suma += 1;

                }
            }
            zonas[fila] = suma;

        }

        for (int fila = 0; fila < zonas.length; fila++) {
            if (zonas[fila] != 0) {
                report = String.format("%sLa zona %s tiene fallas en %s\n", 
                        report, fila + 1, zonas[fila]);
            } else {
                report = String.format("%sLa zona %s no tiene fallas\n", report,
                        fila + 1);
            }

        }

        System.out.printf(report);
    }

}
