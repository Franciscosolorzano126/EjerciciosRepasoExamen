package GestionEventosDeportivos;

public class Participante {
    private String nombre;
    private String apellido;
    private int edad;
    private int tiempo;
    
    public Participante(String nombre, String apellido, int edad, int tiempo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Participante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
    }

    
}
