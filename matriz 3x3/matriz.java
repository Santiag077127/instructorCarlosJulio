import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        String[][] matriz = new String [3][3];
        int[][] matrizEnteros = new int[3][3];
        ArrayList<Integer> todosLosValores =new ArrayList<>();

        Random rand = new Random();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                numero=rand.nextInt(5)+1;
                matriz[i][j] = String.valueOf(numero);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizEnteros[i][j] = Integer.parseInt(matriz[i][j]);
                todosLosValores.add(matrizEnteros[i][j]);
                System.out.print(matrizEnteros[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Ingrese un numero menor a 45");
        int objetivo=teclado.nextInt();
        
        boolean encontrado = false;
        int n = todosLosValores.size();

        for (int i = 1; i < (1 << n); i++) {
            ArrayList<Integer> combinacion = new ArrayList<>();
            int suma = 0;

            for (int k = 0; k < n; k++) {
                if ((i & (1 << k)) != 0) {
                    suma += todosLosValores.get(k);
                    combinacion.add(todosLosValores.get(k));
                }
            }
            if (suma == objetivo) {
                System.out.println("\nCombinación encontrada que suma " + objetivo + ":");
                System.out.println(combinacion);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\nNo se encontró ninguna combinación que sume " + objetivo);
        }

    }
}

