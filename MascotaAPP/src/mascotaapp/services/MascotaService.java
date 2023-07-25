package mascotaapp.services;

import java.util.ArrayList;
import java.util.Scanner;
import mascotaapp.entities.Mascota;

public class MascotaService {

    private Scanner leer;
    private ArrayList<Mascota> mascotas;
    private Mascota mascota;

    public MascotaService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
        this.mascota = new Mascota();
    }

    public Mascota crearMascota() {

        System.out.println("Ingresa el nombre de la mascota");
        String nombre = leer.next();

        System.out.println("Ingresa el apodo de la mascota");
        String apodo = leer.next();

        System.out.println("Ingresa tipo de mascota");
        String tipo = leer.next();

        return new Mascota(nombre, apodo, tipo);

    }

    public void mostrarMascotas() {
        System.out.println("La lista actual de mascotas es: ");
        for (Mascota mascota1 : mascotas) {
            System.out.println(mascota1.toString());
        }
        System.out.println("La cantidad = " + mascotas.size());
    }

    /**
     *
     * @param cantidad es la cantidad de mascotas a crear y agregar a la lista
     *
     */
    //crea mascotas automatizado, todas con el mismo nombre y datos en general
    //veremos aqui ejemplos de agregar elementos al arrayList por medio del metodo "add"
    public void fabricaMascotas(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota(("Mascota" + i), "Chiqui", "Perro"));
        }
    }

    //crea mascotas con el input asignado en crearMascota
    public void fabricaMascTeclado(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(crearMascota());
        }
    }

    //actualizar objetos
    //TODO aniadir Try y Catch para evitar errores cuando el indice ingresado no es valido
    //usando get:
    public void actualizarMascotaGet(int index) {
        Mascota m = mascotas.get(index);
        m.setApodo("Roberto");
    }

    //usando set
    public void actualizarMascotaSet(int index) {
        Mascota m = crearMascota();
        //aca lo que estamos haciendo es insertar la mascota ingresada ahora en el indice indicado en el set.
        //este crea un nuevo objeto y pisa en base al indice
        mascotas.set(index, m);
    }

    //eliminar datos
    public void eliminarMascota(int index) {
        mascotas.remove(index);
        //para remove con objeto lo que se debe pasar es la referencia del objeto en la memoria
    }

    //eliminar mascota por nombre iterando en la lista 
    public void eliminarMascotaPorNombre(String nombre) {

        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if (m.getNombre().equals(nombre)) {
                mascotas.remove(i);
            }
        }

    }

}
