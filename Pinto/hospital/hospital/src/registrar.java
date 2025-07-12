import java.util.Scanner;
import java.util.ArrayList;
public class registrar {

    public static hospital hospital = new hospital();

    public static Scanner teclado = new Scanner(System.in);
    
    //Listado
    static ArrayList<String> conductor =new ArrayList<>();
    static ArrayList<Integer> vehiculo =new ArrayList<>();
    static ArrayList<String> pacientesVivos =new ArrayList<>();
    static ArrayList<String> pacientesMuertos =new ArrayList<>();
    static ArrayList<String> asignarConductor =new ArrayList<>();
    static ArrayList<Integer> asignarPlaca =new ArrayList<>();
    static ArrayList<String> conductorRecoge = new ArrayList<>();
    static ArrayList<String> pacienteRecogido = new ArrayList<>();


    public static void registrarConductor(){
        //Conductores
        for (int i=0; i<10; i++) {
            System.out.println("Ingrese el nombre del conductor:"+ (i+1) + " :");
            hospital.nombre = teclado.nextLine();
            conductor.add(hospital.nombre);
        }   
    }
    public static void registrarVehiculo(){
        //Ambulancia
        for (int i=0; i<9; i++) {
            System.out.println("Ingrese el numero de la placa de la Ambulancia:"+ (i+1) + " :");
            hospital.placa = teclado.nextInt();

            vehiculo.add(hospital.placa);
        }   
        //Carro funebre
        for (int i = 0; i <1; i++) {
            System.out.print("Ingrese el numero de la placa del carro Funebre" + (i + 1) + ": ");
            hospital.placaFunebre=teclado.nextInt();

            vehiculo.add(hospital.placaFunebre);
        }
    }
    public static void registrarPacientes() {
        //Vivos
        System.out.println("Registrando pacientes VIVOS:");
        for (int i = 0; i < 100; i++) {
            System.out.print("Ingrese el nombre del paciente vivo " + (i + 1) + ": ");
            String nombrePaciente = teclado.nextLine();
            pacientesVivos.add(nombrePaciente);
        }
        //Muertos
        System.out.println("\nRegistrando pacientes MUERTOS:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el nombre del paciente muerto " + (i + 1) + ": ");
            String nombrePaciente = teclado.nextLine();
            pacientesMuertos.add(nombrePaciente);
        }
    }
    public static void asignarVehiculoAConductor() {
        System.out.println("\n=== ASIGNACIÓN DE CONDUCTORES A VEHÍCULOS ===");

        //Mostrar vehiculo
        for (int i = 0; i < vehiculo.size(); i++) {
        hospital.placaActual = vehiculo.get(i);
        System.out.println("\nVehículo con placa: " + hospital.placaActual);

            // Mostrar conductores 
            System.out.println("Conductores disponibles:");
            for (int j = 0; j < conductor.size(); j++) {
            System.out.println(j + ". " + conductor.get(j));
            }

            //Eleccion de conductor al carro
            System.out.print("Seleccione el número del conductor para este vehículo: ");
            hospital.indice = teclado.nextInt();
            teclado.nextLine(); 

            if (hospital.indice >= 0 && hospital.indice < conductor.size()) {
                asignarConductor.add(conductor.get(hospital.indice));
                asignarPlaca.add(hospital.placaActual);
                System.out.println("Asignado: " + conductor.get(hospital.indice) + " a la placa " + hospital.placaActual);
            } else {
                System.out.println("Índice inválido. Se omite este vehículo.");
            }
        }
        //Reporte 
        System.out.println("\n=== RESUMEN DE ASIGNACIONES ===");
        for (int i = 0; i < asignarConductor.size(); i++) {
            System.out.println("Conductor: " + asignarConductor.get(i) + " -> Vehículo: " + asignarPlaca.get(i));
        }
    }
    public static void recogerPaciente() {

        System.out.println("\n=== RECOGER PACIENTE ===");
        // Mostrar conductores
        if (asignarConductor.isEmpty()) {
            System.out.println("No hay conductores asignados a vehículos.");
            return;
        }

        // Mostrar conductores con vehículos
        for (int i = 0; i < asignarConductor.size(); i++) {
            System.out.println(i + ". " + asignarConductor.get(i) + " -> Placa: " + asignarPlaca.get(i));
        }

        // Elegir conductor
        System.out.print("Seleccione el número de la placa que recogerá al paciente: ");
        int indiceConductor = teclado.nextInt();
        teclado.nextLine();

        if (indiceConductor < 0 || indiceConductor >= asignarConductor.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        // Mostrar pacientes  
        System.out.println("\nPacientes disponibles para ser recogidos:");
        for (int i = 0; i < pacientesVivos.size(); i++) {
            System.out.println(i + ". " + pacientesVivos.get(i));
        }

        // Elegir paciente
        System.out.print("Seleccione el número del paciente que será recogido: ");
        int indicePaciente = teclado.nextInt();
        teclado.nextLine();

        if (indicePaciente < 0 || indicePaciente >= pacientesVivos.size()) {
            System.out.println("Índice de paciente inválido.");
            return;
        }

        // Registrar la recogida
        String conductor = asignarConductor.get(indiceConductor);
        String paciente = pacientesVivos.get(indicePaciente);

        conductorRecoge.add(conductor);
        pacienteRecogido.add(paciente);

        // Eliminar el paciente de la lista original
        pacientesVivos.remove(indicePaciente);

        System.out.println("El conductor " + conductor + " ha recogido al paciente " + paciente);

        //Reporte
        System.out.println("\n===REPORTE===");
        for (int i = 0; i < conductorRecoge.size(); i++) {
            System.out.println("El Conductor: " + conductorRecoge.get(i));
            System.out.println("Ha recogido al paciente: " + pacienteRecogido.get(i));
        }
    }
    
}