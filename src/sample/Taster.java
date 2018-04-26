package sample;

public class Taster {

    private Command command;

    public Taster(Command command) {
        this.command = command;
    }

    public void gedrueckt() {
        command.execute();
    }

    public void nichtGedrueckt() {
        command.undo();
    }

}
