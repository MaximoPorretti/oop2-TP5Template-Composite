package ProyectoScrum;
import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

public class ProyectoScrumTest {

    @Test
    public void testTiempoTotalProyectoSimple() {
        Proyecto proyecto = new Proyecto("Proyecto API");

        HistoriaUsuario historia1 = new HistoriaUsuario("Login de usuario");
        historia1.agregarItem(new Tarea("Diseñar pantalla login", 4));
        historia1.agregarItem(new Tarea("Conectar backend", 6));

        Spike spike1 = new Spike("Estudio de arquitectura");
        spike1.agregarItem(new TareaDeAnalisis("Comparar frameworks", 3));

        proyecto.agregarItem(historia1);
        proyecto.agregarItem(spike1);

        // Total = 4 + 6 + 3 = 13 horas
        assertEquals(13, proyecto.tiempoEstimado());
    }

    @Test
    public void testHistoriaConVariasTareasYSpikes() {
        HistoriaUsuario historia = new HistoriaUsuario("Carrito de compras");

        historia.agregarItem(new Tarea("Diseñar UI carrito", 5));
        historia.agregarItem(new Tarea("Implementar lógica de precios", 7));

        Spike spike = new Spike("Estudio de métodos de pago");
        spike.agregarItem(new TareaDeAnalisis("Analizar integración con MercadoPago", 4));
        spike.agregarItem(new TareaDeAnalisis("Leer documentación de Stripe", 2));

        historia.agregarItem(spike);

        // Total = 5 + 7 + 4 + 2 = 18 horas
        assertEquals(18, historia.tiempoEstimado());
    }
}

