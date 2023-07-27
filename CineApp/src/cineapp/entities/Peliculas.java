
package cineapp.entities;
/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, 
tendremos una clase Pelicula con el título, director y duración de la película (en horas). 
*/


public class Peliculas {
    //atributos
    private String titulo;
    private String director;
    private Double duracion;
    
    //constructor

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    
    //setters y getter 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    
    
}
