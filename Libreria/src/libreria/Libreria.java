package libreria;

import java.util.Scanner;
import libreria.services.LibroService;

public class Libreria {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibroService ls = new LibroService();
        
        String confirmar;
        
        do {
            
            System.out.println("Ingresa un libro");
            System.out.println(" ");
            ls.crearLibro();
            System.out.println("Deseas ingresar otro libro? s/n");
            confirmar = leer.next();
            
        } while (!confirmar.equalsIgnoreCase("n"));
        
        System.out.println("Saliendo de la creacion de libros....");
        
        int menu = 0;
        
        while(menu<4){
            System.out.println("Ingresa el valor deseado del menu");
            System.out.println("---------------------------------");
            System.out.println("1. mostrar listado");
            System.out.println("2. prestamo");
            System.out.println("3. devolucion");
            System.out.println("4. salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    ls.mostrarLibros();
                    break;
                case 2:
                    ls.prestamo();
                    break;
                case 3:
                    ls.devolucion();
                    break;
            }
        }
        
        System.out.println("saliendo....");
       
    }

}
