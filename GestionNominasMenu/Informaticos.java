package GestionNominasMenu;

public class Informaticos extends Trabajadores{
    private String titulacion;

    public Informaticos(String dni, String nombre, String titulacion) {
        super(dni, nombre);
        this.titulacion = titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public void calcularSalarioFinal(){}
}
