package cineapp.utilities;

import cineapp.entities.Peliculas;
import java.util.Comparator;

public class Comparadores {

    //comparator para ordenar por duracion de mayor a menor
    //esto se tiene que escribir:
    //public static Comparator<Peliculas> ordenarPorDuracionDesc = new Comparator<Peliculas>
    //luego se para uno al final y le da a control + espacio y auto comppleta el @Override que luego vamos a modificar a gusto
    public static Comparator<Peliculas> ordenarPorDuracionDesc = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            //para orden desc va primero el ultimo valor
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };

    public static Comparator<Peliculas> ordenarPorDuracionAsc = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };

    public static Comparator<Peliculas> ordenarPorTitulo = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };

    public static Comparator<Peliculas> ordenarPorDirector = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };

}
