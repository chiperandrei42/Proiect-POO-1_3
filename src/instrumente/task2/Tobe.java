package instrumente.task2;

public class Tobe extends InstrumentMuzical {
    private int numarTobe;
    private boolean includeCinele;
    private String tipTobe;
    private String materialFete;
    private boolean includeScaun;

    public Tobe() {
        super();
        this.numarTobe = 5;
        this.includeCinele = true;
        this.tipTobe = "Acustice";
        this.materialFete = "Mylar";
        this.includeScaun = true;
    }

    public Tobe(String nume, String producator, double pret,
                int anFabricatie, String culoare, String stare,
                int numarTobe, boolean includeCinele, String tipTobe,
                String materialFete, boolean includeScaun) {
        super(nume, producator, pret, anFabricatie, culoare, stare);
        this.numarTobe = numarTobe;
        this.includeCinele = includeCinele;
        this.tipTobe = tipTobe;
        this.materialFete = materialFete;
        this.includeScaun = includeScaun;
    }

    public Tobe(Tobe other) {
        super(other);
        this.numarTobe = other.numarTobe;
        this.includeCinele = other.includeCinele;
        this.tipTobe = other.tipTobe;
        this.materialFete = other.materialFete;
        this.includeScaun = other.includeScaun;
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

    public String getTipTobe() {
        return tipTobe;
    }

    public void setTipTobe(String tipTobe) {
        this.tipTobe = tipTobe;
    }

    public String getMaterialFete() {
        return materialFete;
    }

    public void setMaterialFete(String materialFete) {
        this.materialFete = materialFete;
    }

    public boolean isIncludeScaun() {
        return includeScaun;
    }

    public void setIncludeScaun(boolean includeScaun) {
        this.includeScaun = includeScaun;
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

    @Override
    public String toString() {
        return "Tobe {" + super.toString() +
                ", numarTobe=" + numarTobe +
                ", includeCinele=" + includeCinele +
                ", tipTobe='" + tipTobe + '\'' +
                ", materialFete='" + materialFete + '\'' +
                ", includeScaun=" + includeScaun +
                '}';
    }
}
