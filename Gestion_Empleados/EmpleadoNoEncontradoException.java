package Gestion_Empleados;

public class EmpleadoNoEncontradoException extends Exception{

    public EmpleadoNoEncontradoException() {
        super("El empleado solicitado no fue encontrado en el sistema.");
    }
    
}
