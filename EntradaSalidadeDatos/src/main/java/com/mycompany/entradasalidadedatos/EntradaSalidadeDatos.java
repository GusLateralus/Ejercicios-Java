// Aquí veremos cómo guardar datos
// Nota: se agregó un entrada.nextLine(); extra en cada variable, aquí la explicación:

/**
 Cuando usas nextInt(), nextFloat(), o nextDouble(), la entrada del usuario no 
 * consume el carácter de nueva línea (\n). Entonces, cuando usas nextLine() 
 * después de estos métodos, nextLine() consume el carácter de nueva
 * línea que quedó pendiente de la entrada anterior y lee una línea 
 * en blanco.

Para resolver este problema, puedes agregar un entrada.nextLine()
* adicional después de cada nextXXX() para consumir la línea en blanco
* antes de leer la siguiente entrada con nextLine()
 
 **/

package com.mycompany.entradasalidadedatos;

import java.util.Scanner; // Librería necesaria para poner datos

public class EntradaSalidadeDatos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  // Creamos una instancia para entrada
        int numero;
        float numero2;
        double numero3;
        String cadena;
        char letra;
        
        // Entero
        System.out.print("Digite un número: ");
        numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("El número es: "+numero);
        
        //  Flotante
        System.out.print("Digite un número: ");
        numero2 = entrada.nextFloat(); 
        // Ojo: En algunas computadoras no acepta el punto, sólo la coma
        entrada.nextLine();
        System.out.println("El número es: "+numero2);
        
        // Double
        System.out.print("Digite otro número: ");
        numero3 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("El número es: "+numero3);
        
        //Cadena
        // Hay 2 formas:
        // Next
        System.out.print("Digite una cadena: ");
        //cadena = entrada.next(); // Este next sólo guarda una cadena hasta donde encuentre el espacio
        cadena = entrada.nextLine(); // Ya guarda la cadena completa
        System.out.println("La cadena es: "+cadena);
        
        
        // Caracter:
        System.out.print("Digite una letra: ");
        letra = entrada.next().charAt(0);  // Guarda la 'cadena' hasta el índice puesto
        // En este caso, sólo estamos guardando una letra, y recuerda que el index empieza en 0
        System.out.println("La letra es: "+letra);
        
    }
}
