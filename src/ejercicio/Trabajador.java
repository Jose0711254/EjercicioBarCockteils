package ejercicio;

public class Trabajador {
    private String nombre;
    private String fechaNacimiento;
    private double salarioBase;

    public Trabajador(String nombre, String fechaNacimiento, double salarioBase) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
