package hora;

public class hora {
    public static void main(String[] args) {
        int hora=3;

        if (hora<=5) {
            System.out.println("Es de madrugada");
        } else if (hora<=12) {
            System.out.println("Es la mañana");
        }else if (hora<=18){
            System.out.println("Es la tarde");
        }else if (hora<=23) {
            System.out.println("Es la noche");
        }
    }
}
