package pruebas.yefer.data;

import java.util.ArrayList;
import java.util.List;
import pruebas.yefer.model.Electrodomestico;
import pruebas.yefer.model.Persona;

public class Data {
    //Metodo que devuelve una lista de personas.
    public static List<Persona> lista (){
        List<Persona> list = new ArrayList<>();
        
        Persona persona = new Persona();
        
        persona.setNombres("Yefer Frank");
        persona.setApellidos("Huansha Leyva");
        persona.setEdad(24);
        
        List<String> cursos = new ArrayList<>();
        cursos.add("Ingenieria de Procesos");
        cursos.add("Paginas Web");
        cursos.add("POO-I");
        persona.setCursos(cursos);
        list.add(persona);
        
        persona = new Persona();
        
        persona.setNombres("Gonzalo Percy");
        persona.setApellidos("Junco Diaz");
        persona.setEdad(23);
        
        cursos = new ArrayList<>();
        cursos.add("Analisis Matematico V");
        cursos.add("Paginas Web");
        cursos.add("POO-III");
       
        persona.setCursos(cursos);
        list.add(persona);
        return list;
    }
    
    public static List<String> estados (){
        List<String> list = new ArrayList<>();
        list.add("Activo");
        list.add("Inactivo");
        list.add("Inactivo");
        list.add("Activo");
        list.add("Inactivo");
        list.add("Activo");
        list.add("Activo");
        list.add("Inactivo");
        list.add("Activo");
        return list;
    }
    
    public static List<Integer> numeros (){
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(3);
        list.add(6);
        return list;
    }
    
    public static List<Electrodomestico> electrodomesticos (){
        List<Electrodomestico> list = new ArrayList<>();
        list.add(new Electrodomestico(3,"Radio"));
        list.add(new Electrodomestico(4,"tv"));
        list.add(new Electrodomestico(2,"computadora"));
        list.add(new Electrodomestico(5,"Refrigeradora"));
        list.add(new Electrodomestico(1,"Licuadora"));
        list.add(new Electrodomestico(6,"Mesa"));
        return list;
    }
}
