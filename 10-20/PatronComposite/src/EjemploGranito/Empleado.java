package EjemploGranito;

public class Empleado  implements ISueldo{
    private String nombreCompleto,cargo;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(String nombreCompleto, String cargo, double sueldo) {
        this.nombreCompleto = nombreCompleto;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    @Override
    public double getSueldo() {
        return 0;
    }
}
