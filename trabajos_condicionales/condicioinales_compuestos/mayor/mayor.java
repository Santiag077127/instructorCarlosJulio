package mayor;

public class mayor {
    public static void main(String[] args) {
        int numero1=2;
        int numero2=20;

        if (numero1 > numero2) {
            System.out.println("El numero uno es mayor");
        } 
        else if (numero2 > numero1){
            System.out.println("El numero dos es mayor");
        }
        else if (numero1 == numero2) {
            System.out.println("Los dos numeros son iguales");
        }
    }
}
