package ProyectoScrum;
import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;
public class testProyectoScrum {
    @Test
    void testTarea() {
        Tarea tarea = new Tarea("Test", 5);
        assertEquals(5, tarea.tiempoEstimado());
    }


    @Test
    void testHistoriaUsuario() {
        Tarea t1 = new Tarea("T1", 2);

        HistoriaUsuario hu = new HistoriaUsuario("HU1");
        hu.agregarItem (t1);

        assertEquals(2, hu.tiempoEstimado());
    }

    @Test
    void testProyectoCompleto() {
        HistoriaUsuario hu1 = new HistoriaUsuario("HU1");
        hu1.agregarItem (new Tarea("T1", 2));
        HistoriaUsuario hu2 = new HistoriaUsuario("HU2");

        Proyecto proyecto = new Proyecto("P1");
        proyecto.agregarItem (hu1);
        proyecto.agregarItem (hu2);
        assertEquals(2, proyecto.tiempoEstimado());
    }
}
