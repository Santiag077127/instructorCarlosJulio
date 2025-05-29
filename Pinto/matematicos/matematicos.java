package matematicos;

import java.util.PriorityQueue;
import java.util.Scanner;

public class matematicos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int estado = 0, opcion,numero1,numero2;
        String c;

        do {
            System.out.println("\nSeleccione un ejercicio (1-15):");
            System.out.println("1. Orden de f(n) - g(n)");
            System.out.println("2. Logaritmos en Θ");
            System.out.println("3. Afirmaciones sobre O(f(n))");
            System.out.println("4. Análisis del procedimiento G(n)");
            System.out.println("5. Número triangular");
            System.out.println("6. Tamaño de entrada con más CPU");
            System.out.println("7. Tamaño de entrada con máquina más rápida");
            System.out.println("8. Máximo y mínimo con < 3n/2 comparaciones");
            System.out.println("9. Ecuación de recurrencia T(n)");
            System.out.println("10. Orden temporal de funciones recursivas");
            System.out.println("11. Comparaciones StringSearch");
            System.out.println("12. Ordenación estilo Mergesort generalizado");
            System.out.println("13. Palíndromo recursivo");
            System.out.println("14. Análisis divide y vencerás vs cuadrático");
            System.out.println("15. Comparaciones en MAX_MIN recursivo");
            System.out.println("0. Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1: {
                    int n0 = 10;
                    System.out.printf("%-10s%-10s%-10s%-10s\n", "n", "f(n)", "g(n)", "f(n)-g(n)");
                    for (int n = n0; n <= 100; n += 10) {
                        int fn = 5 * n + 3;
                        int gn = 4 * n + 2;
                        int diff = fn - gn;
                        System.out.printf("%-10d%-10d%-10d%-10d\n", n, fn, gn, diff);
                    }
                    System.out.println("\nConclusión: f(n) y g(n) ∈ Θ(n), por lo tanto f(n)-g(n) ∈ Θ(n)");
                    break;
                }
                case 2: {
                    double a = 2;
                    double b = 10;
                    System.out.printf("%-10s%-15s%-15s%-20s%-20s\n", "n", "log_a(n)", "log_b(n)", "2^log_a(n)", "2^log_b(n)");
                    for (int n = 10; n <= 1000; n *= 10) {
                        double loga = Math.log(n) / Math.log(a);
                        double logb = Math.log(n) / Math.log(b);
                        double powA = Math.pow(2, loga); 
                        double powB = Math.pow(2, logb); 
                        System.out.printf("%-10d%-15.6f%-15.6f%-20.6f%-20.6f\n", n, loga, logb, powA, powB);
                    }
                    System.out.println("\nConclusión:");
                    System.out.println("log_a(n) ∈ Θ(log_b(n)) → VERDADERO");
                    System.out.println("2^log_a(n) ∈ Θ(2^log_b(n)) → FALSO si a ≠ b");
                    break;
                }
                case 3: {
                    System.out.printf("%-10s%-10s%-10s%-15s%-15s\n", "n", "f(n)", "h(n)", "log(f(n))", "log(h(n))");
                    for (int n = 10; n <= 1000; n *= 10) {
                        double fn = n;
                        double hn = Math.pow(n, 2);
                        double logf = Math.log(fn);
                        double logh = Math.log(hn);
                        System.out.printf("%-10d%-10.2f%-10.2f%-15.4f%-15.4f\n", n, fn, hn, logf, logh);
                    }
                    System.out.println("\nAnálisis:");
                    System.out.println("a) Si O(f(n)) = O(h(n)) entonces O(log f(n)) = O(log h(n)) → VERDADERO");
                    System.out.println("b) Si O(log f(n)) = O(log h(n)) entonces O(f(n)) = O(h(n)) → FALSO (ej: f(n)=n, h(n)=n^2)");
                    break;
                }
                case 4: {
                    System.out.print("Ingrese un valor para n: ");
                    int n = teclado.nextInt();

                    long contador = 0;

                    long startTime = System.nanoTime();

                    
                    java.util.Stack<Integer> stack = new java.util.Stack<>();
                    stack.push(n);

                    while (!stack.isEmpty()) {
                        int x = stack.pop();
                        if (x <= 0) continue;

                        
                        for (int i = 1; i <= x; i++) {
                            for (int j = 1; j <= i; j++) {
                                contador++; 
                            }
                         }

                        
                        for (int i = 1; i <= 4; i++) {
                         stack.push(x / 2);
                        }
                    }

                    long endTime = System.nanoTime();

                    
                    System.out.println("\nResultados:");
                    System.out.println("n = " + n);
                    System.out.println("Total de líneas (PUT_LINE): " + contador);
                    System.out.printf("Estimación n^2 log n ≈ %.0f%n", n * n * (Math.log(n) / Math.log(2)));
                    System.out.printf("Tiempo de ejecución: %.3f ms%n", (endTime - startTime) / 1e6);
                    break;
                }
                case 5: {
                    System.out.print("Ingrese un número entero positivo n ≥ 1: ");
                    int n = teclado.nextInt();

                    if (n < 1) {
                        System.out.println("El número debe ser mayor o igual a 1.");
                    } else {
                        int suma = 0;
                        boolean esTriangular = false;
                        for (int k = 1; suma < n; k++) {
                            suma += k;
                            if (suma == n) {
                                esTriangular = true;
                                break;
                            }
                        }

                        if (esTriangular) {
                            System.out.println(n + " es un número triangular.");
                        } else {
                            System.out.println(n + " NO es un número triangular.");
                        }
                    }
                    break;
                }
                case 6: {
                    int nOriginal = 1_000_000;
                    int factorTiempo = 3;
                    int nLineal = factorTiempo * nOriginal;
                    int nCuadratica = (int) Math.sqrt(factorTiempo * nOriginal);
                    int nExponencial = 0;
                    while (Math.pow(10, nExponencial) <= factorTiempo * nOriginal) {
                        nExponencial++;
                    }
                    nExponencial--;
                    System.out.println("Nuevo tamaño de entrada con 3 horas de CPU:");
                    System.out.println("a) T(n) ∈ O(n):         n = " + nLineal);
                    System.out.println("b) T(n) ∈ O(n^2):       n = " + nCuadratica);
                    System.out.println("c) T(n) ∈ O(10^n):      n = " + nExponencial);
                    break;
                }
                case 7: {
                    int nOriginal = 1_000_000;
                    int factorMejora = 100;
                    int nLineal = factorMejora * nOriginal;
                    int nCuadratica = (int) Math.sqrt(factorMejora * nOriginal);
                    int nExponencial = 0;
                    while (Math.pow(10, nExponencial) <= factorMejora * nOriginal) {
                        nExponencial++;
                    }
                    nExponencial--;
                    System.out.println("Nuevo tamaño máximo que se puede procesar en una hora:");
                    System.out.println("a) T(n) ∈ O(n):         n = " + nLineal);
                    System.out.println("b) T(n) ∈ O(n^2):       n = " + nCuadratica);
                    System.out.println("c) T(n) ∈ O(10^n):      n = " + nExponencial);
                    break;
                }
                case 8:{
                    System.out.print("Ingrese el tamaño del vector n: ");
                    int n = teclado.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Ingrese los " + n + " elementos:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = teclado.nextInt();
                    }

                    int max, min;
                    int comparaciones = 0;
                    int i = 0;

                    if (n % 2 == 0) {
                        comparaciones++;
                        if (arr[0] > arr[1]) {
                            max = arr[0];
                            min = arr[1];
                        } else {
                            max = arr[1];
                            min = arr[0];
                        }
                        i = 2;
                    } else {
                        max = min = arr[0];
                        i = 1;
                    }

                    while (i < n - 1) {
                        comparaciones++;
                        int localMax, localMin;
                        if (arr[i] > arr[i + 1]) {
                            localMax = arr[i];
                            localMin = arr[i + 1];
                        } else {
                            localMax = arr[i + 1];
                            localMin = arr[i];
                        }

                        comparaciones++;
                        if (localMax > max) {
                            max = localMax;
                        }
                        comparaciones++;
                        if (localMin < min) {
                            min = localMin;
                        }
                    
                        i += 2;
                    }

                    System.out.println("Máximo: " + max);
                    System.out.println("Mínimo: " + min);
                    System.out.println("Número de comparaciones realizadas: " + comparaciones);
                    System.out.println("Comparaciones < 3n/2? " + (comparaciones < 1.5 * n));
                    break;
                }
                case 9:{
                    System.out.print("Ingrese n (potencia de 4): ");
                        int n = teclado.nextInt();

                        
                        int levels = 0;
                        int temp = n;
                        while (temp > 1) {
                            temp /= 4;
                            levels++;
                        }

                        
                        double[] Tvalues = new double[levels + 1];
                        Tvalues[0] = 1; 

                        temp = 1;
                        for (int i = 1; i <= levels; i++) {
                            temp *= 4; 
                            Tvalues[i] = 2 * Tvalues[i - 1] + (Math.log(temp) / Math.log(2));
                        }

                        System.out.printf("T(%d) = %.4f%n", n, Tvalues[levels]);

                        
                        System.out.println("n\tT(n)");
                        temp = 1;
                        for (int i = 0; i <= levels; i++) {
                            System.out.printf("%d\t%.4f%n", temp, Tvalues[i]);
                            temp *= 4;
                        }
                    break;
                }
                case 10:{
                    System.out.println("Ejercicio 10:");
                    System.out.print("Ingrese n (positivo): ");
                    numero1 = teclado.nextInt();
                    System.out.print("Ingrese m (positivo): ");
                    numero2 = teclado.nextInt();

                    
                    long parcial = 1;
                    for (int i = 2; i <= numero1; i++) {
                        parcial = 2 * parcial;
                    }
                    long total = 1;
                    for (int i = 2; i <= numero1; i++) {
                        total += 2 * parcial; 
                    }
                    System.out.println("(a) total(n) ≈ " + total);

                    
                    total = numero2;
                    int mm = numero2;
                    for (int i = 2; i <= numero1; i++) {
                        mm *= 2;
                        total += mm;
                    }
                    System.out.println("(b) total(n,m) ≈ " + total);
                    break;
                }
                case 11:{
                    System.out.println("Ejercicio 11:");
                    teclado.nextLine(); 
                    System.out.print("Ingrese string A: ");
                    String A = teclado.nextLine();
                    System.out.print("Ingrese string B: ");
                    String B = teclado.nextLine();

                    int N = A.length();
                    int M = B.length();
                    int limite = N - M + 1;
                    boolean encontrado = false;
                    int comparaciones11 = 0;
                    int comienzo = 0;
                    for (int com = 0; com < limite && !encontrado; com++) {
                        int i = com;
                        int j = 0;
                        while (j < M && A.charAt(i) == B.charAt(j)) {
                            comparaciones11++;
                            i++;
                            j++;
                        }
                        if (j == M) {
                            encontrado = true;
                            comienzo = com;
                        } else if (j > 0) {
                            comparaciones11++;
                        }
                    }
                    if (encontrado) {
                        System.out.println("Encontrado en índice: " + comienzo);
                    } else {
                        System.out.println("No encontrado");
                    }
                    System.out.println("Comparaciones en peor caso: " + comparaciones11);
                    break;
                }
                case 12:{
                    int[] arr = {5, 3, 8, 1, 7, 6, 4, 2}; 

                    int n = arr.length;
                    if (n % 2 != 0) {
                        throw new IllegalArgumentException("El tamaño del arreglo debe ser par.");
                    }
                    int numBloques = n / 2;

                    
                    int[][] bloques = new int[numBloques][2];
                    for (int i = 0; i < numBloques; i++) {
                        bloques[i][0] = arr[2 * i];
                        bloques[i][1] = arr[2 * i + 1];
                        if (bloques[i][0] > bloques[i][1]) {
                            int temp = bloques[i][0];
                            bloques[i][0] = bloques[i][1];
                            bloques[i][1] = temp;
                        }
                    }

                    
                    class Elemento implements Comparable<Elemento> {
                        int valor;
                        int bloqueIndex;
                        int posicionEnBloque;
                    
                        Elemento(int valor, int bloqueIndex, int posicionEnBloque) {
                            this.valor = valor;
                            this.bloqueIndex = bloqueIndex;
                            this.posicionEnBloque = posicionEnBloque;
                        }

                        @Override
                        public int compareTo(Elemento otro) {
                            return Integer.compare(this.valor, otro.valor);
                        }
                    }

                    
                    PriorityQueue<Elemento> heap = new PriorityQueue<>();

                    
                    for (int i = 0; i < numBloques; i++) {
                        heap.add(new Elemento(bloques[i][0], i, 0));
                    }

                    int[] resultado = new int[n];
                    int posRes = 0;

                    while (!heap.isEmpty()) {
                        Elemento e = heap.poll();
                        resultado[posRes++] = e.valor;

                        int siguientePos = e.posicionEnBloque + 1;
                        if (siguientePos < 2) { 
                            heap.add(new Elemento(bloques[e.bloqueIndex][siguientePos], e.bloqueIndex, siguientePos));
                        }
                    }

                    System.out.print("Arreglo ordenado: ");
                    for (int val : resultado) {
                        System.out.print(val + " ");
                    }
                    break;
                }
                case 13:{
                    System.out.println("Ejercicio 13:");
                    System.out.println("Ingrese cadena C (solo 'a' y 'b'):");
                    teclado.nextLine(); 
                    c = teclado.nextLine();

                    int izquierda = 0;
                    int derecha = c.length() - 1;
                    boolean esPalindromo = true;
                    int comparacionesPal = 0;

                    while (izquierda < derecha) {
                        comparacionesPal++;
                        if (c.charAt(izquierda) != c.charAt(derecha)) {
                            esPalindromo = false;
                            break;
                        }
                        izquierda++;
                        derecha--;
                    }

                    System.out.println("¿Es palíndromo? " + esPalindromo);
                    System.out.println("Número de comparaciones realizadas: " + comparacionesPal);
                    
                    break;
                }
                case 14:{
                    double k = 1; 
                    int[] tamaños = { 1000, 2000, 4000, 8000, 16000, 32000 };

                    System.out.printf("%10s %20s %25s%n", "n", "Tiempo trivial (n^2)", "Tiempo Div y Venc (iterativo)");
                    System.out.println("--------------------------------------------------------------");

                    for (int n : tamaños) {
                        double tiempoTrivial = k * n * n; 
                    
                        double tiempoDV = 0;
                        int size = n;

                        while (size > 1) {
                            double log2 = Math.log(size) / Math.log(2); 
                            tiempoDV = 2 * tiempoDV + 2 * size * log2;
                            size /= 2;
                        }
                        tiempoDV += 1; 
                    
                        System.out.printf("%10d %20.2f %25.2f%n", n, tiempoTrivial, tiempoDV);
                         break;
                    } 
                }
                case 15:{
                    System.out.println("Ejercicio 15:");
                    System.out.print("Ingrese tamaño del vector n: ");
                    int n = teclado.nextInt();

                    int[] vector = new int[n];
                    System.out.println("Ingrese los elementos:");
                    for (int i = 0; i < n; i++) {
                        vector[i] = teclado.nextInt();
                    }

                    int comparaciones15 = 0;
                    int maxVal, minVal;

                    if (n == 1) {
                        maxVal = minVal = vector[0];
                    } else {
                        if (vector[0] > vector[1]) {
                            maxVal = vector[0];
                            minVal = vector[1];
                        } else {
                            maxVal = vector[1];
                            minVal = vector[0];
                        }
                        comparaciones15++; 
                    
                        for (int i = 2; i < n; i++) {
                            comparaciones15++;
                            if (vector[i] > maxVal) {
                                maxVal = vector[i];
                            } else {
                                comparaciones15++;
                                if (vector[i] < minVal) {
                                    minVal = vector[i];
                                }
                            }
                        }
                        System.out.println("Máximo: " + maxVal);
                        System.out.println("Mínimo: " + minVal);
                        System.out.println("Comparaciones realizadas: " + comparaciones15);
                    }
                }
                case 0: {
                    System.out.println("Salir");
                    estado = 1;
                }
            }
        } while (estado == 0);

        teclado.close();
    }
}
