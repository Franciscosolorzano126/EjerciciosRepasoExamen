package GestionNominasMenu;

public class Administrativos extends Gestion{
    private int complemento = 20;

    public Administrativos(String dni, String nombre, int antiguedad) {
        super(dni, nombre, antiguedad);
    }

    @Override
    public void calcularSalarioFinal(){
        salarioFinal = salarioBase + (complemento * getAntiguedad());
        System.out.println("Su salario final es de: " + salarioFinal);
    }

    @Override
    public String toString() {
        return "Administrativos [getAntiguedad()=" + getAntiguedad() + ", getDni()=" + getDni() + ", getNombre()="
                + getNombre() + ", getSalarioBase()=" + getSalarioBase() + ", getSalarioFinal()=" + getSalarioFinal()
                + "]";
    }

    
}
