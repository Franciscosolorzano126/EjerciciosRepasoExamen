package Gestion_Empleados;

public class AppGestionEmpleados {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        EmpleadoPorHoras emple1 = new EmpleadoPorHoras("Pepe", "Garcia Lorca", "001", 1000, 40, 1.5);
        EmpleadoFijo emple2 = new EmpleadoFijo("Luis", "Diaz Lopez", "002", 1500, 1500);

        empresa.agregarEmpleado(emple1);
        empresa.agregarEmpleado(emple2);

        for (Empleado empleado : empresa.getEmpleados()) {
            System.out.println(empleado.toString());
        }

        try {
            empresa.eliminarEmpleado("001");
            empresa.eliminarEmpleado("003");
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        emple1.calcularSalario();
        emple2.calcularSalario();
    }
}
