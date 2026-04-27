package Gestion_Empleados;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public void agregarEmpleado(Empleado e){
        empleados.add(e);
        System.out.println("Empleado agregado correctamente.");
    }

    public void eliminarEmpleado(String dni) throws EmpleadoNoEncontradoException{
        for (Empleado empleado : empleados) {
            if(empleado.getDni().equals(dni)){
                empleados.remove(empleado);
            }
        }
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    
}
