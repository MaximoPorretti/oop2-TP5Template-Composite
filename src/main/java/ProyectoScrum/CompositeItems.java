package ProyectoScrum;


import java.util.ArrayList;
import java.util.List;

public abstract class CompositeItems implements ProyectoItemScrum {
    private String descripcion;
    private List <ProyectoItemScrum> hijosItems = new ArrayList<> ();

    public CompositeItems(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarItem(ProyectoItemScrum item) {
        hijosItems.add(item);
    }

    @Override
    public int tiempoEstimado () {
        int tiempoTotal = 0;
        for (ProyectoItemScrum item : hijosItems) {
            tiempoTotal += item.tiempoEstimado();
        }
        return tiempoTotal;
    }
}
