package instrumente.task2;

public class InstrumentMuzical implements ActiuniInstrument {
    private String nume;
    private String producator;
    private double pret;

    public InstrumentMuzical() {
        this.nume = "Necunoscut";
        this.producator = "Necunoscut";
        this.pret = 0.0;
    }

    public InstrumentMuzical(String nume, String producator, double pret) {
        this.nume = nume;
        this.producator = producator;
        this.pret = pret;
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

    @Override
    public void canta() {
        System.out.println("Instrumentul muzical " + nume + " produce un sunet.");
    }

    @Override
    public void acordeaza() {
        System.out.println("Se acordează instrumentul muzical " + nume + ".");
    }
}
