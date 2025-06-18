package ProyectoScrum;



public class Tarea implements ProyectoItemScrum {
    private String Comentario;
    private int tiempo;

    public Tarea(String comentario, int tiempoEstimado) {
        this.Comentario = comentario;
        this.tiempo = tiempoEstimado;
    }

    @Override
    public int tiempoEstimado () {
        return tiempo;
    }
}
