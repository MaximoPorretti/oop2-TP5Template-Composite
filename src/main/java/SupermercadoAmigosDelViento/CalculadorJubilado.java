package SupermercadoAmigosDelViento;

public class CalculadorJubilado extends CalculadorTemplate {
    public CalculadorJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    @Override
    protected double obtenerPorcentajeIVA(boolean esMesPromo) {
        return esMesPromo ? 0.0 : 0.10;
    }
}