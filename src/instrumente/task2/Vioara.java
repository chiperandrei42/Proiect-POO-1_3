package instrumente;

public class Vioara extends InstrumentMuzical {
    private String marime;
    private String tipLemn;
    private int numarCorzi;
    private boolean areArcusInclus;
    private String tipLac;

    public Vioara() {
        super();
        this.marime = "4/4";
        this.tipLemn = "Molid și arțar";
        this.numarCorzi = 4;
        this.areArcusInclus = true;
        this.tipLac = "Ulei";
    }

    public Vioara(String nume, String producator, double pret,
                  int anFabricatie, String culoare, String stare,
                  String marime, String tipLemn, int numarCorzi,
                  boolean areArcusInclus, String tipLac) {
        super(nume, producator, pret, anFabricatie, culoare, stare);
        this.marime = marime;
        this.tipLemn = tipLemn;
        this.numarCorzi = numarCorzi;
        this.areArcusInclus = areArcusInclus;
        this.tipLac = tipLac;
    }

    public Vioara(Vioara other) {
        super(other);
        this.marime = other.marime;
        this.tipLemn = other.tipLemn;
        this.numarCorzi = other.numarCorzi;
        this.areArcusInclus = other.areArcusInclus;
        this.tipLac = other.tipLac;
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

    public int getNumarCorzi() {
        return numarCorzi;
    }

    public void setNumarCorzi(int numarCorzi) {
        this.numarCorzi = numarCorzi;
    }

    public boolean isAreArcusInclus() {
        return areArcusInclus;
    }

    public void setAreArcusInclus(boolean areArcusInclus) {
        this.areArcusInclus = areArcusInclus;
    }

    public String getTipLac() {
        return tipLac;
    }

    public void setTipLac(String tipLac) {
        this.tipLac = tipLac;
    }

    @Override
    public void canta() {
        System.out.println("Vioara " + getNume() + " (mărime " + marime + ", lemn " + tipLemn + ") cântă cu arcușul.");
    }

    @Override
    public void acordeaza() {
        System.out.println("Se acordează cele " + numarCorzi + " corzi ale viorii " + getNume() + ".");
    }

    @Override
    public String toString() {
        return "Vioara {" + super.toString() +
                ", marime='" + marime + '\'' +
                ", tipLemn='" + tipLemn + '\'' +
                ", numarCorzi=" + numarCorzi +
                ", areArcusInclus=" + areArcusInclus +
                ", tipLac='" + tipLac + '\'' +
                '}';
    }
}
