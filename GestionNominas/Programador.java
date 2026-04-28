package GestionNominas;

public class Programador extends Informaticos{
    private double complemento = 0.15;

    public Programador(String dni, String nombre, double salarioBase, String titulacion) {
        super(dni, nombre, salarioBase, titulacion);
        this.salarioFinal = salarioBase + (salarioBase * complemento);
    }

    
}
