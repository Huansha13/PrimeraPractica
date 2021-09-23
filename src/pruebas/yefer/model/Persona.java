package pruebas.yefer.model;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombres; 
    private String apellidos;
    private Integer edad;
    private List<String> cursos;

    public Persona(){
        this.cursos = new ArrayList<String>();
    }

    public Persona(String nombres, String apellidos, Integer edad, List<String> cursos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.cursos = cursos;
    }   
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", cursos=" + cursos + '}';
    }
    
    

      
    
}
