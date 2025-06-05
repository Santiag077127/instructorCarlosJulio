
import java.util.Scanner;
public class hermanos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int edadHermano1;
        int edadHermano2;
        int diferenciaEdad;

        System.out.println("Ingrese la Edad del Primer Hermano");
        edadHermano1=teclado.nextInt();
        
        System.out.println("Ingrese la Edad del Segundo Hermano");
        edadHermano2=teclado.nextInt();

        if (edadHermano1>edadHermano2) {
            System.out.println("El Primer hermano es mayor por: ");
            diferenciaEdad=edadHermano1-edadHermano2;
        } else {
            System.out.println("El Segundo hermano es mayor por: ");
            diferenciaEdad=edadHermano2-edadHermano1;
        }
        System.out.println(diferenciaEdad);
        
        teclado.close();
    }
}
