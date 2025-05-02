package intercambio;

public class dos {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;

        a = a + b;//25
        b = a - b;//5
        a = a - b;//15

        System.out.println("antes a= 15 b=10 despues del intercambio:"+"a = " + a + " b = " + b);
    }
}
