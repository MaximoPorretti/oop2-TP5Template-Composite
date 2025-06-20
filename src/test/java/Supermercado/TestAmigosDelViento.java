package Supermercado;

import SupermercadoAmigosDelViento.Calculador;
import SupermercadoAmigosDelViento.CalculadorJubilado;
import SupermercadoAmigosDelViento.CalculadorNoJubilado;
import SupermercadoAmigosDelViento.LogTransaction;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAmigosDelViento {

        @Test
        public void testJubiladoFueraDePromocion() {
            // Suponiendo que el mes actual NO es enero (por ejemplo junio)
            Month mesActual = LocalDate.now().getMonth();
            int mesPromo = (mesActual.getValue() == 1) ? 2 : 1; // Mes que NO es el actual

            Calculador calc = new CalculadorJubilado(
                    msg -> System.out.println("Log: " + msg),
                    mesPromo
            );

            double precioFinal = calc.calcularPrecio(100.0);
            assertEquals(110.0, precioFinal, 0.0001);
        }

        @Test
        public void testNoJubiladoEnMesDePromocion() {
            int mesActual = LocalDate.now().getMonthValue();

            Calculador calc = new CalculadorNoJubilado(
                    msg -> System.out.println("Log: " + msg),
                    mesActual
            );

            double precioFinal = calc.calcularPrecio(200.0);
            assertEquals(230.0, precioFinal, 0.0001); // 200 + 15%
        }

        @Test
        public void testNoJubiladoFueraDePromocion() {
            Month mesActual = LocalDate.now().getMonth();
            int mesPromo = (mesActual.getValue() == 1) ? 2 : 1;

            Calculador calc = new CalculadorNoJubilado(
                    msg -> System.out.println("Log: " + msg),
                    mesPromo
            );

            double precioFinal = calc.calcularPrecio(200.0);
            assertEquals(242.0, precioFinal, 0.0001); // 200 + 21%
        }
    }
