import java.util.Scanner;
public class tarifa {

    public static todos Todos = new todos() ;
    
    public static void Planilla (){
    
        todos.calcularInt=todos.numero1*todos.numero2;
        
        System.out.println("Su pago es: "+todos.calcularInt);

    }        
    
}