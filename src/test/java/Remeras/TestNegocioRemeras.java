package Remeras;

import NegocioRemeras.Remera;
import NegocioRemeras.RemeraImportada;
import NegocioRemeras.RemeraNacional;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNegocioRemeras {

    @Test
    void testPrecioRemeraImportada() {
        Remera remera = new RemeraImportada(100.0); // Precio base
        double resultado = remera.calcularPrecioVenta();
        // precio base = 100 + 3 + 5 = 108 → 108 * 1.25 = 135
        assertEquals(135.0, resultado, 0.001);
    }

    @Test
    void testPrecioRemeraNacional() {
        Remera remera = new RemeraNacional(100.0, 20.0); // Precio base y transporte
        double resultado = remera.calcularPrecioVenta();
        // recargo = 20 * 0.015 = 0.3 → bonificación = 20 → base = 80.3 → * 1.15 = 92.345
        assertEquals(92.345, resultado, 0.001);
    }
}
