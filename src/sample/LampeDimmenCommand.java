package sample;

public class LampeDimmenCommand implements Command{

    private Lampe lampe;

    public LampeDimmenCommand(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void execute() {
        lampe.dimmen();
    }

    @Override
    public void undo() {
        lampe.heller();
    }
}
