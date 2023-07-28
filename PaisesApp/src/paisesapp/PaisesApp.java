package paisesapp;

/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
al usuario
 */
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Scanner;

public class PaisesApp {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //usaremos un set en este caso dado que voy a querer ordenarlo despues elijo un treeSet
        TreeSet<String> paises = new TreeSet();

        //creo un boolean para usar de verificador
        boolean verificador = true;

        do {

            System.out.println("Ingresa un pais al listado");
            paises.add(leer.next());
            System.out.println("Deseas ingresar otro? s/n");
            String respuesta = leer.next();
            
            while(!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")){
                System.out.println("El valor ingresado no es valido intentalo nuevamente: s o n");
                respuesta = leer.next();
            }            
           
            if (respuesta.equalsIgnoreCase("n")) {
                verificador = false;
                System.out.println("Salienfo de la carga de paises");
            }

        } while (verificador);

        System.out.println("La lista completa ingresada es:");

        for (String pais : paises) {
            System.out.println(pais);
        }

        System.out.println("Ingresa el pais a buscar");
        String buscado = leer.next();
        boolean esta = true;
        //usamos el iterator para recorrer el set y eliminar el pais buscado
        Iterator iterator = paises.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(buscado)) {
                iterator.remove();
                esta = false;
            }
        }

        if (!esta) {
            System.out.println("El pais ingresado  " + buscado + " no se encuentra en la lista");
        }

        System.out.println("El listado de paises luego de la limpieza es: ");

        //y mostramos el set nuevamente luego de eliminado
        for (String pais : paises) {
            System.out.println(pais);
        }

    }

}
