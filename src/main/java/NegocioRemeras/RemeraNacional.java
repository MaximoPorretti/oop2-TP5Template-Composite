package NegocioRemeras;

public class RemeraNacional extends Remera {
    private double costoTransporte;

    public RemeraNacional(double precioUnitario, double costoTransporte) {
        super(precioUnitario);
        this.costoTransporte = costoTransporte;
    }

    @Override
    protected double calcularPrecioBase() {
        double recargo = costoTransporte * 0.015;
        double bonificacion = precioUnitario * 0.20;
        return (precioUnitario + recargo) - bonificacion;
    }

    @Override
    protected double aplicarMargenComercial(double base) {
        return base * 1.15; // 15% de margen
    }
}
