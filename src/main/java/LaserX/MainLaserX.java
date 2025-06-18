package LaserX;

public class MainLaserX {
    public static void main(String[] args) {
        // Crear empleados regulares
        EmpleadoRegular empleado1 = new EmpleadoRegular("Juan", 1);
        EmpleadoRegular empleado2 = new EmpleadoRegular("Maria", 1);
        EmpleadoRegular empleado3 = new EmpleadoRegular("Pedro", 1);

        // Crear líderes de proyecto y asignar empleados regulares
        LiderProyecto lider1 = new LiderProyecto("Laura", 1);
        lider1.agregarSubordinado(empleado1);
        lider1.agregarSubordinado(empleado2);

        LiderProyecto lider2 = new LiderProyecto("Carlos", 1);
        lider2.agregarSubordinado(empleado3);

        // Crear mandos medios y asignar líderes de proyecto
        MandoMedio mandoMedio1 = new MandoMedio("Ana", 1);
        mandoMedio1.agregarSubordinado(lider1);
        mandoMedio1.agregarSubordinado(lider2);

        // Crear gerentes y asignar mandos medios
        Gerente gerente1 = new Gerente("Roberto", 1);
        gerente1.agregarSubordinado(mandoMedio1);

        // Crear un director y asignar gerentes
        Director director1 = new Director("Sofia", 1);
        director1.agregarSubordinado(gerente1);

        // Calcular y mostrar el salario total de la empresa
        System.out.println("Salario total de la empresa: $" + director1.calcularSalarioTotal());

        // Ejemplo de un sub-equipo
        System.out.println("Salario total del equipo de Laura: $" + lider1.calcularSalarioTotal());
    }
}