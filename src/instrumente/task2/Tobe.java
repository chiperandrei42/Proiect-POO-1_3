package instrumente.task2;

public class Tobe extends InstrumentMuzical {
    private int numarTobe;
    private boolean includeCinele;

    public Tobe() {
        super();
        this.numarTobe = 5;
        this.includeCinele = true;
    }

    public Tobe(String nume, String producator, double pret, int numarTobe, boolean includeCinele) {
        super(nume, producator, pret);
        this.numarTobe = numarTobe;
        this.includeCinele = includeCinele;
    }

    public int getNumarTobe() {
        return numarTobe;
    }

    public void setNumarTobe(int numarTobe) {
        this.numarTobe = numarTobe;
    }

    public boolean isIncludeCinele() {
        return includeCinele;
    }

    public void setIncludeCinele(boolean includeCinele) {
        this.includeCinele = includeCinele;
    }

    @Override
    public void canta() {
        System.out.println("Setul de tobe " + getNume() + " (" + numarTobe + " piese"
                + (includeCinele ? ", cu cinele" : ", fără cinele") + ") ține ritmul.");
    }

    @Override
    public void acordeaza() {
        System.out.println("Se acordează fețele celor " + numarTobe + " tobe ale setului " + getNume() + ".");
    }
}
