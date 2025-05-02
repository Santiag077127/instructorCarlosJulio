package horas;

public class horas {
    public static void main(String[] args) {
        int horasTrabajadas=40;
        int valorHoras=5000;
        int pagoTotal;
        int horasExtras;
        int pagoExtras;
        
        pagoTotal=horasTrabajadas * valorHoras;
        horasExtras = horasTrabajadas - 40;
        pagoExtras= horasExtras * (valorHoras * 150 /100);

        if (horasTrabajadas>40) {
            System.out.println("pago de horas extras: "+pagoExtras);
        } 
        else {
            System.out.println("sin horas extras");
        }
    }
}
