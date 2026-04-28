package GestiónEmpleadosProyectos;

import java.util.ArrayList;

import Gestion_Empleados.EmpleadoNoEncontradoException;

public class Empresa {
    private String cif;
    private String nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList<Proyecto> proyectos;

    public Empresa(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.proyectos = new ArrayList<>();
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void aniadirEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void eliminarEmpleado(String dni){
        Empleado empleadoAEliminar = buscarEmpleado(dni);

        empleados.remove(empleadoAEliminar);
        System.out.println("El empleado " + empleadoAEliminar.getNombre() + " ha sido eliminado correctamente.");
    }

    public Empleado buscarEmpleado(String dni) {
        for (Empleado empleado : empleados) {
            if (empleado.getDni().equals(dni)) {
                return empleado;
            }
        }
        return null;
    }

    public void aniadirProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public Proyecto buscarProyecto(String nombre) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getNombre().equals(nombre)) {
                return proyecto;
            }
        }
        return null;
    }

    public void listarEmpleados() {
        System.out.println("====LISTA DE EMPLEADOS====");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
        System.out.println("\n=======================");
    }

    public void listarProyectos() {
        System.out.println("====LISTA DE PROYECTOS====");
        for (Proyecto proyecto : proyectos) {
            System.out.println(proyecto);
        }
        System.out.println("\n=======================");
    }
}
