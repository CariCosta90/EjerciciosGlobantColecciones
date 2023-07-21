package mascotaapp;

import mascotaapp.services.MascotaService;

public class MascotaAPP {

    public static void main(String[] args) {

        MascotaService ms = new MascotaService();

        ms.fabricaMascotas(2);
        ms.mostrarMascotas();
        ms.crearMascota();
        ms.mostrarMascotas();

    }

}
