package mascotaapp.utilities;

import java.util.Comparator;
import mascotaapp.entities.Mascota;

public class Comparadores {

    /*
    establece una comparacion entre atributos u objetos y devuelve un valor
     */
    public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t1.getNombre().compareTo(t.getNombre());
        }
    };

    public static Comparator<Mascota> ordenarPorEdadDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t1.getEdad().compareTo(t.getEdad());
        }
    };
}
