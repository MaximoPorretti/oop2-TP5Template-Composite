package ProyectoScrum;


import java.time.LocalDate;

public class Spike implements ProyectoItem{

    private String descripcion;
    private int tiempo;

    public Spike(String descripcion, int tiempo) {
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    @Override
    public int tiempoEstimado () {
        return tiempo;
    }
}
