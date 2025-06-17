package GestionSeguros;

// Hoja: seguro individual
public class SeguroSimple implements Seguro {
    private String tipo;
    private double costoBase;

    public SeguroSimple(String tipo, double costoBase) {
        this.tipo = tipo;
        this.costoBase = costoBase;
    }

    @Override
    public double getCostoBase() {
        return costoBase;
    }

    @Override
    public double calcularCosto() {
        return costoBase;
    }
}
