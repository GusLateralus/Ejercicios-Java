package com.mycompany.sentenciaswitch;

import java.util.Scanner;

public class SentenciaSwitch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int dia;
        String nombre_dia;
        
        System.out.print("Digita el número de día del 1 al 7: ");
        dia = entrada.nextInt();
        
        switch (dia) {
            case 1:
                nombre_dia = "Lunes";
                System.out.println("Hoy es "+nombre_dia);
                break;
            case 2:
                nombre_dia= "Martes";
                System.out.println("Hoy es "+nombre_dia);
                break;
            case 3:
                nombre_dia = "Miércoles";
                System.out.println("Hoy es "+nombre_dia);
                break;
            case 4:
                nombre_dia = "Jueves";
                System.out.println("Hoy es "+nombre_dia);
                break;
            case 5:
                nombre_dia = "Viernes";
                System.out.println("Hoy es "+nombre_dia);
                break;
            case 6:
                nombre_dia = "Sábado";
                System.out.println("Hoy es: "+nombre_dia);
                break;
            case 7:
                nombre_dia = "Domingo";
                System.out.println("Hoy es "+nombre_dia);
                break;
            default:
                System.out.println("No digitaste un número válido");
                break;
        }
    }
}
