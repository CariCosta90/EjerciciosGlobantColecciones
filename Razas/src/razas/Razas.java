package razas;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.Iterator;
import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class Razas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Creamos arrayList para los perros    
        ArrayList<String> listaPerros = new ArrayList();

        boolean continuar = true;

        System.out.println("Ingresaremos algunas razas de perros");

        do {
            System.out.println("Ingresa una raza de perro: ");
            listaPerros.add(leer.next());
            System.out.println("Deseas ingresar otro perro? s/n");
            String respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }

        } while (continuar);

        System.out.println("Saliendo de creacion de perros");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("La lista actual de perros es: ");
        for (String listaPerro : listaPerros) {
            System.out.println(listaPerro);
        }

        /*
        Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
        un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
        está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
        ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
        la lista ordenada. 
         */
        
        System.out.println("Ingresa un perro para buscar");
        String busqueda = leer.next();
        
        //Creamos el iterator para recorrer la lista 
        Iterator iterator = listaPerros.iterator(); 
        
        //creo un boolean para setear y mostrar si no estaba 
        boolean noEsta = true;
        //armamos un bucle while para recorrer la lista con el iterador
        while(iterator.hasNext()){
            if(iterator.next().equals(busqueda)){ // borraremos si esta la raza ingresada por input
                iterator.remove();
                System.out.println("Se eliminara " + busqueda + " de la lista");
                noEsta = false;
            }
        }
        
        if(noEsta){
            System.out.println("La raza ingresada no esta en la lista");
        }
        
        System.out.println("La lista actual es: ");
        
        //mostramos la lista ordenada
        Collections.sort(listaPerros);
        for (String listaPerro : listaPerros) {
            System.out.println(listaPerro);
        }
        
    }

}
