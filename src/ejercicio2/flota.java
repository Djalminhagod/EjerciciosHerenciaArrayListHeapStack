package ejercicio2;

import java.util.ArrayList;

public class flota {

    private ArrayList<dron> misDrones;

    public flota() {
        misDrones = new ArrayList<>();
    }

    public ArrayList<dron> getMisDrones() {
        return misDrones;
    }

    // recorre la lista y repara la flota
    public void repararFlota() {
        for (dron d : misDrones) {
            cambiarBateria(d, 100);
        }
    }

    // modifica el objeto (referencia al heap)
    public static void cambiarBateria(dron d, int nuevaCarga) {
        d.setBateria(nuevaCarga);
    }

    // intento fallido de cambiar un String
    public static void intentarCambiarId(String idActual, String idNuevo) {
        idActual = idNuevo;
    }
}
