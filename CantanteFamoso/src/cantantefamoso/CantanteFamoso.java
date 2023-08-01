package cantantefamoso;

/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y 
tendrá como atributos el nombre y discoConMasVentas. 
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos 
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante 
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de 
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario 
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 */
import cantantefamoso.services.CantanteService;
import java.util.Scanner;

public class CantanteFamoso {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CantanteService cs = new CantanteService();

        cs.crearCantantes();

        /*
        crear un menú que le de la opción al usuario de 
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario 
elija o de salir del programa
         */
        
        int menu=0;
        
        while(menu<4){
            System.out.println("Ingresa el valor deseado del menu: ");
            System.out.println("1. Mostrar Listado ");
            System.out.println("2. Agregar un cantante ");
            System.out.println("3. Eliminar un cantante ");
            System.out.println("4. Salir del menu ");
            menu = leer.nextInt();
            
            switch (menu) {
                case 1:
                    cs.mostrarListaDeCantantes();
                    break;
                case 2:
                    cs.agregarCantantes();
                    break;
                case 3:
                    cs.eliminarUnCantante();
                    break;
            }
        }
        
        System.out.println("Saliendo ....");
        
    }

}
