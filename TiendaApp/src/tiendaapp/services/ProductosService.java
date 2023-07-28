package tiendaapp.services;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import tiendaapp.entities.Productos;

public class ProductosService {

    //CRUD
    /*
    Create 
    Read
    Update
    Delete
     */
    //instanciamos el objeto
    Productos producto = new Productos();
    //creacion del mapa
    //primer valor key: nombre y segundo valor: precio
    HashMap<String, Double> listadoDeProductos = new HashMap();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Create
    public Productos crearProducto() {

        System.out.println("Ingresa el nombre del producto");
        String nombre = leer.next();

        System.out.println("Ingresa el precio");
        Double precio = leer.nextDouble();

        //ingresamos el producto a al map        
        listadoDeProductos.put(nombre, precio);

        return new Productos(nombre, precio);
    }

    //Read
    public void mostrarMapa() {
        for (Map.Entry<String, Double> entry : listadoDeProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            System.out.println("Producto: " + key + ", Precio: " + value);
        }
    }

    //Update
    public void actualizarPrecio() {
        System.out.println("Ingresa el nombre del producto que deseas actualizar");
        String update = leer.next();
        boolean existe = false;

        for (Map.Entry<String, Double> entry : listadoDeProductos.entrySet()) {
            String key = entry.getKey();

            if (key.equalsIgnoreCase(update)) {
                System.out.println("Ingresa el nuevo precio");
                Double nuevoPrecio = leer.nextDouble();
                entry.setValue(nuevoPrecio);
                existe = true;
            }

        }

        if (!existe) {
            System.out.println("El producto ingresado no se encuentra en la lista");
        }
    }

    //Delete
    public void eliminarProducto() {
        System.out.println("Ingresa el nombre del producto que deseas eliminar");
        String delete = leer.next();
        boolean existe = false;

        for (Map.Entry<String, Double> entry : listadoDeProductos.entrySet()) {
            String key = entry.getKey();

            if (key.equalsIgnoreCase(delete)) {
                listadoDeProductos.remove(key);
                existe = true;
            }
        }

        if (!existe) {
            System.out.println("El producto ingresado no se encuentra en la lista");
        }
    }
   

}
