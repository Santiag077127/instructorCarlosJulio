import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {
        int opcion;
        do {
                System.out.println("1. registrar libro");
                System.out.println("2. buscar libro por titulo");
                System.out.println("3. registrar lector");
                System.out.println("4. registrar prestamo");
                System.out.println("5. listar prestamos");
                System.out.println("6. devolver libro");
                System.out.println("7. ver todos los libros registrados"); 
                System.out.println("8. buscar lector por id");
                System.out.println("9. ver todos los lectores registrados");
                System.out.println("10. filtro de libros por titulo"); 
                System.out.println("0. salir");

            System.out.print("seleccione una opcion: ");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
             
                case 1: registrarLibro(); break;
                case 2: buscarLibroPorTitulo(); break;
                case 3: registrarLector(); break;
                case 4: registrarPrestamo(); break;
                case 5: listarPrestamos(); break;
                case 6: devolverLibro(); break;
                case 7: verTodosLosLibros(); break;
                case 8: buscarLectorPorId(); break;
                case 9: verTodosLosLectores(); break;
                case 10: filtroLibrosPorTitulo(); break;
                case 0: System.out.println("chao"); break;
    default: System.out.println("no valido");


            }
        } while (opcion != 0);
    }

    static void registrarLibro() {
        System.out.print("isbn: ");
        String isbn = scan.nextLine();
        System.out.print("titulo: ");
        String titulo = scan.nextLine();
        System.out.print("autor: ");
        String autor = scan.nextLine();
        System.out.print("genero: ");
        String genero = scan.nextLine();
        System.out.print("fecha de publicacion (yyyy-mm-dd): ");
        String fecha = scan.nextLine();
        System.out.println(biblioteca.registrarLibro(isbn, titulo, autor, genero, fecha));
    }

    static void buscarLibroPorTitulo() {
        System.out.print("titulo a buscar: ");
        String titulo = scan.nextLine();
        Libro libro = biblioteca.buscarPorTitulo(titulo);
        if (libro != null) {
            System.out.println(libro);
        } else {
            System.out.println("libro no encontrado.");
        }
    }

    static void registrarLector() {
        System.out.print("id lector: ");
        String id = scan.nextLine();
        System.out.print("nombre lector: ");
        String nombre = scan.nextLine();
        System.out.print("correo lector: ");
        String correo = scan.nextLine();
        System.out.println(biblioteca.registrarLector(id, nombre, correo));
    }

    static void registrarPrestamo() {
        System.out.print("id del lector: ");
        String idLector = scan.nextLine();
        System.out.print("titulo del libro: ");
        String tituloLibro = scan.nextLine();
        System.out.println(biblioteca.registrarPrestamo(idLector, tituloLibro));
    }

    static void listarPrestamos() {
        biblioteca.listarPrestamos();
    }

    static void devolverLibro() {
        System.out.print("titulo del libro a devolver: ");
        String titulo = scan.nextLine();
        System.out.println(biblioteca.devolverLibro(titulo));
    }

    static void filtroLibrosPorTitulo() {
        System.out.print("ingrese parte del titulo para buscar: ");
        String filtro = scan.nextLine();
        biblioteca.mostrarLibrosPorTitulo(filtro);
    }

    static void buscarLectorPorId() {
        System.out.print("ingrese el id del lector: ");
        String id = scan.nextLine();
        biblioteca.mostrarLectorPorId(id);
    }
    static void verTodosLosLibros() {
    biblioteca.listarTodosLosLibros();
}

static void verTodosLosLectores() {
    biblioteca.listarTodosLosLectores();
}
}

