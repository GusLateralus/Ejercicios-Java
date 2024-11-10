package com.mycompany.operadoresaritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        float n1, n2, suma, resta, mult, div, resto;
        
        // En la consola, puedes digitar los dos números en una sola línea o por 
        // separado
        System.out.print("Digite dos números: ");
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        
        suma = n1 + n2;
        resta = n1 - n2;
        mult = n1*n2;
        div = n1/n2;
        resto = n1%n2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+mult);
        System.out.println("La división es: "+div);
        System.out.println("El residuo es: "+resto);
        
    }
}
