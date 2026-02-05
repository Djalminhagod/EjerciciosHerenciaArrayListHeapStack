package ejercicio1;

public class MagoFuego extends mago {

        public MagoFuego(String nombre, double energia) {
        super(nombre, energia);
        }

        @Override
        public void lanzarhechizo() {
        System.out.println(nombre + " lanza una bola de fuego ");
    }
}
