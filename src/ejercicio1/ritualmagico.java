package ejercicio1;

public class ritualmagico {

    public static void realizaritual(mago m, Double potencia) {

        // Modificamos el objeto (referencia al heap)
        m.reducirEnergia(50);

        // Intentamos modificar el Wrapper (NO afecta al main)
        potencia += 100;

        // Modificamos variable estática compartida
        if (mago.totalmagiamundial > 0) {
            mago.totalmagiamundial -= 10;
        }

        System.out.println("potencia dentro del ritual: " + potencia);
    }
}
