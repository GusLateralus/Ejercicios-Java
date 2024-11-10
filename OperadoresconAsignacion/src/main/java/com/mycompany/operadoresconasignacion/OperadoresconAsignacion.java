package com.mycompany.operadoresconasignacion;


public class OperadoresconAsignacion {

    public static void main(String[] args) {
        int num = 10, y;
        
        num +=5; // Le aumentamos 5 
        System.out.println(num);
        num -=5; // Le restamos 5
        System.out.println(num);
        num *=5;
        System.out.println(num);
        num /=5;
        System.out.println(num);
        num %=5;
        System.out.println(num);
        num++; // Aumenta en 1
        System.out.println(num);
        num--; // Decrementa en 1
        System.out.println(num);
        
        y = num++; // Primero asignamos valor y luego incrementamos (sufijo)
        System.out.println(y);
        y = ++num; // Primero aumentamos, luego asignamos valor (prefijo)
        System.out.println(y);
        
        // Puedes aplicar lo mismo con los demás operadores
    }
}
