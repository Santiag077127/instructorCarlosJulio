
import java.util.Scanner;
public class ejemplo {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int i,k;
    
    System.out.println("Ingrese el numero de iteracion");
    i=teclado.nextInt();
        
        while (i>500 ) {
            System.out.println("El rango de de numeros es de 500");
            System.out.println("Ingrese otro numero dentro del rango");
            i=teclado.nextInt();
        }

        for(k=1; k<=i; k++){
            
            System.out.println("iteracion pares:"+(k=k+1));
            System.out.println("iteracion Impares: "+(k+1));
            
            if (i/i==1 && i/1==i) {
                System.out.println("la iteracion es primo");
            }
        }
        
    
    }
}
