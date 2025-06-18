package ProyectoScrum;

public class TareaDeAnalisis implements ProyectoItemScrum {

    private String descripcion;
    private int tiempo;

    public TareaDeAnalisis(String descripcion, int tiempo) {
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    @Override
    public int tiempoEstimado() {
        return tiempo;
    }

    @Override
    public String toString() {
        return "Tarea de Análisis: " + descripcion + ", Tiempo estimado: " + tiempo + " horas";
    }
}
