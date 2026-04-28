package GestionEventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo{
    private ArrayList<Equipo> equipos;

    public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<>();
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    @Override
    public Participante obtenerGanador(){
        if(getEquipos().isEmpty()){
            return null;
        }

        Equipo equipoGanador = getEquipos().get(0);

        for (Equipo equipo : equipos) {
            if(equipo.getPuntos() > equipoGanador.getPuntos()){
                equipoGanador = equipo;
            }
        }
        return equipoGanador.getJugadores().get(0);
    }

}