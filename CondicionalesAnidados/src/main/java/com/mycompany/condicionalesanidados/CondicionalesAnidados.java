// También existe el else-if
package com.mycompany.condicionalesanidados;

import java.util.Scanner;

public class CondicionalesAnidados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        
        System.out.print("Ingrese dos números enteros: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        
        if(n1 > n2){
            System.out.println("El número "+n1+" es mayor que "+n2);
        }
        
        else{
            
            if(n1 == n2)
            {
                System.out.println("Son iguales");
            }
            
            else{
            System.out.println("El número "+n2+" es mayor que "+n1);
            }
        }
        
        
    }
}
