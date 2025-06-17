package LaserX;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpresaLaserXCompositeTest {

    @Test
    @DisplayName("Caso 1: solo empleados regulares")
    void salarioTotalSoloRegulares() {
        Empleado e1 = new EmpleadoRegular("Ana", 1_000);
        Empleado e2 = new EmpleadoRegular("Juan", 1_200);

        double total = e1.calcularSalarioTotal() + e2.calcularSalarioTotal();

        assertEquals(2_200, total, 0.0001,
                "La suma de dos empleados regulares debería ser 2 200");
    }

    @Test
    @DisplayName("Caso 2: jerarquía completa (Composite)")
    void salarioTotalJerarquiaCompleta() {
        Director      dir   = new Director("Director", 5_000);
        Gerente       gte   = new Gerente ("Gerente",  3_000);
        MandoMedio    mm    = new MandoMedio("MM",     2_000);
        LiderProyecto lider = new LiderProyecto("Líder",1_500);
        Empleado      r1    = new EmpleadoRegular("Emp1", 1_000);
        Empleado      r2    = new EmpleadoRegular("Emp2", 1_100);

        // armamos la jerarquía
        lider.agregarSubordinado(r1);
        lider.agregarSubordinado(r2);
        mm.agregarSubordinado(lider);
        gte.agregarSubordinado(mm);
        dir.agregarSubordinado(gte);

        double esperado = 13_600;  // 5000 + 3000 + 2000 + 1500 + 1000 + 1100
        double obtenido = dir.calcularSalarioTotal();

        assertEquals(esperado, obtenido, 0.0001,
                "El salario total de la empresa completa debería ser 13 600");
    }

    @Test
    @DisplayName("Caso 3: Líder de Proyecto con empleados regulares")
    void salarioTotalLiderProyecto() {
        EmpleadoRegular empA = new EmpleadoRegular("Empleado A", 25000);
        EmpleadoRegular empB = new EmpleadoRegular("Empleado B", 27000);

        LiderProyecto lider = new LiderProyecto("Líder X", 40000);
        lider.agregarSubordinado(empA);
        lider.agregarSubordinado(empB);

        double esperado = 40000 + 25000 + 27000; // Salario del líder + salarios de empleados
        double obtenido = lider.calcularSalarioTotal();

        assertEquals(esperado, obtenido, 0.0001,
                "El salario total del Líder de Proyecto debería incluir el de sus subordinados.");
    }

    @Test
    @DisplayName("Caso 4: Jerarquía de Gerente con Mandos Medios y Líderes de Proyecto")
    void salarioTotalGerenteConMandosMedios() {
        EmpleadoRegular emp1 = new EmpleadoRegular("E1", 20000);
        EmpleadoRegular emp2 = new EmpleadoRegular("E2", 22000);
        EmpleadoRegular emp3 = new EmpleadoRegular("E3", 23000);

        LiderProyecto liderA = new LiderProyecto("Líder A", 35000);
        liderA.agregarSubordinado(emp1);
        liderA.agregarSubordinado(emp2);

        LiderProyecto liderB = new LiderProyecto("Líder B", 38000);
        liderB.agregarSubordinado(emp3);

        MandoMedio mm1 = new MandoMedio("MM1", 50000);
        mm1.agregarSubordinado(liderA);
        mm1.agregarSubordinado(liderB);

        Gerente gerente = new Gerente("Gerente Y", 70000);
        gerente.agregarSubordinado(mm1);

        double esperado = 70000 + 50000 + 35000 + 20000 + 22000 + 38000 + 23000;
        double obtenido = gerente.calcularSalarioTotal();

        assertEquals(esperado, obtenido, 0.0001,
                "El salario total del Gerente debería incluir toda la sub-jerarquía.");
    }
}
