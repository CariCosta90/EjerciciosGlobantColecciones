package mascotaapp;

import java.util.ArrayList;
import java.util.Scanner;
import mascotaapp.entities.Mascota;
import mascotaapp.services.MascotaService;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import mascotaapp.enumeraciones.Raza;
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

        masc1.add(new Mascota("Fernando", "Pipo", "Perro", 8, true, Raza.BEAGLE, "negro", 4));
        masc1.add(new Mascota("Pepe", "Pepe", "Gato", 12, true, Raza.COCKER, "negro", 4));
        masc1.add(new Mascota("otro", "Pepe", "Gato", 1, true, Raza.BORDER_COLLIE, "negro", 4));
        masc1.add(new Mascota("otro2", "Pepe", "Gato", 5, true, Raza.SIN_RAZA, "negro", 4));
        //al mostrar aca se veran en el orden en el que fueron ingresados

        System.out.println("antes de usar el comparador");
        System.out.println("");
        for (Mascota mascota : masc1) {
            System.out.println(mascota);
        }
        //usamos el comparator de nombre para reorganizar

        Collections.sort(masc1, Comparadores.ordenarPorNombreDesc);
        System.out.println("despues de usar el comparador por nombre");
        System.out.println("");
        for (Mascota mascota : masc1) {
            System.out.println(mascota);
        }

        //usamos el comparator de edad
        Collections.sort(masc1, Comparadores.ordenarPorEdadDesc);
        System.out.println("");
        System.out.println("Ordenamos por edad desc");
        for (Mascota mascota : masc1) {
            System.out.println(mascota);
        }
        
        //de aca para abajo trabajaremos con ejemplos de SET
        System.out.println("-------------");
        
        System.out.println("desde aca trabajamos con SET");
        System.out.println("");
        
        
        Set<Mascota> masc2 = new HashSet();
        
        //voy a crear elementos duplicados para poder aprender como ensenarle al Set a que entienda como evaluar los duplicados
        
        masc2.add(new Mascota("Chiquito", "Chiqui", "Perro"));
        masc2.add(new Mascota("Chiquito", "Chiqui", "Perro"));
        masc2.add(new Mascota("Chiquito", "Chiqui", "Perro"));
        masc2.add(new Mascota("Chiquito", "Lola", "Perro"));
        masc2.add(new Mascota("Pepa", "Lola", "Perro"));
        masc2.add(new Mascota("Pepa", "Lola", "Perro"));
        masc2.add(new Mascota("Chiquito", "Chiqui", "Perro"));
        
        for (Mascota mascota : masc2) {
            System.out.println(mascota);
        }
        
        //de aca para abajo ponemos un ejemplo de MAP
        System.out.println("------------------------");
        System.out.println("");
        
        System.out.println("De aca para abajo trabajamos con MAP");
        
        HashMap<Integer, Mascota> masc3 = new HashMap();
        
        //para agregar elementos al map se usa put en vez de add
        
        masc3.put(1, new Mascota("Chiquito", "Chiqui", "Perro"));
        masc3.put(2, new Mascota("Chiquito", "Chiqui", "Perro"));
        masc3.put(3, new Mascota("Pepa", "Lola", "Perro"));
        masc3.put(4, new Mascota("Chiquito", "Chiqui", "Perro"));
        
        
        //para mostrar un mapa se hace un for especifico

        for (Map.Entry<Integer, Mascota> aux : masc3.entrySet()) {
            Integer key = aux.getKey();
            Mascota value = aux.getValue();
            
            System.out.println("Key: " + key + " Value: "+ value);
            
        }
        
        //para remover un elmento se puede hacer usando la key:
        masc3.remove(2);
        
        System.out.println("");
        System.out.println("Mapa despues de remove");
        for (Map.Entry<Integer, Mascota> aux : masc3.entrySet()) {
            Integer key = aux.getKey();
            Mascota value = aux.getValue();
            
            System.out.println("Key: " + key + " Value: "+ value);
            
        }
        
        
        //como recorrer un enum 
        for (Raza raza : Raza.values()) {
            System.out.println(raza);
        }
        //para usar en comparacion con dato de input se tiene que convertir el tipo de dato (ej .toString())
    }
    
        
    
    
    
    
    

}
