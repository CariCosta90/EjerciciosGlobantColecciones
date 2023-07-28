package tiendaapp;

import java.util.Scanner;
import tiendaapp.services.ProductosService;

public class TiendaApp {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ProductosService ps = new ProductosService();

        int menu = 0;

        do {
            System.out.println("Selecciona la opcion deseada del menu");
            System.out.println("");
            System.out.println("1. Crear producto");
            System.out.println("2. Mostrar listado de productos");
            System.out.println("3. Actualizar precio de prodcto");
            System.out.println("4. Eliminar Producto");
            System.out.println("5. Salir");

            menu = leer.nextInt();
            
            if(menu<=0){
                System.out.println("El valor ingresado no es valido, ingresalo nuevamente");
                menu = leer.nextInt();
            }
            
            switch (menu) {
                case 1:
                    ps.crearProducto();
                    break;
                case 2:
                    ps.mostrarMapa();
                    break;
                case 3:
                    ps.actualizarPrecio();
                    break;
                case 4:
                    ps.eliminarProducto();
                    break;
            }

        } while (menu < 5);

        System.out.println("Saliendo...");

    }

}
