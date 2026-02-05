package ejercicio2;

public class cuadricoptero extends dron {

    private int rotores;

    public cuadricoptero(String id, int bateria, int rotores) {
        super(id, bateria);
        this.rotores = rotores;
    }

    @Override
    public String toString() {
        return "cuadricoptero{id='" + id + "', bateria=" + bateria +
                "%, rotores=" + rotores + "}";
    }
}
