package ejercicio1;


    public class magohielo extends mago {

        public magohielo(String nombre, double energia) {
            super(nombre, energia);
        }

        @Override
        public void lanzarhechizo() {
            System.out.println(nombre + " lanza una ráfaga de hielo ");
        }
    }

