package ejercicio2;

public class main {

    public static void main(String[] args) {

        flota flota = new flota();

        dron d1 = new cuadricoptero("dr-001", 40, 4);
        dron d2 = new cuadricoptero("dr-002", 65, 4);

        flota.getMisDrones().add(d1);
        flota.getMisDrones().add(d2);

        flota.repararFlota();

        // intento de cambiar el id (no funciona)
        flota.intentarCambiarId(d1.getId(), "dr-999");

        for (dron d : flota.getMisDrones()) {
            System.out.println(d);
        }
    }
}