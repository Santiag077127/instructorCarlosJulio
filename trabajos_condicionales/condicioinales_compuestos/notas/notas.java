package notas;

public class notas {
    public static void main(String[] args) {
        int nota=18;

        if (nota<=10) {
            System.out.println("Desaprovado");
        } 
        else if (nota<=13){
            System.out.println("Regular");
        } 
        else if (nota<=17) {
            System.out.println("Bueno");
        } 
        else if(nota<=20) {
            System.out.println("Exelente");
        }
    }
}
