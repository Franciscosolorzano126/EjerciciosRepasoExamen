package GestiónEmpleadosProyectos;

public class Manager extends Empleado {
    private String departamento;
    private double complemento = 0.25;
    private int complementoProyecto = 50;

    public Manager(String dni, String nombre, double salarioBase, String departamento, double complemento,
            int complementoProyecto) {
        super(dni, nombre, salarioBase);
        this.departamento = departamento;
        this.complemento = complemento;
        this.complementoProyecto = complementoProyecto;
    }

    public void calcularSalarioFinal() {
        salarioFinal = salarioBase + (salarioBase * complemento);
    }

    
}
