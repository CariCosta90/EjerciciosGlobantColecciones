
package mascotaapp.services;

import java.util.ArrayList;
import java.util.Scanner;
import mascotaapp.entities.Mascota;


public class MascotaService {
    
    private Scanner leer; 
    private ArrayList<Mascota> mascotas;
    private Mascota mascota;
    
    public MascotaService(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
        this.mascota = new Mascota();
    }
    
    
    
    public Mascota crearMascota(){
        
        System.out.println("Ingresa el nombre de la mascota");
        mascota.setNombre(leer.next());
        
        System.out.println("Ingresa el apodo de la mascota");
        mascota.setApodo(leer.next());
        
        System.out.println("Ingresa tipo de mascota");
        mascota.setTipo(leer.next());
        
        mascotas.add(mascota);
     
        return mascota;
        
    }
    
    public void mostrarMascotas(){
        System.out.println("La lista actual de mascotas es: "); 
        for (Mascota mascota1 : mascotas) {
            System.out.println(mascota1.toString());
        }        
        System.out.println("La cantidad = " + mascotas.size());
    }
    
    /**
     * 
     * @param cantidad es la cantidad de mascotas a crear y agregar a la lista
     */
    
    public void fabricaMascotas(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota(("Mascota"+i), "Chiqui", "Perro"));
        }
    }
    
    public void fabricaMascTeclado(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            crearMascota();
        }
    }
    

}
