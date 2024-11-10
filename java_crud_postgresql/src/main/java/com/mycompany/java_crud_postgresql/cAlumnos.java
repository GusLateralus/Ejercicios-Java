package com.mycompany.java_crud_postgresql;




public class cAlumnos {
    // Para generarlos, seleccionamos nuestras tres variables,luego clic derecho,
    // insert code, y después getter and setter, asegúrate de seleccionar las 3 
    // casillas
    int codigo;
    String nombreAlumno;
    String apellidosAlumno;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidosAlumno() {
        return apellidosAlumno;
    }

    // Vamos a crear atributos
    public void setApellidosAlumno(String apellidosAlumno) {
        this.apellidosAlumno = apellidosAlumno;
    }
    
    // Creamos un método que no devolverá nada
    /*public void MostrarAlumnos(JTable paramTablaTotalAlumnos)
    {
        CConexion objetoConexion = new  CConexion();
    
    
    }
    */
    
}
