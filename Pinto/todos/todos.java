package todos;
import java.util.Scanner;
public class todos {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);    

        int opcion,numero1,numero2,numero3,numero4,contador,numero5,numero6,estado=0,calcularInt,calcularInt2;
        double CalcularDouble,numero1D,numero2D,numero3D,numero4D;
        char letra;
        
        
        
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
                    System.out.println("Calcule la Distancia recorrida: ");
                    System.out.println("Ingrese la velocidad: ");
                    numero1=teclado.nextInt();
                    System.out.println("Ingrese el tiempo: ");
                    numero2=teclado.nextInt();
                    System.out.println("La Distancia recorrida es: "+numero1*numero2);

                    break;
                }
                case 2:{
                    System.out.println("Calcular el promedio de tres notas");
                    System.out.println("Ingrese la primer Nota: ");
                    numero1=teclado.nextInt();
                    System.out.println("Ingrese la Segunda Nota: ");
                    numero2=teclado.nextInt();
                    System.out.println("Ingrese la Tercera Nota: ");
                    numero3=teclado.nextInt();
                    System.out.println("El promedio es : "+(numero1+numero2+numero3)/3);
                    break;
                }
                case 3:{
                    System.out.println("Calcular respustas correctas, inconrrectas y en blanco:");
                    System.out.println("Ingrese respuestas correctas");
                    numero1= teclado.nextInt();
                    System.out.println("Ingrese respuestas incorrectas");
                    numero2= teclado.nextInt();
                    System.out.println("Ingrese respuestas en banco");
                    numero3= teclado.nextInt(); 
                    System.out.println("Puntaje Final:"+(numero1*4 - numero2*1));
                    break;        
                }
                case 4:{
                    System.out.println("hacer el calculo de puntos en torneo ");
                    System.out.println("Ingrese Partidos Ganados");
                    numero1= teclado.nextInt();
                    System.out.println("Ingrese partidos perdidos");
                    numero2= teclado.nextInt();
                    System.out.println("Ingrese partidos empatados");
                    numero3= teclado.nextInt();
                    System.out.println("Puntaje Final: "+((numero1*3) + (numero1*1)));

                    break;
                }
                case 5:{
                    System.out.println("Planilla de un empleado");
                    System.out.println("Ingrese el numero de horas laboradas en el mes:");
                    numero1=teclado.nextInt();
                    System.out.println("ingrese la tarifa por hora: ");
                    numero2=teclado.nextInt();
                    System.out.println("La planilla es: "+numero1*numero2);
                    break;
                }
                case 6:{
                    System.out.println("6.Hacer el calculo de los 3 lados de un triangulo: ");
                    
                    System.out.println("ingrese la longitudA: ");
                    numero1= teclado.nextInt();

                    System.out.println("ingrese la longitudB: ");
                    numero2= teclado.nextInt();

                    System.out.println("ingrese la longitudC: ");
                    numero3= teclado.nextInt();

                    System.out.println("Longitud del semiperimetro"+(CalcularDouble=(numero1+numero2+numero3)/2));
                    System.out.println("Area del triangulo: "+Math.sqrt((CalcularDouble*(CalcularDouble-numero1)*(CalcularDouble-numero2)*(CalcularDouble-numero3))));
                    break;
                }
                case 7:{
                    System.out.println("7.Calcular el numeros de CDs necesesarios para hacer una copia de seguridad : ");
                                
                    System.out.println("Ingrese las gigasbytes");
                    numero1=teclado.nextInt();
                    System.out.println("Megabytes en el disco duro: "+(CalcularDouble=numero1*1.024));
                    System.out.println("Numeros de CDs:"+((int)(CalcularDouble/700)+1));
                    break;
                }
                case 8:{
                    System.out.println("8.Obtener la distancia entre el punto A y B  ");
                    System.out.println("Ingrese la abcisaA");
                    numero1D=teclado.nextDouble();
                    System.out.println("Ingrese la abcisaB");
                    numero2D=teclado.nextDouble();
                    System.out.println("Ingrese la ordenadaA");
                    numero3D=teclado.nextDouble();
                    System.out.println("Ingrese la ordenadaB");
                    numero4D=teclado.nextDouble();
                    System.out.println("La distancia es: "+(Math.sqrt(Math.pow(numero2D-numero1D,2)+(Math.pow(numero3D-numero4D,2)))));
                    break;
                }
                case 9:{
                    System.out.println("9.Saber si una persona debe sacar su CUIL  ");
                    System.out.println("Ingrese el año de nacimiento:");
                    numero1=teclado.nextInt();
                    System.out.println("Ingrese el año actual:");
                    numero2=teclado.nextInt();
                    System.out.println("Edad:"+(calcularInt=(numero2-numero1)));
                    if (calcularInt>18) {
                        System.out.println("Debe solicitar su CUIL");
                    }else{
                        System.out.println("No debe solicitar su CUIL");
                    }

                    break;
                }
                case 10:{
                    System.out.println("10.Calcular la edad de dos hermanos y decir la diferencia de edad y quien de los dos es mayor  ");
                    System.out.println("Ingrese la edad del primer hermano");
                    numero1=teclado.nextInt();
                    System.out.println("Ingrese la edad del segundo hermano");
                    numero2=teclado.nextInt();

                    if (numero1>numero2) {
                        System.out.println("El primer hermano es mayor");
                        calcularInt=numero1-numero2;
                    }else{
                        System.out.println("El segundo hermano es mayor");
                        calcularInt=numero2-numero1;
                    }
                    System.out.println("La diferencia de edad es: "+calcularInt);
                    break;
                }
                case 11:{
                    System.out.println("11.Calculo de la produccion promedio de una empresa  ");
                    System.out.println("Ingrese la produccion del dia Lunes: ");
                    numero1=teclado.nextInt();
                    System.out.println("Ingrese la produccion del dia Martes: ");
                    numero2=teclado.nextInt();
                    System.out.println("Ingrese la produccion del dia Miercoles: ");
                    numero3=teclado.nextInt();
                    System.out.println("Ingrese la produccion del dia Jueves: ");
                    numero4=teclado.nextInt();
                    System.out.println("Ingrese la produccion del dia Viernes: ");
                    numero5=teclado.nextInt();
                    System.out.println("Ingrese la produccion del dia Sabado: ");
                    numero6=teclado.nextInt();
                    System.out.println("La produccion total es: "+(calcularInt=(numero1+numero2+numero3+numero4+numero5+numero6)));
                    System.out.println("El promedio de la produccion es: "+(calcularInt/6));
                    if (calcularInt>=100) {
                        System.out.println("Recibira Incentivos");
                    } else {
                        System.out.println("No recibira Incentivos");
                    }
                    break;
                }
                case 12:{
                    System.out.println("12.Leer tres numeros enteros diferentes y determinar el numero mayor ");
                    System.out.println("Ingrese el primer numero");
                    numero1=teclado.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    numero2=teclado.nextInt();
                    System.out.println("Ingrese el tercer numero");
                    numero3=teclado.nextInt();

                    if ((numero1>numero2)&&(numero1>numero3)) {
                        System.out.println("El numero mayor es el numero: "+numero1);
                    } else if (numero2>numero3) {
                        System.out.println("El numero mayor es: "+numero2);
                    }else{
                        System.out.println("El numero mayor es: "+numero3);
                    }
                    break;
                }
                case 13:{
                    System.out.println("13.Reconocer el tipo de triangulo por sus lados ");
                    System.out.println("Ingrese el Primer lado:");
                    numero1=teclado.nextInt();

                    System.out.println("Ingrese el Segundo lado:");
                    numero2=teclado.nextInt();

                    System.out.println("Ingrese el Tercer lado:");
                    numero3=teclado.nextInt();

                    if ((numero1!=numero2)&&(numero2 != numero3) && (numero3!=numero1)) {
                        System.out.println("El triangulo es Escaleno");

                    }else if ((numero1==numero2)&&(numero2==numero3)){
                        System.out.println("El triangulo es Equilatero");
            
                    }else{
                        System.out.println("El tipo de triangulo es Isoceles");
                    }
                    break;
                }
                case 14:{
                    System.out.println("14.Ingresar los numeros del 1 al 10 y mostrar su equivalente en numeros romanos ");
                    System.out.println("Ingrese un numero del 1 al 10");
                    numero1=teclado.nextInt();

                    switch (numero1){
                        case 1:{
                            numero1=1;
                            System.out.println("equivalente a numero romano es: I");
                            break;
                        }
                        case 2:{
                            numero1=2;
                            System.out.println("equivalente a numero romano es: II");
                            break;
                        }
                        case 3:{
                            numero1=3;
                            System.out.println("equivalente a numero romano es: III");
                            break;
                        }
                        case 4:{
                            numero1=4;
                            System.out.println("equivalente a numero romano es: IV");
                            break;
                        }
                        case 5:{
                            numero1=5;
                            System.out.println("equivalente a numero romano es: V");
                            break;
                        }
                        case 6:{
                            numero1=6;
                            System.out.println("equivalente a numero romano es: VI");
                            break;
                        }
                        case 7:{
                            numero1=7;
                            System.out.println("equivalente a numero romano es: VII");
                            break;
                        }
                        case 8:{
                            numero1=8;
                            System.out.println("equivalente a numero romano es: VIII");
                            break;
                        }
                        case 9:{
                            numero1=9;
                            System.out.println("equivalente a numero romano es: IX");
                            break;
                        }
                        case 10:{
                            numero1=10;
                            System.out.println("equivalente a numero romano es: X");
                            break;
                        }
                    }
                }
                case 15:{
                    System.out.println("15.calcular si las ventas realizadas durante un mes por un vendedor merecer tener bonificacion");
                    System.out.println("Ingrese el monto de venta");
                    numero1=teclado.nextInt();
                            
                        numero2=0;

                        if (numero1>=0 && numero1<1000) {
                            numero2=(0*numero1)/100;
                        }
                        if (numero1>=1000 && numero1<5000) {
                            numero2=(3*numero1)/100;
                        }
                        if (numero1>=5000 && numero1<20000) {
                            numero2=(5*numero1)/100;
                        }
                        if (numero1==20000) {
                            numero2=(8*numero1)/100;
                        }  
                    System.out.println("Su bonificacion es: "+numero2);
        
                    break;
                }
                case 16:{
                    System.out.println("14.Ingresar los numeros del 1 al 5  y mostrar su vocal equivalente  ");
                    System.out.println("Ingrese un numero del 1 al 5");
                    numero1=teclado.nextInt();
                    
                        switch (numero1){
                        case 1:{
                            numero1=1;
                            System.out.println("su vocal equivalente es: A");
                            break;
                        }
                        case 2:{
                            numero1=2;
                            System.out.println("su vocal equivalente es: E");
                            break;
                        }
                        case 3:{
                            numero1=3;
                            System.out.println("su vocal equivalente es: I");
                            break;
                        }
                        case 4:{
                            numero1=4;
                            System.out.println("su vocal equivalente es: O");
                            break;
                        }
                        case 5:{
                            numero1=5;
                            System.out.println("su vocal equivalente es: U");
                            break;
                        }
                    }

                }
                case 17:{
                    System.out.println("17.Se desea leer un numero entero de dos cifras y que muestre el numero de decenas y centenas que lo componen");
                    System.out.println("Ingrese el numero entero de DOS cifras:");
                    numero1=teclado.nextInt();

                    calcularInt= (int)(numero1/10);
                    calcularInt2=numero1-(calcularInt*10);
                    System.out.println("Decenas:"+calcularInt);
                    System.out.println("Unidades"+calcularInt2);

                    break;

                }
                case 18:{
                    System.out.println("18.Se desea leer un numero entero si es diferente a cero es par ");
                    System.out.println("Ingrese el numero entero:");
                    numero1=teclado.nextInt();

                    calcularInt=numero1/2;
                    calcularInt2=numero1-(calcularInt*2);

                    if (calcularInt2==0) {
                        System.out.println("Es Par");
                    } else {
                        System.out.println("Es Impar");
                    }

                    break;
                }
                case 19:{
                    System.out.println("19.contener los primeros diez numeros pares");
                    numero1 = 2;

                    for(contador = 1; numero1 <= 9; contador++) {
                        numero1 = numero1 + 2;
                        System.out.println("Los primeros 10 numeros pares son: "+numero1);
                    }
                    break;
                }
                case 20:{
                   System.out.println("20.calcular el sueldo promedio de un grupo de personas");
                   System.out.println("Ingresar el numero de empleados: ");
                   numero1=teclado.nextInt();
                   
                   calcularInt=0;

                   for(contador=1;contador<=numero1;contador++){
                    System.out.println("Ingrese el sueldo de los empleados");
                    numero2=teclado.nextInt();

                    calcularInt=calcularInt+numero2;
                   }
                   calcularInt2=calcularInt / numero1;
                   System.out.println("El promedio del sueldo de los empleados es: "+calcularInt2);

                   break;
                }
                case 21:{
                    System.out.println("21.solicitar la edad de 200 personas y mostrar cuantos mayores y menores de edad hay");
                    
                    
                    numero2=0;//menores
                    numero3=0;

                    for(contador=1;contador<=200;contador++){
                        System.out.println("Ingrese las edades:");
                        numero1=teclado.nextInt();

                        if (numero1 <18 ) {
                            numero2=numero2+1;
                        } else {
                            numero3=numero3+1;
                        }

                        System.out.println("Numeros de menores de edad: "+numero2);
                        System.out.println("Numeros de mayores de edad: "+numero3);
                    }
                    break;
                }
                case 22:{
                    System.out.println("22.Realizar sumas sucesivas con dos numeros enteros y mostrar su producto");
                    System.out.println("Ingrese el primer numero:");
                    numero1=teclado.nextInt();
                    System.out.println("Ingrese el segundo numero:");
                    numero2=teclado.nextInt();

                    numero3=0;

                    for (contador=0; contador<numero2;contador++){
                        numero3=numero3+numero1;
                    }
                    System.out.println("Resultado: "+numero3);
                    break;
                }
                case 23:{
                    System.out.println("Mostrar los 10 primeros numero enteros execto los pares");
                    
                    for(contador=1;contador<=10;contador++){
                        numero1=contador/2;
                        numero2=contador-(numero1*2);
                        if (numero2==0) {
                            continue;
                        }else{
                            System.out.println(contador);
                        }
                    }
                    break;
                }
                case 24:{
                    System.out.println("24.Mostrar los terminos de la serie que sean menores a 1000");
                    System.out.println("Ingrese un valor menor a 1000");
                    numero1=teclado.nextInt();

                    while (numero1<1000) {
                        numero1=(numero1*numero1)+1;
                        System.out.println(numero1);

                    }
                    break;
                }
                case 25:{
                    System.out.println("25.Solicitar ingresar letras hasta que entre una vocal");
                    char SEMAF = 'V';

                    while (SEMAF == 'V') {
                        System.out.print("Ingrese una letra: ");
                        letra = teclado.next().charAt(0);

                        switch (Character.toLowerCase(letra)) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                            SEMAF = 'R';
                            break;
                            default:
                            SEMAF = 'V';
                            break;
                        }              
                    }
                }
                case 26:{
                    System.out.println("26.Terminos de la serie fibonacci menores a 100000");

                    numero1=0;
                    numero2=1;
                    numero3=numero1+numero2;

                    while (numero3<100000) {
                        System.out.println(numero3);
                        numero1=numero2;
                        numero2=numero3;
                        numero3=numero1+numero2;
                    }
                    break;
                }
                case 27:{
                    System.out.println("27.Solicitar dos numeros enteros y un operador arimetrico y mostrar el resultado de la operacion");
                    System.out.println("Ingrese el primer numero entero");
                    numero1=teclado.nextInt();
                    System.out.println("Ingrese el segundo numero entero");
                    numero2=teclado.nextInt();
                    System.out.println("Ingrese el operador");
                    letra=teclado.next().charAt(0);
                    numero3=0;
                    switch (letra){
                        case '+':{
                            numero3=numero1+numero2;
                            break;
                        }
                        case '-':{
                            
                            numero3=numero1-numero2;
                            
                        }
                        case '*':{
                            
                            numero3=numero1*numero2;
                            
                            break;
                        }
                        case '^':{
                            numero3=((numero1*numero1)+(numero2*numero2));
                              
                            break;
                        }
                    }
                    System.out.println("El resultado es: "+numero3);
                    break;
                }
                case 28:{
                    
                    numero1 = 0; 
                    numero2 = 0;

                    for (contador = 1; contador <= 10; contador++) {
                        System.out.print("Ingrese una letra (" + contador + " de 10): ");
                        letra = teclado.next().charAt(0);

                        
                        letra = Character.toLowerCase(letra);

                        switch (letra) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                numero1++;
                                break;
                                default:
                                if (Character.isLetter(letra)) {
                                    numero2++;
                                } else {
                                    System.out.println("No es una letra válida, no se cuenta.");
                                }
                        }
                        System.out.println("\nNúmero de vocales: " + numero1);
                        System.out.println("Número de consonantes: " + numero2);    
                        
                    }
                    break;
                
                } 
                case 29:{
                    numero1 = 0; 
                    numero2 = 0; 
                    numero3 = 0; 
                    numero4 = 0; //votos en blanco         

                    
                    for ( contador = 1; contador <= 10; contador++) {
                        System.out.print("Ingrese el voto del elector " + contador + " (1, 2, 3 o cualquier otro para nulo/blanco): ");
                        numero5 = teclado.nextInt();

                        switch (numero5) {
                            case 1:
                            numero1++;
                            break;
                        case 2:
                            numero2++;
                            break;
                        case 3:
                            numero3++;
                            break;
                        default:
                            numero4++;
                        }   
                    }

                    if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4) {
                        calcularInt = 1;
                    } else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4) {
                        calcularInt = 2;
                    } else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4) {
                        calcularInt = 3;
                    } else {
                        calcularInt = 0; 
                    }
                    
                    System.out.println("\nResultados:");
                    System.out.println("Candidato 1: " + numero1 + " votos");
                    System.out.println("Candidato 2: " + numero2 + " votos");
                    System.out.println("Candidato 3: " + numero3 + " votos");
                    System.out.println("Votos nulos o en blanco: " + numero4);

                    if (calcularInt == 0) {
                        System.out.println("No hay un ganador claro o ganó el voto nulo/blanco.");
                    } else {
                        System.out.println("El ganador es el Candidato " + calcularInt);
                    }
                    break;
                }
                case 30:{
                    System.out.println("30.Solicitar dos numeros e imprimir su promedio ");
                    System.out.println("Ingrese el primer numero");
                    numero1=teclado.nextInt();
                    System.out.println("Ingrese el primer numero");
                    numero2=teclado.nextInt();

                    calcularInt=(numero1+numero2);
                    System.out.println("Promedio: "+ calcularInt/2);
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