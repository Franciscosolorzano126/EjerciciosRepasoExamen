package GestionNominas;

import java.util.ArrayList;

public class Empresa {
    private int cif;
    private String nombre;
    private ArrayList<Trabajador> trabajadores;

    public Empresa(int cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
        this.trabajadores = new ArrayList<>();
    }

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public void aniadirTrabajador(Trabajador trabajador){
        trabajadores.add(trabajador);
    }

}
