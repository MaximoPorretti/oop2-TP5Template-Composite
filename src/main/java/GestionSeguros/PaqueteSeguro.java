package GestionSeguros;

import java.util.ArrayList;
import java.util.List;

// Compuesto: paquete de seguros (puede contener otros paquetes)
import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguro implements Seguro {
    private List<Seguro> seguros = new ArrayList<>();

    public void agregar(Seguro seguro) {
        seguros.add(seguro);
    }

    @Override
    public double getCostoBase() {
        double total = 0;
        for (Seguro s : seguros) {
            total += s.calcularCosto();  // se asume que ya trae descuentos si es subpaquete
        }
        return total;
    }

    @Override
    public double calcularCosto() {
        double base = getCostoBase();
        double descuento = 0.05 * seguros.size();  // 5% por cada elemento directo
        double factor = Math.max(0, 1.0 - descuento); // evita valores negativos
        return base * factor;
    }
}
