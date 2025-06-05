
import java.util.Scanner;
public class entero {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;
        int contador;
        int producto;

        System.out.println("Ingrese el primer numero:");
        numero1=teclado.nextInt();

        System.out.println("Ingrese el segundo numero");
        numero2=teclado.nextInt();

        producto=0;

        for(contador=0; contador<numero2;  contador++ ){
            producto=producto+numero1;
        }
        System.out.println("El producto es :"+producto);
    }
}
