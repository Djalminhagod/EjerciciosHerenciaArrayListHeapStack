package ejercicio1;

public class main {
    public static void main(String[] args) {

        Double potencia = 50.0;

        torremagica torre = new torremagica();
        mago mago = new mago("nico", 200) {
            @Override
            public void lanzarhechizo() {

            }
        };

        torre.getHabitantes().add(mago);

        ritualmagico.realizaritual(torre.getHabitantes().get(0), potencia);

        System.out.println("Energía del mago tras el ritual: " + mago.getEnergia());
        System.out.println("Potencia en el main: " + potencia);
        System.out.println("Magia mundial restante: " + mago.totalmagiamundial);
    }
}
