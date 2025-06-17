package SupermercadoAmigosDelViento;

import java.time.LocalDate;
import java.time.Month;

public abstract class CalculadorTemplate implements Calculador {

    protected final LogTransaction log;
    protected final Month mesEnPromocion;

    public CalculadorTemplate(LogTransaction log, int mesEnPromocion) {
        this.log = log;
        this.mesEnPromocion = Month.of(mesEnPromocion);
    }

    // TEMPLATE METHOD: no se puede modificar
    @Override
    public final double calcularPrecio(double precioProducto) {
        boolean esPromo = mesEnPromocion.equals(LocalDate.now().getMonth());
        double iva = obtenerPorcentajeIVA(esPromo);
        double precioFinal = precioProducto * (1 + iva);
        log.log(getClass().getSimpleName());
        return precioFinal;
    }

    // "Hook" que las subclases deben implementar
    protected abstract double obtenerPorcentajeIVA(boolean esMesPromo);
}