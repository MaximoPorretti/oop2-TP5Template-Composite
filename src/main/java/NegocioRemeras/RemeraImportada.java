package NegocioRemeras;

public class RemeraImportada extends Remera {

    public RemeraImportada(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected double calcularPrecioBase() {
        double recargo = precioUnitario * 0.03;
        double impuestoAduanero = precioUnitario * 0.05;
        return precioUnitario + recargo + impuestoAduanero;
    }

    @Override
    protected double aplicarMargenComercial(double base) {
        return base * 1.25; // 25% de margen
    }
}
