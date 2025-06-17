package LaserX;

/*1. La empresa "Laser X" posee los siguientes roles de empleados: directores, gerentes,
 mandos medios, líderes de proyecto y empleados regulares. Todos tienen gente a su
cargo, salvo los empleados regulares. Los directores tienen a su cargo gerentes, los
gerentes a mandos medios, los mandos medios a líderes de proyecto y éstos a
empleados regulares.
a) Implemente en Java el modelo de objetos para permitir calcular el monto total salarial
de la empresa utilizando el patrón Composite. Escriba dos casos de test
/** Componente (raíz del Composite) */

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calcularSalarioTotal();
}






