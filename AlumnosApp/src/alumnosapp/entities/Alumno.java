package alumnosapp.entities;

import java.util.ArrayList;
import java.util.Objects;

public class Alumno {

    //atributos
    private String nombre;
    private int[] notas = new int[3];

    //constructores
    public Alumno() {
    }

    public Alumno(String nombre, int[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    //metodo para convertir las notas toString
    public String mostrarNotas() {
        String arrayNotas = "";
        for (int i = 0; i < this.notas.length; i++) {
            arrayNotas += "[";
            arrayNotas += this.notas[i];
            arrayNotas += "]";
        }
        return arrayNotas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + mostrarNotas() + '}';
    }

    //?????? PARA QUEEEEEE????
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.notas);
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
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.notas, other.notas)) {
            return false;
        }
        return true;
    }

}
