// 1. Interfaz que toda clase debe tener
interface Expresion {
    int interpretar();
}
//crear el numero
class Numero implements Expresion {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int interpretar() {
        return valor;
    }
}
// 3.creamos la suma
class Suma implements Expresion {
    private Expresion izquierda;
    private Expresion derecha;

    public Suma(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public int interpretar() {
        return izquierda.interpretar() + derecha.interpretar();
    }
}

// 4.hacemos la suma
public class InterpreterEjemplo {
    public static void main(String[] args) {
        // numero de ejemplo: 1 + 2
        Expresion uno = new Numero(1);
        Expresion dos = new Numero(2);
        Expresion suma = new Suma(uno, dos);

        System.out.println("Resultado: " + suma.interpretar()); // resultado 3
    }
}
