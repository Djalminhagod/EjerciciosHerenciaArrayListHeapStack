package ejercicio1;

import java.util.ArrayList;

public abstract class mago {
    protected String nombre;
    protected double energia;
    protected ArrayList<String> hechizos;

    public static int totalmagiamundial = 1000;

    mago(String nombre, double energia) {
        this.nombre = nombre;
        this.energia = 0;
        hechizos = new ArrayList<>();
    }
    public double getEnergia() {
        return energia;
    }

    public void reducirEnergia(double cantidad) {
        this.energia -= cantidad;
    }
    public abstract void lanzarhechizo();


}
