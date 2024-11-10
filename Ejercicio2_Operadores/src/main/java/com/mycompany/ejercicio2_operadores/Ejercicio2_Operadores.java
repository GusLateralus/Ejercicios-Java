// Hacer un programa que calcule e imprima el salario semanal de un empleado a partir
// de sus horas semanales trabajadas y de su salario por hora
package com.mycompany.ejercicio2_operadores;

import java.util.Scanner;

public class Ejercicio2_Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario_hora, salario_semanal;
        int horas;
        
        System.out.print("Digite las horas laboradas: ");
        horas = entrada.nextInt();
        System.out.print("Digite su salario por hora: ");
        salario_hora = entrada.nextFloat();
        
        salario_semanal = horas*salario_hora;
        System.out.println("Su salario semanal es: "+salario_semanal);       
    }
}
