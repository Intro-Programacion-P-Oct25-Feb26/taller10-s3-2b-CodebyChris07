/*
Una institución registra la asistencia de 4 estudiantes durante 5 días 
(lunes a viernes).

boolean[][] asistencia = {
    {true, true, false, true, true},
    {true, false, false, true, false},
    {true, true, true, true, true},
    {false, true, true, false, true}
};

String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};

 */
package paquete1;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean[][] asistencia = {{true, true, false, true, true},
        {true, false, false, true, false},
        {true, true, true, true, true},
        {false, true, true, false, true}};
        String[] estudiante = {"Ana", "Luis", "Carlos", "María"};
        int[] asisten = new int[5];
        int suma;
        String report = "";

        for (int fila = 0; fila < asistencia.length; fila++) {
            suma = 0;
            for (int col = 0; col < asistencia[fila].length; col++) {
                if (asistencia[fila][col] == true) {
                    suma = suma + 1;

                }
            }
            asisten[fila] = suma;
        }
        for (int fila = 0; fila < asistencia.length; fila++) {
            if (asisten[fila] != 5) {
                report = String.format("%sEl estudiante %s asistio %s dias\n",
                        report,
                        estudiante[fila],
                        asisten[fila]);
            }else{
            report = String.format("%sEl estudiante %s tiene la asistencia "
                    + "completa\n",
                        report,
                        estudiante[fila]);
            }
        }
        System.out.println(report);
    }

}
