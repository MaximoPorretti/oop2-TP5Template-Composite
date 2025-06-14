package template2;

public class Aprendiz extends Empleado {
    public Aprendiz(float sueldoPorHora, String nombre) {
        super(sueldoPorHora, nombre);
    }

@Override
    public float sueldo(int horasTrabajadas) {
        return super.sueldo(horasTrabajadas);
    }

    @Override
    protected float descuentos() {
        return 0;
    }

    @Override
    protected float antiguedad() {
        return 0;
    }

    @Override
    protected float salarioFamiliar() {
        return 0;
    }
}
