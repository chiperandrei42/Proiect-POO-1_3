class Saxofon extends InstrumentMuzical implements Instrument {
    private String tip;
    public Saxofon(String nume, double pret, String tip) {
        super(nume, pret);
        this.tip = tip;
    }
    @Override
    public void canta() {
        System.out.println("Saxofonul " + tip + " canta o melodie de jazz.");
    }
    @Override
    public void acordeaza() {
        System.out.println("Se acordeaza saxofonul regland mustiucul.");
    }
}