package mascotaapp;

import java.util.ArrayList;
import java.util.Scanner;
import mascotaapp.entities.Mascota;
import mascotaapp.services.MascotaService;
import java.util.Collections;
import mascotaapp.utilities.Comparadores;

public class MascotaAPP {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        /* DESCOMENTAR
        

        MascotaService ms = new MascotaService();
        System.out.println("Fabrica automatica");
        ms.fabricaMascotas(3);
        ms.mostrarMascotas();
        System.out.println("Crear mascota a mano");
        ms.fabricaMascTeclado(1);
        ms.mostrarMascotas();
        System.out.println("Actualizar mascota con Get indicando el indice, le asignara el apodo Roberto");
        ms.actualizarMascotaGet(2);
        ms.mostrarMascotas();
        System.out.println("Actualizar mascota indicando el indice y cargando los datos nuevos por input");
        ms.actualizarMascotaSet(0);
        ms.mostrarMascotas();
        System.out.println("--------------------------------");
        System.out.println("Eliminamos una mascota por indice");
        ms.eliminarMascota(3);
        ms.mostrarMascotas();
        System.out.println("Trabajamos con iteracion eliminando un elemento de la lista buscando por nombre");
        System.out.println("Ingresa el nombre de la mascota que buscamos eliminar");
        ms.eliminarMascotaPorNombre(leer.next());
        ms.mostrarMascotas();
        
        
        
       DESCOMENTAR         */

 /*
         * como convertir un array a arrayList
         * 
         *CREAMOS EL ARRAY
        String[] nombres = {"Pepe", "Pepa"};
        
         * Y LO PASAMOS A ARRAY LIST POR MEDIO DEL METODO asList
        List <String> nombresList = new ArrayList(Arrays.asList(nombres));

        Tambien se puede agregar un arrayList a otro ArrayList
        
        List<String> nombresList2 = new ArrayList();
        nombresList2.addAll(nombresList);
         */
        //para crear una matriz se crea una lista de lista:
        /*
         ArrayList<ArrayList<String>> matriz = new ArrayList();        
         */
        //PARA TRABAJAR CON EL COMPARATOR: 
        //creo un array de mascotas y le agrego un par de elementos
        ArrayList<Mascota> masc1 = new ArrayList();

        masc1.add(new Mascota("Fernando", "Pipo", "Perro", 8, true, "jnosidfg", "negro", 4));
        masc1.add(new Mascota("Pepe", "Pepe", "Gato", 12, true, "jnosidfg", "negro", 4));
        masc1.add(new Mascota("otro", "Pepe", "Gato", 1, true, "jnosidfg", "negro", 4));
        masc1.add(new Mascota("otro2", "Pepe", "Gato", 5, true, "jnosidfg", "negro", 4));
        //al mostrar aca se veran en el orden en el que fueron ingresados

        System.out.println("antes de usar el comparador");
        for (Mascota mascota : masc1) {
            System.out.println(mascota);
        }
        //usamos el comparator de nombre para reorganizar

        Collections.sort(masc1, Comparadores.ordenarPorNombreDesc);
        System.out.println("despues de usar el comparador por nombre");
        for (Mascota mascota : masc1) {
            System.out.println(mascota);
        }

        //usamos el comparator de edad
        Collections.sort(masc1, Comparadores.ordenarPorEdadDesc);
        System.out.println("Ordenamos por edad desc");
        for (Mascota mascota : masc1) {
            System.out.println(mascota);
        }

    }

}
