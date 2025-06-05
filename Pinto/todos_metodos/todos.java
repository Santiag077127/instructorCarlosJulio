
import java.util.Scanner;
public class todos {
    public static todos Todos = new todos();
    public static Scanner teclado = new Scanner(System.in);  
    public static int opcion,numero1,numero2,numero3,numero4,contador,numero5,numero6,estado=0,calcularInt,calcularInt2,calcularInt3;
    public static  double CalcularDouble,CalcularDouble2,numero1D,numero2D,numero3D,numero4D;
    public static   char letra,SEMAF;

    public static void main(String[] args) {        
        do{
            System.out.println("Ingrese un ejercicio del 1 al 30  ");
            System.out.println("1.Calcular la distancia recorrida ");
            System.out.println("2.Calcular el promedio de 3 notas  ");
            System.out.println("3.Calcular el puntaje final  ");
            System.out.println("4.Calcular el puntaje final de partidos ganados, perdidos y empatados en un torneo ");
            System.out.println("5.Calcular la planilla de un trabajador  ");
            System.out.println("6.Hacer el calculo de los 3 lados de un triangulo ");
            System.out.println("7.Calcular el numeros de CDs necesesarios para hacer una copia de seguridad  ");
            System.out.println("8.Obtener la distancia entre el punto A y B  ");
            System.out.println("9.Saber si una persona debe sacar su CUIL  ");
            System.out.println("10.Calcular la edad de dso hermanos y decir la diferencia de edad y quien de los dos es mayor  ");
            System.out.println("11.Calculo de la produccion promedio de una empresa  ");
            System.out.println("12.Leer tres numeros enteros diferentes y determinar el numero mayor ");
            System.out.println("13.Reconocer el tipo de triangulo por sus lados ");
            System.out.println("14.Ingresar los numeros del 1 al 10 y mostrar su equivalente en numeros romanos ");
            System.out.println("15.calcular si las ventas realizadas durante un mes por un vendedor merecer tener bonificacion");
            System.out.println("16.Ingresar los numeros del 1 al 5 y mostrar su vocal equivalente");
            System.out.println("17.Se desea leer un numero entero de dos cifras y que muestre el numero de decenas y centenas que lo componen");
            System.out.println("18.Se desea leer un numero entero si es diferente a cero es par ");
            System.out.println("19.contener los primeros diez numeros pares");
            System.out.println("20.calcular el sueldo promedio de un grupo de personas");
            System.out.println("21.solicitar la edad de 200 personas y mostrar cuantos mayores y menores de edad hay");
            System.out.println("22.Realizar sumas sucesivas con dos numeros enteros y mostrar su producto");
            System.out.println("23.Mostrar los 10 primeros numero enteros execto los pares");
            System.out.println("24.Mostrar los terminos de la serie que sean menores a 1000");
            System.out.println("25.Solicitar ingresar letras hasta que entre una vocal");
            System.out.println("26.Terminos de la serie fibonacci menores a 100000");
            System.out.println("27.Solicitar dos numeros enteros y un operador arimetrico y mostrar el resultado de la operacion");
            System.out.println("28.Solicitar 10 letras cualquieras e indicar cuantas vocales y consonantes se ingresaron");
            System.out.println("29.Resultado de unas elecciones");
            System.out.println("30.promedio de dos numeros");
            System.out.println("Seleccione 0 para salir");

            opcion=teclado.nextInt();
        
            switch (opcion) {
                case 1:{
                    leerDato.ScannerDos();
                    Distancia.distancia();
                    break;
                }
                case 2:{
                    System.out.println("Calcular el promedio de tres notas");
                    leerDato.ScannerTres();
                    promedio.promedio_three();
                    break;
                }
                case 3:{
                    System.out.println("Calcular respustas correctas, inconrrectas y en blanco:");
                    leerDato.ScannerTres();
                    puntaje.respuestas();
                    break;        
                }
                case 4:{
                    System.out.println("hacer el calculo de puntos en torneo ");
                    System.out.println("Ingresar primero los partidos ganaos, luego los empatados y por ultimo los perdidos ");
                    leerDato.ScannerTres();
                    partidos.partidos();

                    break;
                }
                case 5:{
                    leerDato.ScannerDos();
                    tarifa.Planilla();
                    break;
                }
                case 6:{
                    System.out.println("6.Hacer el calculo de los 3 lados de un triangulo: ");
                    leerDato.ScannerTresD();
                    areaTriangulo.areaTriangulo();
                    break;
                }
                case 7:{
                    System.out.println("7.Calcular el numeros de CDs necesesarios para hacer una copia de seguridad : ");
                                
                    leerDato.ScannerunoD();
                    cds.cds();
                    break;
                }
                case 8:{
                    System.out.println("8.Obtener la distancia entre el punto A y B  ");
                    leerDato.ScannerCuatroD();
                    puntos.puntos();
                    break;
                }
                case 9:{

                    System.out.println("9.Saber si una persona debe sacar su CUIL  ");
                    System.out.println("Primero tienes que ingresar la fecha actual y luego la fecha de nacimiento  ");
                    leerDato.ScannerDos();
                    edad.Cuil();
                    break;
                }
                case 10:{
                    System.out.println("10.Calcular la edad de dos hermanos y decir la diferencia de edad y quien de los dos es mayor  ");
                    leerDato.ScannerDos();
                    edad_two.Edad_mayor();
                    break;
                }
                case 11:{
                    System.out.println("11.Calculo de la produccion promedio de una empresa  ");
                    leerDato.ScannerSeis();
                    produccion.promedio();
                    break;
                }
                case 12:{
                    System.out.println("12.Leer tres numeros enteros diferentes y determinar el numero mayor ");
                    leerDato.ScannerTres();
                    numeros.numeroMayor();
                    break;
                }
                case 13:{
                    System.out.println("13.Reconocer el tipo de triangulo por sus lados ");
                    leerDato.ScannerTres();
                    triangulo.triangulo();
                    break;
                }
                case 14:{
                    System.out.println("14.Ingresar los numeros del 1 al 10 y mostrar su equivalente en numeros romanos ");
                    leerDato.Scanneruno();
                    romanos.romanos();
                    break;
                }
                case 15:{
                    System.out.println("15.calcular si las ventas realizadas durante un mes por un vendedor merecer tener bonificacion");
                    leerDato.Scanneruno();
                    ventas.ventas();
        
                    break;
                }
                case 16:{
                    System.out.println("14.Ingresar los numeros del 1 al 5  y mostrar su vocal equivalente  ");
                    leerDato.Scanneruno();
                    mensaje.mensaje();
                    break;
                }
                case 17:{
                    System.out.println("17.Se desea leer un numero entero de dos cifras y que muestre el numero de decenas y centenas que lo componen");
                    leerDato.Scanneruno();
                    Decenas.decenas();
                    break;

                }
                case 18:{
                    System.out.println("18.Se desea leer un numero entero si es diferente a cero es par ");
                    leerDato.Scanneruno();
                    par_two.entero();
                    break;
                }
                case 19:{
                    System.out.println("19.contener los primeros diez numeros pares");
                    par.diezPares();
                    break;
                }
                case 20:{
                   System.out.println("20.calcular el sueldo promedio de un grupo de personas");
                    leerDato.ScannerDos();
                    salario.sueldo();
                   break;
                }
                case 21:{
                    System.out.println("21.solicitar la edad de 200 personas y mostrar cuantos mayores y menores de edad hay");
                    EdadDoscientos.docientos();
                    break;
                }
                case 22:{
                    System.out.println("22.Realizar sumas sucesivas con dos numeros enteros y mostrar su producto");
                    leerDato.ScannerDos();
                    suma.suma();
                    break;
                }
                case 23:{
                    System.out.println("Mostrar los 10 primeros numero enteros execto los pares");
                    leerDato.Scanneruno();
                    menoresMil.menores();
                    break;
                }
                case 24:{
                    System.out.println("24.Mostrar los terminos de la serie que sean menores a 1000");
                    serie.sarie();
                    break;
                }
                case 25:{
                    System.out.println("25.Solicitar ingresar letras hasta que entre una vocal");
                    leerDato.ScannerChar();
                    vocal.vocal();
                    break;

                }
                case 26:{
                    System.out.println("26.Terminos de la serie fibonacci menores a 100000");
                   fibonassi.fibonacci(); numero1=0;
                    break;
                }
                case 27:{
                    System.out.println("27.Solicitar dos numeros enteros y un operador arimetrico y mostrar el resultado de la operacion");
                    leerDato.ScannerDos();
                    leerDato.ScannerChar();
                    operador.operador();
                    break;
                }
                case 28:
                {
                    leerDato.ScannerChar();  
                    consonantes.consonantes();    
                
                    break;
                
                } 
                case 29:{
                    votos.votos();
                    break;
                }
                case 30:{
                    System.out.println("30.Solicitar dos numeros e imprimir su promedio ");
                    leerDato.ScannerDos();
                    promedio_two.Promedio_two();
                    break;
                }
                case 0:{
                    System.out.println("Salir:");
                    estado=1;
                }
            }

        }while(estado==0);

        teclado.close();
    }

}
