package GestionNominasMenu;

public class Programador extends Informaticos{
    private double complemento = 0.15;
    
    public Programador(String dni, String nombre, String titulacion) {
        super(dni, nombre, titulacion);
    }

    @Override
    public void calcularSalarioFinal(){
        salarioFinal = salarioBase + (salarioBase * complemento);
        System.out.println("Su salario final es de: " + salarioFinal);
    }

    @Override
    public String toString() {
        return "Programador [getDni()=" + getDni() + ", getNombre()=" + getNombre() + ", getSalarioBase()="
                + getSalarioBase() + ", getSalarioFinal()=" + getSalarioFinal() + "]";
    }

    
}
