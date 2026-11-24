class Contrabas extends InstrumentMuzical implements Instrument {
    private int numarCorzi;
    private String tipLemn;
    private boolean areArcus;
    private double inaltime;
    private String marime;


    public Contrabas() {
        super();
        this.numarCorzi = 4;
        this.tipLemn = "Molid";
        this.areArcus = true;
        this.inaltime = 1.80;
        this.marime = "3/4";
    }


    public Contrabas(String nume, double pret, String brand, double greutate, boolean esteAcoustic,
                     int numarCorzi, String tipLemn, boolean areArcus, double inaltime, String marime) {
        super(nume, pret, brand, greutate, esteAcoustic);
        this.numarCorzi = numarCorzi;
        this.tipLemn = tipLemn;
        this.areArcus = areArcus;
        this.inaltime = inaltime;
        this.marime = marime;
    }

    public Contrabas(Contrabas altul) {
        super(altul);
        this.numarCorzi = altul.numarCorzi;
        this.tipLemn = altul.tipLemn;
        this.areArcus = altul.areArcus;
        this.inaltime = altul.inaltime;
        this.marime = altul.marime;
    }


    public int getNumarCorzi() {
        return numarCorzi;
    }

    public void setNumarCorzi(int numarCorzi) {
        this.numarCorzi = numarCorzi;
    }

    public String getTipLemn() {
        return tipLemn;
    }

    public void setTipLemn(String tipLemn) {
        this.tipLemn = tipLemn;
    }

    public boolean isAreArcus() {
        return areArcus;
    }

    public void setAreArcus(boolean areArcus) {
        this.areArcus = areArcus;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }

    @Override
    public void canta() {
        System.out.println("Contrabasul canta note grave.");
    }

    @Override
    public void acordeaza() {
        System.out.println("Se acordeaza contrabasul.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Corzi: " + numarCorzi + ", Lemn: " + tipLemn +
                ", Arcus: " + areArcus + ", Inaltime: " + inaltime + ", Marime: " + marime;
    }
}