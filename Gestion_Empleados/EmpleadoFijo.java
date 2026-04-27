package Gestion_Empleados;

public class EmpleadoFijo extends Empleado{
    private double salarioMensual;

    public EmpleadoFijo(String nombre, String apellidos, String dni, double salario, double salarioMensual) {
        super(nombre, apellidos, dni, salario);
        this.salarioMensual = salarioMensual;
    }

    double calcularSalario(){
        return salarioMensual;
    }
}
