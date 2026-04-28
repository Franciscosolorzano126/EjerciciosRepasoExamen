package GestionNominas;

public class Administrativo extends Gestion{
    private int complemento = 20;

    public Administrativo(String dni, String nombre, double salarioBase, int antiguedad) {
        super(dni, nombre, salarioBase, antiguedad);
        this.salarioFinal = salarioBase + (complemento * antiguedad);
    }

    
}
