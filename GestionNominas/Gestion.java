package GestionNominas;

public class Gestion extends Trabajador{
    private int antiugedad;

    public Gestion(String dni, String nombre, double salarioBase, int antiugedad) {
        super(dni, nombre, salarioBase);
        this.antiugedad = antiugedad;
    }

    public int getAntiugedad() {
        return antiugedad;
    }

    public void setAntiugedad(int antiugedad) {
        this.antiugedad = antiugedad;
    }
    
    
}
