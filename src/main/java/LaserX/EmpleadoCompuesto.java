package LaserX;

import java.util.ArrayList;
import java.util.List;

/** Compuesto (Composite) */
public abstract class EmpleadoCompuesto extends Empleado {
    protected List<Empleado> subordinados;

    public EmpleadoCompuesto(String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.subordinados = new ArrayList<>();
    }

    public void agregarSubordinado(Empleado empleado) {
        this.subordinados.add(empleado);
    }

    public void eliminarSubordinado(Empleado empleado) {
        this.subordinados.remove(empleado);
    }

    @Override
    public double calcularSalarioTotal() {
        double total = this.salarioBase;
        for (Empleado subordinado : subordinados) {
            total += subordinado.calcularSalarioTotal();
        }
        return total;
    }
}