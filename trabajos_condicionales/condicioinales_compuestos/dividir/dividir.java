package dividir;

public class dividir {
    public static void main(String[] args) {
        int numero=33;
        int numero2=10;
        int dividir;
        
        if (numero2>0){
            dividir = numero %  numero2;
            System.out.println(dividir);
        }else if (numero2==0) {
            System.out.println("No se puede dividir");
        }
    }
}
