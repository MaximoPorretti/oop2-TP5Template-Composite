package GestionSeguros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestionSegurosTest {

        @Test
        public void testPaqueteCon2SegurosSimples() {
            Seguro auto = new SeguroSimple("Auto", 1000);
            Seguro hogar = new SeguroSimple("Hogar", 500);

            PaqueteSeguro paquete = new PaqueteSeguro();
            paquete.agregar(auto);
            paquete.agregar(hogar);

            int esperado1 = (int) ((1000 + 500) * 0.90); // 10% de descuento por 2 seguros
           int resultado1= (int) paquete.calcularCosto();
           int esperado2 = 1500;
              int resultado2 = (int) paquete.getCostoBase(); // costo base sin descuento
            assertEquals(esperado1, resultado1);
            assertEquals(esperado2, resultado2);
        }

        @Test
        public void testPaqueteAnidadoConSubPaquete() {
            Seguro vida = new SeguroSimple("Vida", 800);
            Seguro medico = new SeguroSimple("Médico", 600);

            PaqueteSeguro subPaquete = new PaqueteSeguro();
            subPaquete.agregar(vida);
            subPaquete.agregar(medico);


            Seguro auto = new SeguroSimple("Auto", 1000);

            PaqueteSeguro paqueteFinal = new PaqueteSeguro();
            paqueteFinal.agregar(subPaquete); // cuenta como 1
            paqueteFinal.agregar(auto);       // cuenta como 2 → 10% descuento

            int esperado = (int) ((1260 + 1000) * 0.90);
            int resultado = (int) paqueteFinal.calcularCosto();
            assertEquals(esperado,resultado);
        }
    }


