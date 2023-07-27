package cineapp.services;

import cineapp.entities.Peliculas;
import cineapp.utilities.Comparadores;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class PeliculasService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Peliculas> listaPeliculas = new ArrayList();
    Peliculas pelicula = new Peliculas();

    public Peliculas crearPelicula() {
        System.out.println("Ingresa el nombre de la pelicula");
        String nombre = leer.next();
        System.out.println("Ingresa el director");
        String director = leer.next();
        System.out.println("Ingresa la duracion");
        Double duracion = leer.nextDouble();

        return new Peliculas(director, director, duracion);
    }

    public void enlistarPeliculas() {

        boolean verificador = true;

        do {
            System.out.println("Ingresa una pelicula");
            listaPeliculas.add(crearPelicula());

            System.out.println("Deseas ingresar otra pelicula? s/n");
            String check = leer.next();

            if (check.equalsIgnoreCase("n")) {
                verificador = false;
            }
        } while (verificador);

        System.out.println("Saliendo de crear peliculas....");
        System.out.println("");
        System.out.println("Lista completa de peliculas:");
        mostrarLista();
        System.out.println("");
        System.out.println("Lista de peliculas con duracion mayor a 1h");
        mostrarPeliculasMayoresUnaHora();
        System.out.println("");
        System.out.println("Lista ordenada por Duracion de mayor a menor");
        mostrarPeliculasPorDuracionDesc();
        System.out.println("");
        System.out.println("Lista ordenada por Duracion de menor a mayor");
        mostrarPeliculasPorDuracionAsc();
        System.out.println("");
        System.out.println("Lista ordenada por Titulo");
        mostrarPeliculasPorTitulo();
        System.out.println("");
        System.out.println("Lista ordenada por Director");
        mostrarPeliculasPorDirector();
    }

    public void mostrarLista() {
        for (Peliculas listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
    }

    public void mostrarPeliculasMayoresUnaHora() {
        for (Peliculas listaPelicula : listaPeliculas) {
            if (listaPelicula.getDuracion() > 1) {
                System.out.println(listaPelicula);
            }
        }
    }

    public void mostrarPeliculasPorDuracionDesc() {
        Collections.sort(listaPeliculas, Comparadores.ordenarPorDuracionDesc);
        for (Peliculas listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
    }

    public void mostrarPeliculasPorDuracionAsc() {
        Collections.sort(listaPeliculas, Comparadores.ordenarPorDuracionAsc);
        for (Peliculas listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
    }

    public void mostrarPeliculasPorTitulo() {
        Collections.sort(listaPeliculas, Comparadores.ordenarPorTitulo);
        for (Peliculas listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
    }

    public void mostrarPeliculasPorDirector() {
        Collections.sort(listaPeliculas, Comparadores.ordenarPorDirector);
        for (Peliculas listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
    }

}
