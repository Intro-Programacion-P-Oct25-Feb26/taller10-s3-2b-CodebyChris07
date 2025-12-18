/*
Dado el siguiente arreglo

String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
 {"Carrie Burton", "Lauren Rice"},
{"Emma Escobar", "Lori Flores"},
{"Steven West", "Toni Martin"}
 };
Imprima en pantalla a través de una variable acumuladora solo los estudiantes
que tienen como primera letra S,P,T
 */
package paquete5;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
    String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
 {"Carrie Burton", "Lauren Rice"},
{"Emma Escobar", "Lori Flores"},
{"Steven West", "Toni Martin"}
 };
    String reporte = "";
    String inicial;
    for(int fila = 0; fila < estudiantes.length; fila++){
    for (int col = 0; col < estudiantes[fila].length; col++){
    String nombre = estudiantes[fila][col];
    inicial = nombre.substring(0,1);
    switch(inicial){
        case "S":
        case "P":
        case "T":
        reporte = String.format("%s%s\n", reporte, nombre);
        break;
    
    }
    System.out.printf(reporte);
    
    }
    
    
    
    
    
    
    }
    
    
    
    
    }
    }
