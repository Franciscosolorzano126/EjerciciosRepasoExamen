package GestionNominas;

public class Analista extends Informaticos{
    private double complemento = 0.3;

     public Analista(String dni, String nombre, double salarioBase, String titulacion) {
        super(dni, nombre, salarioBase, titulacion);
        this.salarioFinal = salarioBase + (salarioBase * complemento);
    }

    
}
