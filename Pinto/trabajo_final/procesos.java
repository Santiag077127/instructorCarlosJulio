import java.util.Scanner;

public class procesos {
    
    public static Scanner teclado = new Scanner(System.in);

    public static void Ubicacion(){
        String regional,centro,sede;

        System.out.println("Ingrese la Regional:");
        regional=teclado.nextLine();

        System.out.println("Ingrese el centro:");
        centro=teclado.nextLine();

        System.out.println("Ingrese la sede:");
        sede=teclado.nextLine();

        System.out.println("ubicacion: "+""+ regional+","+ centro+","+ sede);
    }
    //ARREGLOS GLOBALES
    public static String[] linea={
        "Tecnologias de la Informacion y las Comunicaciones (TIC)",
        "Produccion y Transformacion",
        "Construcción y Mineria",
        "Servicios",
        "Salud"
    };
    public static String[][] ambienteLinea = new String[5][];
    public static String[][] Especializado = new String[5][];
    public static String [][] inventario = new String[5][];
    public static String[][] cantidadAprendiz = new String[5][];
    public static String[][] nombreAprendiz = new String[5][];
    public static String[][] programaFormacion = new String[5][];
    public static String[][] horario = new String[5][];
    public static String[][] ambienteAsignado = new String[5][];
    public static String[][] instructorLinea = new String[5][];
    public static String[][] instructorHorario = new String[5][];
    public static String[][] instructorAmbiente = new String[5][];


    public static void ambientes(){
        int cantidad;

        //REGISTRAR CANTIDAD DE AMBIENTES
        for (int i = 0; i < 5; i++) {
            System.out.println("Línea: "+ linea[i]);
            System.out.print("¿Cuántos ambientes desea registrar?: ");
            cantidad = teclado.nextInt();
            teclado.nextLine();

            //ESPACIO PARA LAS MATRICES
            ambienteLinea[i] = new String[cantidad];
            Especializado[i] = new String[cantidad];
            inventario[i]= new String[cantidad];

            //DATOS DE AMBIENTES 
            for (int j = 0; j < cantidad; j++) {

                //NOMBRE DE LOS AMBIENTES:
                System.out.print("Ingrese el nombre del ambiente: ");
                ambienteLinea[i][j] = teclado.nextLine();

                //EL AMBIENTE ES ESPECIALIZADO:
                System.out.print("¿El ambiente es especializado?: ");
                Especializado[i][j] = teclado.nextLine();

                //INVENTARIO:
                System.out.println("Ingrese el inventario del ambiente: ");
                inventario[i][j]=teclado.nextLine();    
            }
        }
        //REPORTES
        System.out.println("-------- Ambientes por línea: ----------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Línea: " + linea[i]);
            for (int j = 0; j < ambienteLinea[i].length; j++) {
                System.out.println("Ambiente: " + ambienteLinea[i][j] + " Es especializado: " + Especializado[i][j] );
                System.out.println("Inventario: "+inventario[i][j]);
            }
        }

    }
    public static void registrarAprendiz(){

    //VARIABLES
    int cantidad;

    //CANTIDAD APRENDIZ
    for(int i=0; i<5; i++){
        System.out.println("Linea: "+linea[i]);
        System.out.print("Cuantos aprendices desea ingresar: ");
        cantidad=teclado.nextInt();
        teclado.nextLine();

        //ESPACIO PARA LAS MATRICES
        nombreAprendiz[i] = new String[cantidad];
        programaFormacion[i] = new String[cantidad];
        horario[i] = new String[cantidad];
        ambienteAsignado[i] = new String[cantidad];

        //DATOS DEL APRENDIZ
        for(int j=0; j<cantidad; j++){

            //NOMBRE
            System.out.print("Ingrese el nombre del aprendiz: ");
            nombreAprendiz[i][j] = teclado.nextLine();

            //PROGRAMA DE FORMACION
            System.out.print("Ingrese el programa de formacion: ");
            programaFormacion[i][j]= teclado.nextLine();

            //HORARIO
            System.out.print("Ingrese el horario: ");
            horario[i][j] = teclado.nextLine();

            //AMBIENTE
            System.out.println("Seleccione un ambiente:");
            for(int k=0; k<ambienteLinea[i].length; k++){
                System.out.println((k+1) + ". " + ambienteLinea[i][k]);
            }
            int opcion = teclado.nextInt();
            teclado.nextLine();
            ambienteAsignado[i][j] = ambienteLinea[i][opcion-1];
        }
    }

    //REPORTE
    System.out.println("--------Reporte de Aprendices---------");
    for(int i=0; i<5; i++){
        System.out.println("Linea: "+linea[i]);
        for(int j=0; j<nombreAprendiz[i].length; j++){
            System.out.println("- Aprendiz: "+nombreAprendiz[i][j]);
            System.out.println("- Programa: "+programaFormacion[i][j]);
            System.out.println("- Horario: "+horario[i][j]);
            System.out.println("- Ambiente: "+ambienteAsignado[i][j]);
            
        }
    }
    }

    public static void instructor(){
        int opcion,cantidad;
        //LINEA
        for(int i=0; i<5; i++){
            System.out.println("Linea: "+linea[i]);
            System.out.print("Cuantos instructores desea ingresar: ");
            cantidad=teclado.nextInt();
            teclado.nextLine();

            //ESPACIO PARA LAS MATRICES
            instructorLinea[i] = new String[cantidad];
            instructorHorario[i] = new String[cantidad];
            instructorAmbiente[i] = new String[cantidad];

            //DATOS DE INSTRUCTOR
            for (int j=0; j<cantidad; j++){
                //NOMBRE
                System.out.println("Ingrese el nombre del instructor a la linea: ");
                instructorLinea[i][j]=teclado.nextLine();

                //HORARIO
                System.out.println("ingrese el horario del intructor: ");
                instructorHorario[i][j]=teclado.nextLine();

                //AMBIENTE
                System.out.println("Seleccione un ambiente:");
                for(int k=0; k<ambienteLinea[i].length; k++){
                    System.out.println((k+1) + ". " + ambienteLinea[i][k]);
                }
                opcion = teclado.nextInt();
                teclado.nextLine();
                instructorAmbiente[i][j] = ambienteLinea[i][opcion-1];
            }

            
        }
        // REPORTE   
        System.out.println("------REPORTE DE INSTRUCTORES------");
        for (int i = 0; i < 5; i++) {
        System.out.println("Linea: " + linea[i]);
            for (int j = 0; j < instructorLinea[i].length; j++) {
                System.out.println("- Instructor: " + instructorLinea[i][j]);
                System.out.println("- Horario: " + instructorHorario[i][j]);
                System.out.println("- Ambiente: " + instructorAmbiente[i][j]);
            }
        }

    }
}

