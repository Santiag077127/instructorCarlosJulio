import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();
    private List<Lector> lectores = new ArrayList<>();
    private List<Prestamo> prestamos = new ArrayList<>();

    public String registrarLibro(String isbn, String titulo, String autor, String genero, String fechaPublicacion) {
        for (Libro l : libros) {
            if (l.isbn.equals(isbn)) return "error: isbn ya registrado.";
        }
        try {
            LocalDate fecha = LocalDate.parse(fechaPublicacion);
            libros.add(new Libro(isbn, titulo, autor, genero, fecha));
            return "libro registrado exitosamente.";
        } catch (DateTimeParseException e) {
            return "fecha invalida.";
        }
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro l : libros) {
            if (l.titulo.equalsIgnoreCase(titulo)) return l;
        }
        return null;
    }

    public String registrarLector(String id, String nombre, String correo) {
        for (Lector l : lectores) {
            if (l.id.equals(id)) return "error: id de lector ya existe.";
        }
        lectores.add(new Lector(id, nombre, correo));
        return "lector registrado correctamente.";
    }

    public Lector buscarLectorPorId(String id) {
        for (Lector l : lectores) {
            if (l.id.equalsIgnoreCase(id)) return l;
        }
        return null;
    }

    public String registrarPrestamo(String idLector, String tituloLibro) {
        Lector lector = buscarLectorPorId(idLector);
        if (lector == null) return "error: lector no encontrado.";

        Libro libro = buscarPorTitulo(tituloLibro);
        if (libro == null) return "error: libro no encontrado.";

        if (libro.prestado) return "error: el libro ya esta prestado.";

        libro.prestado = true;
        prestamos.add(new Prestamo(libro, lector));
        return "prestamo registrado exitosamente.";
    }

    public void listarPrestamos() {
        if (prestamos.isEmpty()) {
            System.out.println("no hay prestamos registrados.");
        } else {
            for (Prestamo p : prestamos) {
                System.out.println(p);
            }
        }
    }

    public String devolverLibro(String tituloLibro) {
        for (Prestamo p : prestamos) {
            if (p.libro.titulo.equalsIgnoreCase(tituloLibro)) {
                if (p.libro.prestado) {
                    p.libro.prestado = false;
                    prestamos.remove(p);
                    return "libro devuelto exitosamente.";
                }
            }
        }
        return "error: el libro no esta en prestamo o no existe.";
    }

    public void mostrarLibrosPorTitulo(String filtro) {
        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.titulo.toLowerCase().contains(filtro.toLowerCase())) {
                System.out.println(l);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("no se encontraron libros con ese titulo.");
        }
    }

    public void mostrarLectorPorId(String id) {
        Lector l = buscarLectorPorId(id);
        if (l != null) {
            System.out.println(l);
        } else {
            System.out.println("no se encontro un lector con ese id.");
        }
    }
    public void listarTodosLosLibros() {
    if (libros.isEmpty()) {
        System.out.println("no hay libros registrados.");
    } else {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }
}

public void listarTodosLosLectores() {
    if (lectores.isEmpty()) {
        System.out.println("no hay lectores registrados.");
    } else {
        for (Lector l : lectores) {
            System.out.println(l);
        }
    }
}

}
