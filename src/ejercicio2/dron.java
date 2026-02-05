package ejercicio2;

public class dron {

    protected String id;
    protected int bateria;

    public dron(String id, int bateria) {
        this.id = id;
        this.bateria = bateria;
    }

    public String getId() {
        return id;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "dron{id='" + id + "', bateria=" + bateria + "%}";
    }
}



