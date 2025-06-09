import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        String[] N = new String[10]; 
        String[] SN = new String[10]; 
        String[] PA = new String[10]; 
        String[] SA = new String[10];
        int[] telefono = new int[10];
        int[] edad = new int[10];
        String[] RH = new String[10];
        String[] correo = new String[10];
        String[] ocupacion = new String[10];

        int totalUsuarios = 0;
        boolean salir = false;

        do {
            System.out.println("--- menu principal ---"); 
            System.out.println("1. buscar usuario"); 
            System.out.println("2. ingresar nuevo usuario"); 
            System.out.println("3. salir"); 
            System.out.print("seleccione una opcion: "); 

            int opcion = teclado.nextInt();
            SP.nextLine();

            switch (opcion) {
                case 1: 
                    System.out.print("ingrese dato a buscar (nombre, telefono, edad, rh, correo u ocupacion): "); 
                   
                    String busqueda = teclado.nextLine().toLowerCase(); 
                    
                    boolean encontrado = false;
                    for (int i = 0; i < totalUsuarios; i++) {
                        
                        if (N[i].toLowerCase().contains(busqueda) || 
                            SN[i].toLowerCase().contains(busqueda) ||
                            PA[i].toLowerCase().contains(busqueda) ||
                            SA[i].toLowerCase().contains(busqueda) ||
                            String.valueOf(telefono[i]).contains(busqueda) ||
                            String.valueOf(edad[i]).contains(busqueda) ||
                            RH[i].toLowerCase().contains(busqueda) ||
                            correo[i].toLowerCase().contains(busqueda) ||
                            ocupacion[i].toLowerCase().contains(busqueda)) {

                            System.out.println("\nusuario encontrado:"); 
                            System.out.println("nombre completo: " + N[i] + " " + SN[i] + " " + PA[i] + " " + SA[i]); 
                            System.out.println("telefono: " + telefono[i]); 
                            System.out.println("edad: " + edad[i]); 
                            System.out.println("rh: " + RH[i]); 
                            System.out.println("correo: " + correo[i]); 
                            System.out.println("ocupacion: " + ocupacion[i]); 

                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("no se encontraron usuarios con esos datos.");
                    }
                    break;

                case 2: 
                    System.out.print("infrese la cantidad de usuarios que quiere ingresar  " + (10 - totalUsuarios)); 
                    int cantidad = teclado.nextInt();
                    teclado.nextLine(); 
                    
                    for (int i = totalUsuarios; i < totalUsuarios + cantidad; i++) {
                        System.out.println("\nregistrando usuario " + (i + 1)); 
                        System.out.print("ingrese primer nombre: "); 
                        N[i] = teclado.nextLine();

                        System.out.print("ingrese segundo nombre: ");
                        SN[i] = teclado.nextLine();

                        System.out.print("ingrese primer apellido: "); 
                        PA[i] = teclado.nextLine();

                        System.out.print("ingrese segundo apellido: "); 
                        SA[i] = teclado.nextLine();

                        System.out.print("ingrese telefono: "); 
                        telefono[i] = teclado.nextInt();
                        teclado.nextLine(); 

                        System.out.print("ingrese edad: "); 
                        edad[i] = teclado.nextInt();
                        teclado.nextLine(); 

                        System.out.print("ingrese rh: "); 
                        RH[i] = teclado.nextLine();

                        System.out.print("ingrese correo: "); 
                        correo[i] = teclado.nextLine();

                        System.out.print("ingrese ocupacion: "); 
                        ocupacion[i] = teclado.nextLine();
                    }
                    break;
                    
                case 3: 
                    salir = true;
                    System.out.println("saliendo"); 
                    break;
                    
                default:
                    System.out.println("opcion no valida"); 
            }
        } while (!salir);
        
        teclado.close();
    }
}