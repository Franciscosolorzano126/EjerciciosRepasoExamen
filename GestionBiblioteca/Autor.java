package GestionBiblioteca;

import java.time.LocalDate;

public class Autor extends Persona{
    private enum GeneroLiterario{Poético, Narrativo, Drámático, Didáctico, Lírico}
    private GeneroLiterario generoLiterario;
    
    public Autor(String nombre, String apellido, LocalDate fecha, GeneroLiterario generoLiterario) {
        super(nombre, apellido, fecha);
        this.generoLiterario = generoLiterario;
    }

    public GeneroLiterario getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(GeneroLiterario generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    @Override
    public String toString() {
        return "Autor [generoLiterario=" + generoLiterario + "]";
    }
}
