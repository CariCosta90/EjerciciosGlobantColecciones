package perros.services;

import java.util.ArrayList;
import java.util.Scanner;
import perros.entities.Perros;

public class PerrosService {

    /*
    debemos tener 
    --> arrayList para guardar los perros
    --> metodo para crear perros
    --> metodo para completar el arrayList con perros agregados (debe preguntar si quiere agregar otro)
    --> metodo para mostrar el arrayList de perros
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //instanciamos el objeto perro en el service
    Perros perro = new Perros();
    //Creamos arrayList para los perros    
    ArrayList<Perros> listaPerros = new ArrayList();

    //metodo para crear perros
    public Perros crearPerro() {

        System.out.println("Ingresa el nombre del perro");
        String nombre = leer.next();
        System.out.println("Ingresa la raza del perro");
        String raza = leer.next();

        return new Perros(nombre, raza);

    }

    //metodo para crear/ingresar perros al arrayList, tiene que preguntar si se quiere agregar otro
    public void cargarPerrosArray() {

        boolean continuar = true;

        do {
            listaPerros.add(crearPerro());
            System.out.println("Deseas ingresar otro perro? s/n");
            String respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }

        } while (continuar);

        System.out.println("Saliendo de creacion de perros");
        mostrarListaDePerros();

    }

    //metodo para mostrar el arrayList
    public void mostrarListaDePerros() {

        System.out.println("La lista actual de perros es: ");

        for (Perros listaPerro : listaPerros) {
            System.out.println(listaPerro);
        }
    }

    /*
    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
    un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
    está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
    ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
    la lista ordenada.
     */
    
    
}
