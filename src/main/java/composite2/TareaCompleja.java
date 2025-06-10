package composite2;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja implements ItemDeProyecto {
    private String nombre;
    private List<ItemDeProyecto> subtareas = new ArrayList<>(); // No hay herencia común, usamos Object
   private final PrintConsola printer;
    public TareaCompleja(String nombre, PrintConsola printer) {
        this.nombre = nombre;
        this.printer = printer;
    }


    @Override
    public void printItem(String indent) {
        this.printer.println(indent + "+ " + nombre);
        for (ItemDeProyecto sub : subtareas) {
            sub.printItem(indent + "  ");
        }
    }

    public void agregarSubtarea(Tarea correrTestsManuales) {
        subtareas.add(correrTestsManuales);
    }
}
