
package libreria.services;

import java.util.HashSet;
import java.util.Scanner;
import libreria.entities.Libro;


public class LibroService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //instanciamos el objeto libro 
    Libro libro = new Libro();
    // Creo el HashSet para la lista de libros 
    HashSet<Libro> biblioteca = new HashSet();
    
    
    public void crearLibro(){
        
        System.out.println("Ingresa el titulo");
        String titulo = leer.next();
        
        System.out.println("Ingresa el autor");
        String autor = leer.next();
        
        System.out.println("Ingresa el numero de ejemplates disponibles en la biblioteca");
        int ejemplares = leer.nextInt();
        
        //agregamos el libro al listado
        biblioteca.add(new Libro(titulo, autor, ejemplares, 0));
                
    }
    
    public void mostrarLibros(){
        
        for (Libro libro1 : biblioteca) {
            System.out.println(libro1);
        }
        
    }
    
    /*
    Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca 
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El 
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares 
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un 
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares 
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en 
caso contrario.
    */
    
    public void prestamo(){
        
        System.out.println("Ingresa el libro que quieres buscar");
        String buscado = leer.next();
        boolean noEsta = true;
        
        for (Libro libro1 : biblioteca) {       
            
            
            if (buscado.equalsIgnoreCase(libro1.getTitulo())) {
                //si la cantidad de prestados es menor que la cantidad de ejemplares disponibles, este libro se puede prestar
                int prestados = libro1.getPrestados();
                System.out.println("contamos con " + prestados + " libros prestados de ese titulo");
                System.out.println("La cantidad de ejemplares que poseemos es de: " + libro1.getEjemplares());
                if(libro1.getPrestados()<libro1.getEjemplares()){
                    prestados++;
                    libro1.setPrestados(prestados);
                    System.out.println("Detalle luego de ingresado el prestamo: ");
                    System.out.println("----------------------");
                    System.out.println("Ahora nos quedan disponibles " + (libro1.getEjemplares()-prestados) + " ejemplares del libro " + libro1.getTitulo());
                }else{
                    System.out.println("No contamos con este libro disponible para prestamo en este momento dado que tenemos todos los ejemplares prestados");
                }
                noEsta=false;
            }
            
            if(noEsta){
                System.out.println("No contamos con ese titulo en nuestro listado");
                System.out.println("Listado disponible: ");
                mostrarLibros();
            }
        }
        
    }
    
    /*
    Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan 
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en 
caso contrario.
    */
    
        public void devolucion(){
        
        System.out.println("Ingresa el libro que quieres devolver");
        String buscado = leer.next();
        boolean noEsta = true;
        
        for (Libro libro1 : biblioteca) {
            if (buscado.equalsIgnoreCase(libro1.getTitulo())) {
                int prestados = libro1.getPrestados();
                System.out.println("prestados ahora " + prestados);
                //si la cantidad de prestados es menor a 1 el libro no es de esta biblioteca 
                if(libro1.getPrestados()>1){
                    prestados--;
                    libro1.setPrestados(prestados);
                    System.out.println("prestados despues de la dedvolucion " + libro1.getPrestados());
                }else{
                    System.out.println("No tenemos ejemplares prestados de este libro, estas en la biblioteca equivocada!");
                }
                noEsta=false;
            }
            
            if(noEsta){
                System.out.println("No contamos con ese titulo en nuestro listado");
                System.out.println("Listado disponible: ");
                mostrarLibros();
            }
        }
        
    }
    
    
}
