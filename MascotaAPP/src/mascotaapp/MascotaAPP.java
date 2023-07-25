package mascotaapp;

import java.util.Scanner;
import mascotaapp.services.MascotaService;

public class MascotaAPP {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

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
        
        
       
    }

}
