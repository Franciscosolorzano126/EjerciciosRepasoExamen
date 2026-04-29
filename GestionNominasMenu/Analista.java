package GestionNominasMenu;

public class Analista extends Informaticos{
    private double complemento = 0.3;

    public Analista(String dni, String nombre, String titulacion) {
        super(dni, nombre, titulacion);
    }
    
    @Override
    public void calcularSalarioFinal(){
        salarioFinal = salarioBase + (salarioBase * complemento);
        System.out.println("Su salario final es de: " + salarioFinal);
    }
}
