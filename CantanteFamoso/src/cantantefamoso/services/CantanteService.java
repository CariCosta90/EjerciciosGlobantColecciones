package cantantefamoso.services;

import cantantefamoso.entities.Cantante;
import java.util.ArrayList;
import java.util.Scanner;

public class CantanteService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Cantante> CantanteFamoso = new ArrayList();

    Cantante cantante = new Cantante();

    public void crearCantantes() {
        //creamos 5 cantantes

        for (int i = 0; i < 5; i++) {
            cantante = new Cantante("Cantante" + i, "disco" + i);
            CantanteFamoso.add(cantante);
        }

    }

    /*
    crear un menú que le de la opción al usuario de 
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario 
elija o de salir del programa
     */
    public void agregarCantantes() {
        System.out.println("Ingresa los datos del cantantea agregar: ");
        System.out.println(" ");
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Disco con mas ventas: ");
        String discoConMasVentas = leer.next();

        CantanteFamoso.add(new Cantante(nombre, discoConMasVentas));

    }

    public void mostrarListaDeCantantes() {

        //mostramos lista de cantantes
        for (Cantante cantante1 : CantanteFamoso) {
            System.out.println(cantante1);
        }

    }

    public void eliminarUnCantante() {
        System.out.println("Indica el nombre del cantante que quieres eliminar: ");
        String nombre = leer.next();

        boolean noEsta = true;

        for (int i = 0; i < CantanteFamoso.size(); i++) {

            if (CantanteFamoso.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El cantante: "+CantanteFamoso.get(i).getNombre()+" sera eliminado");
                CantanteFamoso.remove(CantanteFamoso.get(i));
                noEsta = false;                      
            }

        }
        if (noEsta) {
            System.out.println("El nombre ingresado no se encuentra en la lista");
        }
    }
}
