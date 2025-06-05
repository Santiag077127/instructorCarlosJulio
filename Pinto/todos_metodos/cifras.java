
import java.util.Scanner;
public class cifras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int cociente;
        int residuo;
        int decenas;
        int unidades;

        System.out.println("Ingrese un entero de dos digitos");
        numero=teclado.nextInt();

        cociente=(numero/10);
        residuo=numero-(cociente*10);
        decenas=cociente;
        unidades=residuo;

        System.out.println("Las decenas son: "+decenas);
        System.out.println("El residuo es: "+unidades);

        teclado.close();
    }

}
