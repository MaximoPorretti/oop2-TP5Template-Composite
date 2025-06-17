package ProyectoScrum;


import java.util.ArrayList;
import java.util.List;

public abstract class CompositeItems implements ProyectoItem{
    private String descripcion;
    private List <ProyectoItem> hijosItems = new ArrayList<> ();

    public CompositeItems(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarItem(ProyectoItem item) {
        hijosItems.add(item);
    }

    @Override
    public int tiempoEstimado () {
        int tiempoTotal = 0;
        for (ProyectoItem item : hijosItems) {
            tiempoTotal += item.tiempoEstimado();
        }
        return tiempoTotal;
    }
}
