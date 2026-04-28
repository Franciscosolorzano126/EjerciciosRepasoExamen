package GestiónEmpleadosProyectos;

import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private double presupuesto;
    private ArrayList<Empleado> empleadosAsignados;

    public Proyecto(String nombre, double presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.empleadosAsignados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    public void setEmpleadosAsignados(ArrayList<Empleado> empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
    }

    @Override
    public String toString() {
        return "Proyecto [nombre=" + nombre + ", presupuesto=" + presupuesto + ", empleadosAsignados="
                + empleadosAsignados + "]";
    }

}
