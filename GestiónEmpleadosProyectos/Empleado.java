package GestiónEmpleadosProyectos;

public abstract class Empleado {
    private String dni;
    private String nombre;
    protected double salarioBase;
    protected double salarioFinal;

    public Empleado(String dni, String nombre, double salarioBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    abstract void calcularSalarioFinal();

    @Override
    public String toString() {
        return "Empleado [dni=" + dni + ", nombre=" + nombre + ", salarioFinal=" + salarioFinal + "]";
    }
}
