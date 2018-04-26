package sample;

public class LampeAusCommand implements Command{


    private Lampe lampe;

    public LampeAusCommand(Lampe lampe) {
        this.lampe = lampe;
    }


    @Override
    public void execute() {
        lampe.aus();
    }

    @Override
    public void undo() {
        lampe.an();
    }
}
