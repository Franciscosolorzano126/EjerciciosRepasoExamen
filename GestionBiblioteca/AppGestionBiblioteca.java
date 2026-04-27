package GestionBiblioteca;

import java.time.LocalDate;

public class AppGestionBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor("Pepe", "Primos", LocalDate.of(2017, 01, 23), null);
        Libro libro1 = new Libro("Peces volando", autor1, LocalDate.of(2023, 05, 13), "00112233", 12.99);

        biblioteca.agregarLibro(libro1);
        biblioteca.getLibros().toString();

        try {
            biblioteca.eliminarLibro(libro1);
        } catch (LibroNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
