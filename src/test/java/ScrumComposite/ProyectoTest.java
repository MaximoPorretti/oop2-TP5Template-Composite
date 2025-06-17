package ScrumComposite;

import ProyectoScrum.HistoriaUsuario;
import ProyectoScrum.ProyectoRoot;
import ProyectoScrum.Spike;
import ProyectoScrum.Tarea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProyectoTest {
    @Test
    void testTarea() {
        Tarea tarea = new Tarea("Test", 5);
        assertEquals(5, tarea.tiempoEstimado());
    }

    @Test
    void testSpike() {
        Spike spike = new Spike("Analizar", 3);
        assertEquals(3, spike.tiempoEstimado());
    }

    @Test
    void testHistoriaUsuario() {
        Tarea t1 = new Tarea("T1", 2);
        Spike s1 = new Spike("S1", 1);
        HistoriaUsuario hu = new HistoriaUsuario("HU1");
        hu.agregarItem(t1);
        hu.agregarItem(s1);
        assertEquals(3, hu.tiempoEstimado());
    }

    @Test
    void testProyectoCompleto() {
        HistoriaUsuario hu1 = new HistoriaUsuario("HU1");
        hu1.agregarItem(new Tarea("T1", 2));
        HistoriaUsuario hu2 = new HistoriaUsuario("HU2");
        hu2.agregarItem(new Spike("S1", 1));
        ProyectoRoot proyecto = new ProyectoRoot("P1");
        proyecto.agregarItem(hu1);
        proyecto.agregarItem(hu2);
        assertEquals(3, proyecto.tiempoEstimado());
    }
}
