package template2;


public abstract class Empleado {
    protected float sueldoPorHora;
    protected String nombre;

    public Empleado(float sueldoPorHora, String nombre) {
        this.sueldoPorHora = sueldoPorHora;
        this.nombre = nombre;
    }

    public float sueldo(int horasTrabajadas) {
        return this.sueldoPorHora * horasTrabajadas
                + salarioFamiliar() + antiguedad() - descuentos();
    }

    protected abstract float descuentos();

    protected abstract float antiguedad() ;

    protected abstract float salarioFamiliar() ;

    public String getNombre() {
        return nombre;
    }

    public float getSueldoPorHora() {
        return sueldoPorHora;
    }

}