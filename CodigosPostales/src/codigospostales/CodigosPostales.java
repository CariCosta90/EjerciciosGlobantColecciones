package codigospostales;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodigosPostales {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        HashMap<Integer, String> cp = new HashMap();

        //ingresamos datos a la lista 
        cp.put(55005, "Javier de Viana");
        cp.put(15006, "Lomas de Solymar");
        cp.put(11000, "Motevideo");

        //• Pedirle al usuario que ingrese 10 (pongo menos para las pruebas, corregir) códigos postales y sus ciudades
        System.out.println("Ingresa codigos postales y ciudades ");

        for (int i = 0; i < 1; i++) {
            System.out.println("Ingresa el codigo postal");
            int codigo = leer.nextInt();
            System.out.println("Ingresa la ciudad");
            String ciudad = leer.next();

            cp.put(codigo, ciudad);
        }

        //Muestra por pantalla los datos introducidos
        for (Map.Entry<Integer, String> entry : cp.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Codigo: " + key + " Ciudad: " + value);

        }

        //Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario
        System.out.println("Ingresa el codigo de la ciudad a buscar");

        int buscado = leer.nextInt();
        boolean noEsta = true;

        for (Map.Entry<Integer, String> entry : cp.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            if (key == buscado) {
                noEsta = false;
                System.out.println("La ciudad que corresponde al codigo: " + key + " es: " + value);
            }

        }

        if (noEsta) {
            System.out.println("La ciudad buscada no se encuentra en el listado");
        }

        //Agregar una ciudad con su código postal correspondiente más al HashMap.
        System.out.println("Ingresa una ciudad mas");
        System.out.println("Ingresa el codigo postal");
        int codigo = leer.nextInt();
        System.out.println("Ingresa la ciudad");
        String ciudad = leer.next();

        cp.put(codigo, ciudad);

        // Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
        System.out.println("Ingresa los codigos de 3 ciudades para eliminar");

        for (int i = 0; i < 3; i++) {
            System.out.println("Codigo: ");
            buscado = leer.nextInt();
            
            if(cp.containsKey(buscado)){
                cp.remove(buscado);
                System.out.println("Se eliminara la ciudad relacionada al codigo " + buscado);
            }else{
                System.out.println("El codigo: " + buscado + " no se encuentra en el listado");
            }

        }
        
        
        //Muestra por pantalla los datos 
        for (Map.Entry<Integer, String> entry : cp.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Codigo: " + key + " Ciudad: " + value);

        }

    }

}
