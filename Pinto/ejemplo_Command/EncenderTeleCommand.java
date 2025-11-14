package ejemplo_Command;


// Comando para encender el televisor
public class EncenderTeleCommand implements Command {
    private Televisor tele;

    public EncenderTeleCommand(Televisor tele) {
        this.tele = tele;
    }

    @Override
    public void execute() {
        tele.encender();
    }

    @Override
    public void undo() {
        tele.apagar();
    }
}