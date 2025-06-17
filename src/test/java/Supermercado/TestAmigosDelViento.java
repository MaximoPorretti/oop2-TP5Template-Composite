package Supermercado;

import SupermercadoAmigosDelViento.Calculador;
import SupermercadoAmigosDelViento.CalculadorJubilado;
import SupermercadoAmigosDelViento.CalculadorNoJubilado;
import SupermercadoAmigosDelViento.LogTransaction;
import org.testng.annotations.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAmigosDelViento {
    @Test
    void jubiladoFueraDePromo() {
        LogTransaction log = s -> {};
        Calculador calc = new CalculadorJubilado(log, 6); // promo junio
        double precio = calc.calcularPrecio(100); // suponer hoy NO es junio
        assertEquals(110, precio, 0.001);
    }

    @Test
    void noJubiladoEnPromo() {
        LogTransaction log = s -> {};
        int mesActual = LocalDate.now().getMonthValue();
        Calculador calc = new CalculadorNoJubilado(log, mesActual); // promo actual
        double precio = calc.calcularPrecio(100);
        assertEquals(115, precio, 0.001);
    }

}
