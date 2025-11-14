package ejemplo_Command;

// Comando para apagar la luz
public class ApagarLuzCommand implements Command {
    private Luz luz;

    public ApagarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.apagar();
    }

    @Override
    public void undo() {
        luz.encender();
    }
}
