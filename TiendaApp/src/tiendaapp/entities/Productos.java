
package tiendaapp.entities;


public class Productos {
    
    //atributos
    private String nombre;
    private Double precio;
    
    //constructor

    public Productos() {
    }

    public Productos(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    

}
