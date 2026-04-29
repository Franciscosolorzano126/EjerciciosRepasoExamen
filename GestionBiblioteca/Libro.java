package GestionBiblioteca;

import java.time.LocalDate;

public class Libro {
    
    private String titulo;
    private Autor autor;
    private LocalDate fechaPublicacion;
    private String isbn;
    private double precio;

    public Libro(String titulo, Autor autor, LocalDate fechaPublicacion, String isbn, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.isbn = isbn;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion + ", isbn="
                + isbn + ", precio=" + precio + "]";
    }
}
