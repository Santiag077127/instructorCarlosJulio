
package ejemplo_Command;

public class main {
    public static void main(String[] args) {
        Luz luzSala = new Luz();
        Televisor televisor = new Televisor();

        Command encenderLuz = new EncenderLuzCommand(luzSala);
        Command apagarLuz = new ApagarLuzCommand(luzSala);
        Command encenderTele = new EncenderTeleCommand(televisor);

        ControlRemoto control = new ControlRemoto();

        control.presionarBoton(encenderLuz);
        control.presionarBoton(encenderTele);
        control.presionarBoton(apagarLuz);

        control.presionarDeshacer();
        control.presionarDeshacer();
    }
}
