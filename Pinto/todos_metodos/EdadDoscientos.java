import java.util.Scanner;

public class EdadDoscientos {

    public static todos Todos = new todos() ;
    public static void docientos() {

        Scanner scanner = new Scanner(System.in);


        for (todos.contador = 1; todos.contador <= 200; todos.contador++) {
            System.out.print("Ingresa la edad de la persona " + todos.contador + ": ");
            todos.numero1=scanner.nextInt();

            if (todos.numero1 < 18) {
                todos.calcularInt++;
            } else {
                todos.calcularInt2++;
            }
        }

        System.out.println("\nNúmero de menores de edad: " + todos.calcularInt);
        System.out.println("Número de mayores de edad: " + todos.calcularInt2);

        scanner.close();
    }
}