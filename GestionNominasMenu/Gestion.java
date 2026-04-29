package GestionNominasMenu;

public class Gestion extends Trabajadores{
    private int antiguedad;

    public Gestion(String dni, String nombre, int antiguedad) {
        super(dni, nombre);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void verificarAntiguedad(int antiguedad) throws AntiguedadNoValidaException{
        if(antiguedad < 0){
            throw new AntiguedadNoValidaException("La antiguedad tiene que ser positiva.");
        }
    }
    
    @Override
    public void calcularSalarioFinal(){}
}
