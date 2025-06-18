package ProyectoScrum;

public class MainScrum {    public static void main(String[] args) {
    Tarea t1 = new Tarea("Implementar ", 4);
    Tarea t2 = new Tarea("Crear servicio", 5);
    TareaDeAnalisis s1 = new TareaDeAnalisis("Analizar API", 3);
    TareaDeAnalisis s2 = new TareaDeAnalisis("Analizar base de datos", 2);

    Spike spike1 = new Spike("Spike: investigar librería");
    spike1.agregarItem(s1);
    spike1.agregarItem(s2);


    HistoriaUsuario historiaLogin = new HistoriaUsuario("Historia: implementar");
    historiaLogin.agregarItem (t2);
    historiaLogin.agregarItem (t1);

    HistoriaUsuario historiaApi = new HistoriaUsuario("Historia: API");
    historiaApi.agregarItem (t2);

    Proyecto proyecto = new Proyecto("Proyecto SCRUM X");
    proyecto.agregarItem(historiaLogin);
    proyecto.agregarItem(historiaApi);

    System.out.println("Tiempo total proyecto: " + proyecto.tiempoEstimado() + "h");
    System.out.println("Tiempo total historiaLogin: " + historiaLogin.tiempoEstimado() + "h");
    System.out.println("Tiempo total historiaApi: " + historiaApi.tiempoEstimado() + "h");
    System.out.println("Tiempo total spike1: " + spike1.tiempoEstimado() + "h");
    System.out.println("Tiempo total tarea t1: " + t1.tiempoEstimado() + "h");
    System.out.println("Tiempo total tarea t2: " + t2.tiempoEstimado() + "h");

}
}
