package com.mycompany.clasemath;

import java.util.Scanner;

public class ClaseMath {

    public static void main(String[] args) {
        // Raíz
        double raiz = Math.sqrt(9); // Toma como argumento un double y devuelve un double
        System.out.println(raiz);
        // Si quieres transformar el resultado, puede ser de la siguiente manera
        int raiz2 = (int)Math.sqrt(9);
        System.out.println(raiz2);
        
        // Potencia
        double base =5, exponente = 2;
        double resultado = Math.pow(base, exponente);
        System.out.println(resultado);
        
        // Redondeo
        double numero = 4.56;
        long res = Math.round(numero);
        
        System.out.println(res);
        
        // Random
        double n = Math.random();
        System.out.println(n);
        
        
        
        
    }
}
