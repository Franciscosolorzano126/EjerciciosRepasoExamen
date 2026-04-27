package Gestion_Empleados;

public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, String apellidos, String dni, double salario, int horasTrabajadas,
            double tarifaPorHora) {
        super(nombre, apellidos, dni, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    double calcularSalario(){
        return horasTrabajadas * tarifaPorHora;
    }
}
