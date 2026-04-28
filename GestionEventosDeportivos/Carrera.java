package GestionEventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo{
    private double distancia; // kilometros

    public Carrera(String nombre, LocalDate fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public Participante obtenerGanador(){
        if(getParticipantes().isEmpty()){
            return null;
        }

        Participante ganador = getParticipantes().get(0);

        for (Participante p : getParticipantes()) {
            if(p.getTiempo() < ganador.getTiempo()){
                ganador = p;
            }
        }
        return ganador;
    }
}
