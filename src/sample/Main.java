package sample;

public class Main {

    public static void main(String[] args) {

        Lampe lampe = new Lampe();

        Command lampeAn = new LampeAnCommand(lampe);
        Taster tasteAndruecken = new Taster(lampeAn);
        tasteAndruecken.gedrueckt();

        Command lampeAus = new LampeAusCommand(lampe);
        Taster tasteAusDruecken = new Taster(lampeAus);
        tasteAusDruecken.gedrueckt();

        Command lampeHeller = new LampeHellerCommand(lampe);
        Taster tasteHellerDruecken = new Taster(lampeHeller);
        tasteHellerDruecken.gedrueckt();
        tasteHellerDruecken.nichtGedrueckt();


    }

}
