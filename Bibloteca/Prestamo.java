public class Prestamo {
    public Libro libro;
    public Lector lector;

    public Prestamo(Libro libro, Lector lector) {
        this.libro = libro;
        this.lector = lector;
    }

    @Override
    public String toString() {
        return "Prestamo Libro=" + libro.titulo + ", Lector=" + lector.nombre ;
    }
}
