
package com.mycompany.poo.base9_2_2024;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection conectar;
    
    String usuario = "postgres";
    String contrasenia = "lateralus";
    String bd = "NorthWind"; // Asegúrate de cambiar este nombre
    String ip = "localhost";
    String Puerto = "5432";
    
    String cadena = "jdbc:postgresql://"+ip+":"+Puerto+"/"+bd;
    
    public Connection establecerConexion(){
        
        try{
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos, error: "+e.toString());
            
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");    
        }
        
        return conectar;
   }
}