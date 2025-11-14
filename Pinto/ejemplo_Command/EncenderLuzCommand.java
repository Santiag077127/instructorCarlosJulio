package ejemplo_Command;

public class EncenderLuzCommand implements Command {
    private Luz luz;

    public EncenderLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.encender();
    }

    @Override
    public void undo() {
        luz.apagar();
    }
}
