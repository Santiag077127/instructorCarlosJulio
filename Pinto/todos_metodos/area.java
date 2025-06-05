
import java.util.Scanner;
import java.lang.Math;

public class area {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double longitudA;
        double longitudB;
        double longitudC;   
        double longitudSemiperimetro;
        double area;
        
        System.out.println("ingrese la longitudA: ");
        longitudA= teclado.nextDouble();

        System.out.println("ingrese la longitudB: ");
        longitudB= teclado.nextDouble();

        System.out.println("ingrese la longitudC: ");
        longitudC= teclado.nextDouble();

        longitudSemiperimetro=(longitudA+longitudB+longitudC)/3;

        area= Math.sqrt(longitudSemiperimetro*(longitudSemiperimetro-longitudA)*(longitudSemiperimetro-longitudB)*(longitudSemiperimetro-longitudC));

        System.out.println("El area es: "+area);

        teclado.close();
    }
}
