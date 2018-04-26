package sample;

public class LampeAnCommand implements Command {

    private Lampe lampe;

    public LampeAnCommand(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void execute() {
        lampe.an();
    }

    @Override
    public void undo() {
        lampe.aus();
    }
}
