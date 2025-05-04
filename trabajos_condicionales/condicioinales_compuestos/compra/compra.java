package compra;

public class compra {
    public static void main(String[] args) {
        int compra=117;
        double descuento;

        if (compra>100) {

            descuento = compra * 0.10 %100; 

            System.out.println("descuento: "+descuento);

        }else if (compra<=100) {

            System.out.println(compra);
        }
    }
}
