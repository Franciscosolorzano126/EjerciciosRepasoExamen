package GestionNominas;

public class Auxiliar extends Gestion{
    private int complemento = 100;

     public Auxiliar(String dni, String nombre, double salarioBase, int antiguedad) {
        super(dni, nombre, salarioBase, antiguedad);
        this.salarioFinal = salarioBase + complemento;
    }

    
}
