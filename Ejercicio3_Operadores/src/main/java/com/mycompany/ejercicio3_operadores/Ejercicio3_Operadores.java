/*
 *
Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que 
calcule e imprima la cantidad de dinero que tienen entre los tres
*/
package com.mycompany.ejercicio3_operadores;

import java.util.Scanner;

public class Ejercicio3_Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float dolares, dolares_luis, dolares_juan, total_dolares;
        
        System.out.print("Ingrese la cantidad de dólares de Guillermo: ");
        dolares = entrada.nextFloat();
        
        dolares_luis = dolares/2;
        dolares_juan = (dolares+dolares_luis)/2;
        
        total_dolares = dolares+dolares_luis+dolares_juan;
        System.out.println("El total de dólares que reunen los tres es: "+total_dolares);        
        
    }
}
