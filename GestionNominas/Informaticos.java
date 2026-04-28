package GestionNominas;

public class Informaticos extends Trabajador{
    private String titulacion;

    public Informaticos(String dni, String nombre, double salarioBase, String titulacion) {
        super(dni, nombre, salarioBase);
        this.titulacion = titulacion;
    }
    
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
}
