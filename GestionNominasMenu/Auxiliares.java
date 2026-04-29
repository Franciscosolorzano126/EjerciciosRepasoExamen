package GestionNominasMenu;

public class Auxiliares extends Gestion{
    private int complemento = 100;

    public Auxiliares(String dni, String nombre, int antiguedad) {
        super(dni, nombre, antiguedad);
    }

    @Override
    public void calcularSalarioFinal(){
        salarioFinal = salarioBase + complemento;
    }

    @Override
    public String toString() {
        return "Auxiliares [getAntiguedad()=" + getAntiguedad() + ", getDni()=" + getDni() + ", getNombre()="
                + getNombre() + ", getSalarioFinal()=" + getSalarioFinal() + "]";
    }

    
}
