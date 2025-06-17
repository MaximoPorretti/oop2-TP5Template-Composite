package ProyectoScrum;

public class MainScrum {    public static void main(String[] args) {
    Tarea t1 = new Tarea("Implementar ", 4);
    Tarea t2 = new Tarea("Crear servicio", 5);
    Spike s1 = new Spike("Investigar y Documentar", 18);

    HistoriaUsuario historiaLogin = new HistoriaUsuario("Historia: implementar");
    historiaLogin.agregarItem (s1);
    historiaLogin.agregarItem (t1);

    HistoriaUsuario historiaApi = new HistoriaUsuario("Historia: API");
    historiaApi.agregarItem (t2);

    ProyectoRoot proyecto = new ProyectoRoot ("Proyecto SCRUM X");
    proyecto.agregarItem(historiaLogin);
    proyecto.agregarItem(historiaApi);

    System.out.println("Tiempo total proyecto: " + proyecto.tiempoEstimado() + "h");

}
}
