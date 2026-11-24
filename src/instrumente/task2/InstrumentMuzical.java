package instrumente.task2;

public class InstrumentMuzical implements ActiuniInstrument {
    private String nume;
    private String producator;
    private double pret;
    private int anFabricatie;
    private String culoare;
    private String stare;

    public InstrumentMuzical() {
        this.nume = "Necunoscut";
        this.producator = "Necunoscut";
        this.pret = 0.0;
        this.anFabricatie = 2024;
        this.culoare = "Natural";
        this.stare = "Nou";
    }

    public InstrumentMuzical(String nume, String producator, double pret,
                             int anFabricatie, String culoare, String stare) {
        this.nume = nume;
        this.producator = producator;
        this.pret = pret;
        this.anFabricatie = anFabricatie;
        this.culoare = culoare;
        this.stare = stare;
    }

    public InstrumentMuzical(InstrumentMuzical other) {
        this.nume = other.nume;
        this.producator = other.producator;
        this.pret = other.pret;
        this.anFabricatie = other.anFabricatie;
        this.culoare = other.culoare;
        this.stare = other.stare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    @Override
    public void canta() {
        System.out.println("Instrumentul muzical " + nume + " produce un sunet.");
    }

    @Override
    public void acordeaza() {
        System.out.println("Se acordează instrumentul muzical " + nume + ".");
    }

    @Override
    public String toString() {
        return "nume='" + nume + '\'' +
                ", producator='" + producator + '\'' +
                ", pret=" + pret +
                ", anFabricatie=" + anFabricatie +
                ", culoare='" + culoare + '\'' +
                ", stare='" + stare + '\'';
    }
}
