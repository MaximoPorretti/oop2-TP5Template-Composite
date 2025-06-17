package GestionSeguros;

import java.util.ArrayList;
import java.util.List;

// Compuesto: paquete de seguros (puede contener otros paquetes)
public class PaqueteSeguro implements Seguro {
    private List<Seguro> seguros = new ArrayList<>();

    public void agregar(Seguro seguro) {
        seguros.add(seguro);
    }

    @Override
    public double getCostoBase() {
        // suma sin aplicar descuento
        double total = 0;
        for (Seguro s : seguros) {
            total += s.calcularCosto();  // ya puede traer descuentos internos
        }
        return total;
    }

    @Override
    public double calcularCosto() {
        double base = getCostoBase();
        double descuentoTotal = 0.05 * seguros.size(); // 5% por cada seguro contenido
        double factorDescuento = 1.0 - descuentoTotal;
        if (factorDescuento < 0) factorDescuento = 0; // nunca menor a 0
        return base * factorDescuento;
    }
}