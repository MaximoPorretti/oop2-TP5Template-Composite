package LaserX;

/** Hoja del Composite */
public class EmpleadoRegular extends Empleado {
    public EmpleadoRegular(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalarioTotal() {
        return this.salarioBase;
    }
}