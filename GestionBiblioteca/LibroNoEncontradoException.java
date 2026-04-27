package GestionBiblioteca;

public class LibroNoEncontradoException extends Exception{

    public LibroNoEncontradoException() {
        super("Error. El libro que quiere eliminar no existe.");
    }
    
}
