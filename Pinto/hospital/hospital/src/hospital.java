import java.util.Scanner;

public class hospital {

    public static hospital Hospital = new hospital();

    public  String nombre="",apellido="",nombrePaciente="";
    public  int opcion,placa,placaFunebre,placaActual,contador,indice;

    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.println("HOSPITAL MEDILASER");
            System.out.println("Elija una opcion:");
            System.out.println("1.registrar conductor");
            System.out.println("2.Registrar Vehiculo");
            System.out.println("3.Registrar paciente:");
            System.out.println("4.Asignar a un conductor un vehiculo");
            System.out.println("5.Recoger paciente");
            System.out.println("6.Salir");
            Hospital.opcion = Hospital.teclado.nextInt();
            Hospital.teclado.nextLine();

            switch (Hospital.opcion) {
                case 1:{
                    System.out.println("1.registrar conductor");

                    registrar.registrarConductor();
                    break;
                }    
                case 2:{
                    System.out.println("2.Registrar Vehiculo");
                    registrar.registrarVehiculo();
                    break;
                }
                case 3:{
                    System.out.println("3.Registrar paciente:");
                    registrar.registrarPacientes();
                    break;
                }
                case 4:{
                    System.out.println("4.Asignar a un conductor un vehiculo");
                    registrar.asignarVehiculoAConductor();
                    break;
                }
                case 5:{
                    System.out.println("5.Recoger paciente");
                    registrar.recogerPaciente();
                    break;
                }
                default:
                    break;
            }
        } while (Hospital.opcion!=6);

    }
}
