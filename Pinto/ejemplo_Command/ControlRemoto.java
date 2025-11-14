package ejemplo_Command;

import java.util.Stack;

public class ControlRemoto {
    private Stack<Command> historial = new Stack<>();

    public void presionarBoton(Command comando) {
        comando.execute();
        historial.push(comando);
    }

    public void presionarDeshacer() {
        if (!historial.isEmpty()) {
            Command ultimo = historial.pop();
            ultimo.undo();
        } else {
            System.out.println("Nada que deshacer.");
        }
    }
}
