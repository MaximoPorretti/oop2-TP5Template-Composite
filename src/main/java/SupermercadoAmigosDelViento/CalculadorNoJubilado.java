package SupermercadoAmigosDelViento;

public class CalculadorNoJubilado extends CalculadorTemplate {
    public CalculadorNoJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    @Override
    protected double obtenerPorcentajeIVA(boolean esMesPromo) {
        return esMesPromo ? 0.15 : 0.21;
    }
}