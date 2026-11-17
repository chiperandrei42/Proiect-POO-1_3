package instrumente.task2;

public class Vioara extends InstrumentMuzical {
    private String marime;
    private String tipLemn;

    public Vioara() {
        super();
        this.marime = "4/4";
        this.tipLemn = "Molid și arțar";
    }

    public Vioara(String nume, String producator, double pret, String marime, String tipLemn) {
        super(nume, producator, pret);
        this.marime = marime;
        this.tipLemn = tipLemn;
    }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }

    public String getTipLemn() {
        return tipLemn;
    }

    public void setTipLemn(String tipLemn) {
        this.tipLemn = tipLemn;
    }

    @Override
    public void canta() {
        System.out.println("Vioara " + getNume() + " (mărime " + marime + ", lemn " + tipLemn + ") cântă cu arcușul.");
    }

    @Override
    public void acordeaza() {
        System.out.println("Se acordează cele 4 corzi (Sol, Re, La, Mi) ale viorii " + getNume() + ".");
    }
}
