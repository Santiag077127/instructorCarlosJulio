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
    public static int [][] cantidadAprendiz = new int[5][];
    public static String [][] inventario = new String[5][];
    public static String[][][] nombreAprendices = new String[5][][];
    public static String[][][] programaAprendices = new String[5][][];
    public static String[] instructorLinea = new String[5];
    public static String[] instructorHorario = new String[5];


    public static void ambientes(){
        int cantidad;

        //REGISTRAR CANTIDAD DE AMBIENTES
        for (int i = 0; i < 5; i++) {
            System.out.println("Línea: "+ linea[i]);
            System.out.print("¿Cuántos ambientes desea registrar?: ");
            cantidad = teclado.nextInt();
            teclado.nextLine();

            ambienteLinea[i] = new String[cantidad];
            Especializado[i] = new String[cantidad];
            cantidadAprendiz[i]=new int[cantidad];
            inventario[i]= new String[cantidad];
            nombreAprendices[i] = new String[cantidad][];   // linea,ambiente,aprendiz
            programaAprendices[i] = new String[cantidad][]; // linea,ambiente,programa

            //NOMBRES 
            for (int j = 0; j < cantidad; j++) {

                //NOMBRE DE LOS AMBIENTES:
                System.out.print("Ingrese el nombre del ambiente: ");
                ambienteLinea[i][j] = teclado.nextLine();

                //EL AMBIENTE ES ESPECIALIZADO:
                System.out.print("¿El ambiente es especializado?: ");
                Especializado[i][j] = teclado.nextLine();

                //CANTIDAD DE APRENDICES:
                System.out.print("Ingrese la cantidad de aprendices para este ambiente: ");
                cantidadAprendiz[i][j] = teclado.nextInt();
                teclado.nextLine();
                //INVENTARIO:
                System.out.println("Ingrese el inventario del ambiente: ");
                inventario[i][j]=teclado.nextLine();
            
                nombreAprendices[i][j] = new String[cantidadAprendiz[i][j]];
                programaAprendices[i][j] = new String[cantidadAprendiz[i][j]];
                
                //APRENDIZ: NOMBRE Y PROGRAMA DE FORMACION
                for (int k = 0; k < cantidadAprendiz[i][j]; k++) {
                System.out.println("Aprendiz: ");
                System.out.print("  Nombre: ");
                nombreAprendices[i][j][k] = teclado.nextLine();

                System.out.print("  Programa de formación: ");
                programaAprendices[i][j][k] = teclado.nextLine();
                }
                System.out.println("");
            }
        }
        //MOSTRAR RESULTADOS
        System.out.println("-------- Ambientes por línea: ----------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Línea: " + linea[i]);
            for (int j = 0; j < ambienteLinea[i].length; j++) {
                System.out.println("Ambiente: " + ambienteLinea[i][j] + " Es especializado: " + Especializado[i][j] );
                System.out.println("Aprendices: "+cantidadAprendiz[i][j]);
                System.out.println("Inventario: "+inventario[i][j]);

                for(int k = 0; k<cantidadAprendiz[i][j]; k++){
                    System.out.println("nombre: "+nombreAprendices[i][j][k]);
                    System.out.println("Programa:"+programaAprendices[i][j][k]);
                }
            }
        }

    }
    public static void instructor(){
        for(int i=0; i<5; i++){
            System.out.println("Linea: "+linea[i]);

            System.out.println("Ingrese el nombre del instructor a la linea: ");
            instructorLinea[i]=teclado.nextLine();

            System.out.println("ingrese el horario del intructor: ");
            instructorHorario[i]=teclado.nextLine();
        }


    }


}
