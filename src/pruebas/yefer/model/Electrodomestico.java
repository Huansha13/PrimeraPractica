package pruebas.yefer.model;

public class Electrodomestico {
    private Integer id;
    private String nombre;

    public Electrodomestico() {
    }
    
    

    public Electrodomestico(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
