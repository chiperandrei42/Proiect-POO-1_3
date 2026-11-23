class InstrumentMuzical {
    protected String nume;
    protected double pret;
    private String brand;
    private double greutate;
    private boolean esteAcoustic;

    public InstrumentMuzical(){
        this.nume="Necunoscut";
        this.pret=0.0;
        this.brand="Generic";
        this.greutate=0.0;
        this.esteAcoustic=false;
    }

    public InstrumentMuzical (String nume, double pret, String brand, double greutate, boolean esteAcoustic){
        this.nume=nume;
        this.pret=pret;
        this.brand=brand;
        this.greutate=greutate;
        this.esteAcoustic=esteAcoustic;
    }

    public InstrumentMuzical(InstrumentMuzical altul){
        this.nume=altul.nume;
        this.pret=altul.pret;
        this.brand= altul.brand;
        this.greutate= altul.greutate;
        this.esteAcoustic=altul.esteAcoustic;
    }

    public  String getNume(){
        return nume;
    }

    public void setNume (String nume){
        this.nume=nume;
    }

    public double getPret(){
        return pret;
    }

    public void setPret(double pret){
        this.pret=pret;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public double getGreutate(){
        return greutate;
    }

    public void setGreutate(double greutate){
        this.greutate=greutate;
    }

    public boolean isEsteAcoustic(){
        return esteAcoustic;
    }

    public void setEsteAcoustic(boolean esteAcoustic){
        this.esteAcoustic=esteAcoustic;
    }

    @Override
    public String toString(){
        return "Nume: " + nume +
                ", Brand: " + brand +
                ", Pret: " + pret + " RON" +
                ", Greutate: " + greutate + " kg" +
                ", Acustic: " + esteAcoustic;
    }
}
