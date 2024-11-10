// Hacer un programa que calcule e imprima la suma de tres calificaciones
package com.mycompany.ejercicio1_operadores;

import java.util.Scanner;

public class Ejercicio1_Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float cal1, cal2, cal3,cal_final;
        System.out.print("Digite tres calificaciones: ");
        cal1 = entrada.nextFloat();
        cal2 = entrada.nextFloat();
        cal3 = entrada.nextFloat();
        
        cal_final = cal1+cal2+cal3;
        System.out.println("La suma de las tres calificaciones es: "+cal_final);
        
        
    }
}
