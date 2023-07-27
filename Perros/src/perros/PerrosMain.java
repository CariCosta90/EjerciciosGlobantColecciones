package perros;

import perros.services.PerrosService;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList.

TODO:

    - Objeto perro debe tener de atributo al menos raza
    - Crear arrayList que guarde los perros
 */
public class PerrosMain {

    public static void main(String[] args) {
        
        PerrosService ps = new PerrosService();
        
        ps.cargarPerrosArray();

    }

}
