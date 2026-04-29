package GestionNominasMenu;

import java.util.ArrayList;

public class Empresa {
    private String cif;
    private String nombre;
    private ArrayList<Trabajadores> trabajadores;

    public Empresa(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
        this.trabajadores = new ArrayList<>();
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Trabajadores> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajadores> trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    public void agregarTrabajador(Trabajadores trabajador){
        trabajadores.add(trabajador);
    }

    public void eliminarTrabajador(String dni) throws TrabajadorNoExistenteException{
        for (Trabajadores trabajadores2 : trabajadores) {
            if(trabajadores == null){
                throw new TrabajadorNoExistenteException("Error. Trabajador no existe.");
            }

            if (trabajadores2.getDni().equals(dni)) {
                trabajadores.remove(trabajadores2);
                System.out.println("Trabajador eliminado.");
            } else throw new TrabajadorNoExistenteException("Error. El trabajador que busca no existe.");
        }
    }

    public void listarTrabajadores(){
        System.out.println("---------- LISTA DE TRABAJADORES ----------");
        for (Trabajadores trabajadores2 : this.trabajadores) {
            System.out.println(trabajadores2.toString());
        }
    }

    @Override
    public String toString() {
        return "Empresa [Cif =" + getCif() + ", nombre =" + getNombre() + "]";
    }
    
    
}
