package NegocioRemeras;

public abstract class Remera implements Calculable {
    protected double precioUnitario;

    public Remera(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public final double calcularPrecioVenta() {
        double precioBase = calcularPrecioBase();
        return aplicarMargenComercial(precioBase);
    }

    protected abstract double calcularPrecioBase();

    protected abstract double aplicarMargenComercial(double base);
}
