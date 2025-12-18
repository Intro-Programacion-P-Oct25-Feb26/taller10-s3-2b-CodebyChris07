/*
 Se registran las edades de personas en 3 familias (4 integrantes cada una).

int[][] edades = {
    {5, 12, 35, 40},
    {8, 15, 33, 38},
    {6, 10, 30, 36}
};
Actividades:

Cuente cuántos menores de edad existen en total. A través de un arreglo 
adecuado, almacene y presente cuántos adultos hay por familia.
 */
package paquete2;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int[][] edades  = {{5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}};
        int menor = 0;
        int[] adulto = new int[3];
        int suma;
        String report = "";
        
        for(int fila = 0; fila < edades.length; fila++){
        suma = 0;
        for(int col = 0; col < edades[fila].length; col++){
            
            if(edades[fila][col] < 18){
                menor = menor + 1;
            }else{
             suma+= 1;
            }
        }
        
        adulto[fila] = suma;
        
        
        }
        for(int fila = 0; fila < edades.length; fila++){
        report = String.format("%sEn la familia %s hay %s adultos\n",report, fila + 1, adulto[fila]);
        
        
        
        }
        System.out.printf("%s\nEn las familias hay %s niños", report, menor);
        

    }
}
