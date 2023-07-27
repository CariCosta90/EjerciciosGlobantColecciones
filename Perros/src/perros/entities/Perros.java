
package perros.entities;

import java.util.Objects;


public class Perros {
    
    //atributos
    
    private String nombre;
    private String raza;
    
    //consutructores        

    public Perros() {
    }

    public Perros(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    
    //setter y getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    //to string

    @Override
    public String toString() {
        return "Perros{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
    
    //equals & hascode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.raza);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perros other = (Perros) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        return true;
    }
    
    

}
