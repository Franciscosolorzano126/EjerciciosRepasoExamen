package GestiónEmpleadosProyectos;

public class Desarrollador extends Empleado{
    private String lenguajePrincipal;
    private int complemento = 200;

    public Desarrollador(String dni, String nombre, double salarioBase, String lenguajePrincipal) {
        super(dni, nombre, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }


    public void calcularSalarioFinal(){
        salarioFinal = salarioBase + complemento;
    }

    

}
