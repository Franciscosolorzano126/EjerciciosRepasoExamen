package Gestion_Empleados;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa(){
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e){
        empleados.add(e);
        System.out.println("Empleado agregado correctamente.");
    }

    public void eliminarEmpleado(String dni) throws EmpleadoNoEncontradoException{
        for (Empleado empleado : empleados) {
            if(empleado.getDni().equals(dni)){
                empleados.remove(empleado);
                return; // no se puede continuar porque no buscas mas de un empleado por eso hacemos el return
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
