package GestionBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void eliminarLibro(Libro isbn) throws LibroNoEncontradoException{
        for (Libro libro : libros) {
            if(libro.getIsbn().equals(isbn)){
                libros.remove(libro);
            }
        }
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    
}
