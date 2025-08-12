import java.util.Scanner;

public class inicio{
public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("----- SENA -----");
            System.out.println("1. Registrar Ubicacion, Regional,Centro y Sede.");
            System.out.println("2. Registrar Ambientes.");
            System.out.println("3. Registrar Aprendiz");
            System.out.println("4. Registrar instructor");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    procesos.Ubicacion();
                    break;
                case 2:
                   procesos.ambientes();
                    break;
                case 3:
                    procesos.registrarAprendiz();
                    break;
                case 4:
                    procesos.instructor();
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        teclado.close();
    }
}