class InstrumentMuzical {
    protected String nume;
    protected double pret;

    public InstrumentMuzical(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }
    public void afiseazaDetalii() {
        System.out.println("Instrument: " + nume + ", Pret: " + pret + " lei");
    }
}
