
package cantantefamoso.entities;


public class Cantante {
        //atributos 
  
    private String nombre;
    private String discoConMasVentas;
    
    //constructores

    public Cantante() {
    }

    public Cantante(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }
    //setter y getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    @Override
    public String toString() {
        return "Cantante{" + "nombre=" + nombre + ", discoConMasVentas=" + discoConMasVentas + '}';
    }
    
    
    
    
}
