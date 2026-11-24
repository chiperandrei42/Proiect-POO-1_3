class Saxofon extends InstrumentMuzical implements Instrument {
    private String tip;
    private String material;
    private int numarClape;
    private boolean areCutie;
    private String culoare;


    public Saxofon() {
        super();
        this.tip = "Alto";
        this.material = "Alama";
        this.numarClape = 23;
        this.areCutie = true;
        this.culoare = "Auriu";
    }


    public Saxofon(String nume, double pret, String brand, double greutate, boolean esteAcoustic,
                   String tip, String material, int numarClape, boolean areCutie, String culoare) {
        super(nume, pret, brand, greutate, esteAcoustic);
        this.tip = tip;
        this.material = material;
        this.numarClape = numarClape;
        this.areCutie = areCutie;
        this.culoare = culoare;
    }


    public Saxofon(Saxofon altul) {
        super(altul);
        this.tip = altul.tip;
        this.material = altul.material;
        this.numarClape = altul.numarClape;
        this.areCutie = altul.areCutie;
        this.culoare = altul.culoare;
    }


    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumarClape() {
        return numarClape;
    }

    public void setNumarClape(int numarClape) {
        this.numarClape = numarClape;
    }

    public boolean isAreCutie() {
        return areCutie;
    }

    public void setAreCutie(boolean areCutie) {
        this.areCutie = areCutie;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }


    @Override
    public void canta() {
        System.out.println("Saxofonul " + tip + " canta jazz.");
    }

    @Override
    public void acordeaza() {
        System.out.println("Se acordeaza saxofonul.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Tip: " + tip + ", Material: " + material +
                ", Clape: " + numarClape + ", Cutie: " + areCutie + ", Culoare: " + culoare;
    }
}