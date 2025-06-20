package Remeras;

import NegocioRemeras.Remera;
import NegocioRemeras.RemeraImportada;
import NegocioRemeras.RemeraNacional;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

public class TestNegocioRemeras {

    @Test
    @DisplayName("Precio de remera importada con recargos, impuestos")
    void testPrecioRemeraImportada() {
        Remera remera = new RemeraImportada(100.0);
        double resultado = remera.calcularPrecioVenta();
        assertEquals(135.0, resultado, 0.001);
    }

    @Test
    @DisplayName("Precio de remera nacional con bonificación y recargo")
    void testPrecioRemeraNacional() {
        Remera remera = new RemeraNacional(100.0, 20.0);
        double resultado = remera.calcularPrecioVenta();
        assertEquals(92.345, resultado, 0.001);
    }
}
