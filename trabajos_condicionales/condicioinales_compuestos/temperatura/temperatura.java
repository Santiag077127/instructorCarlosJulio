package temperatura;

public class temperatura {
    public static void main(String[] args) {
        int temperatura=29;

        if (temperatura<15) {
            System.out.println("Hace frio");
        } else if (temperatura<=30){
            System.out.println("La temperatura esta normal");
        }else{
            System.out.println("Hace calor");
        }
    }
}
