package pruebas.yefer.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import pruebas.yefer.data.Data;
import pruebas.yefer.model.Electrodomestico;
import pruebas.yefer.model.Persona;

public class PersonaController {
    
    private String msm;
    
    public PersonaController() {
    }
    
    public void obtenerPersonas(){
        List<Persona> personas = Data.lista();
        
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i).toString());
        }
        
        /*Persona per = new Persona();
        List<String> cursos = new ArrayList<>();
        cursos.add("Base de datos");
        
        per.setCursos(cursos);
        personas.set(1, per);*/
        
        System.out.println("======== REFACTORIZANDO - CAMBIANDO LISTA DE CURSO ========");
        
        /*for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getNombres().equals("Gonzalo Percy")){
                List<String> cursos = new ArrayList<>();
                cursos.add("Base de datos");
                personas.get(i).setCursos(cursos);
            }
        }*/
        
        List<Persona> per = personas.stream().map((persona) ->{
            List<String> cursos = new ArrayList<>();
            cursos.add("Base de datos");
            if (persona.getNombres().equals("Gonzalo Percy")) {
                persona.setCursos(cursos);
            }
            return persona;
        }).collect(toList());
        
        List<Persona> perr = personas.stream().filter((persona) -> {
            return !persona.getNombres().equals("Gonzalo Percy");
        }).collect(toList());
        
        for (int i = 0; i < perr.size(); i++) {
            System.out.println(perr.get(i).toString());
        }
        
        msm = "FOR COMPLETE";
    }
    
    public String mensaje(){
        return msm;
    }
    
    public void separar(){
        List<String> activos = Data.estados().stream().filter((a) -> {
            return !a.equals("Inactivo");
        }).collect(toList());
        
        List<String> inactivos = Data.estados().stream().filter((i) -> {
            return !i.equals("Activo");
        }).collect(toList());
        
        List<Persona> edades = Data.lista().stream().filter((e) -> {
            return e.getEdad() >= 24;
        }).collect(toList());
        
        
        
        System.out.println("LISTA ACTIVOS " + activos);
        System.out.println("LISTA INACTIVOS " + inactivos);
        System.out.println("LISTA PERSONAS " + edades);
    }
    
    public void ordenar(){
        /*
        List result = list.stream().sorted((o1, o2)->o1.getItem().getValue().
                                   compareTo(o2.getItem().getValue())).
                                   collect(Collectors.toList());
        */
        
        /*System.out.println(Data.numeros());
        List<Integer> result = Data.numeros().stream().sorted().collect(toList());
        System.out.println(result);*/
        
        
        System.out.println(Data.electrodomesticos());
        
        List<Electrodomestico> result = Data.electrodomesticos().stream().sorted((n1,n2)-> 
                n1.getId().compareTo(n2.getId())).collect(toList());
        System.out.println(result);
        /*result.forEach((e) -> {
             System.out.println(e.toString());
        });*/
        /*result.stream().forEach((e) -> {
            System.out.println(e.toString());
        });*/
        
        
        /*List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

    myList
        .stream()
        .filter(s -> s.startsWith("c"))
        .map( d -> d.toUpperCase())
        .sorted()
        .forEach(System.out::println);*/
    }
}
