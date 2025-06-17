package GestionSeguros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestionSegurosTest {
        @Test
        void testSeguroSimple() {
            Seguro hogar = new SeguroSimple("Hogar", 10000);
            assertEquals(10000, hogar.calcularCosto());
        }

        @Test
        void testPaqueteConDescuento() {
            Seguro auto = new SeguroSimple("Auto", 15000);
            Seguro vida = new SeguroSimple("Vida", 20000);

            PaqueteSeguro paquete = new PaqueteSeguro();
            paquete.agregar(auto);
            paquete.agregar(vida);

            // total base: 15000 + 20000 = 35000
            // descuento: 5% * 2 = 10%
            // esperado: 35000 * 0.90 = 31500
            assertEquals(31500, paquete.calcularCosto(), 0.01);
        }

        @Test
        void testPaqueteAnidado() {
            Seguro medico = new SeguroSimple("Médico", 12000);
            Seguro hogar = new SeguroSimple("Hogar", 8000);

            PaqueteSeguro subPaquete = new PaqueteSeguro();
            subPaquete.agregar(medico);
            subPaquete.agregar(hogar); // total: 20000 -> con 10% descuento = 18000

            Seguro auto = new SeguroSimple("Auto", 10000);

            PaqueteSeguro paqueteGrande = new PaqueteSeguro();
            paqueteGrande.agregar(subPaquete); // 18000
            paqueteGrande.agregar(auto);       // 10000

            // base total: 18000 + 10000 = 28000
            // descuento: 5% * 2 = 10% → 28000 * 0.90 = 25200
            assertEquals(25200, paqueteGrande.calcularCosto(), 0.01);
        }
    }


