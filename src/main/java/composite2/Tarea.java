package composite2;

public class Tarea implements ItemDeProyecto {
    private final String nombre;
   private  final PrintConsola printer ;

    public Tarea(String nombre , PrintConsola printer) {
        this.printer = printer;
        this.nombre = nombre;
    }


    @Override
    public void printItem(String indent) {
        this.printer.println(indent + "- " + nombre);
    }
}
