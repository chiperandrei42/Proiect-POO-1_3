public class Pian extends InstrumentMuzical implements Instrument{
    private int numarClape;
    private int numarPedale;
    private String tipPian;
    private boolean areClapePonderate;
    private int polifonieMaxima;

    public Pian(){
        super();
        this.numarClape=88;
        this.numarPedale=3;
        this.tipPian="Vertical";
        this.areClapePonderate=true;
        this.polifonieMaxima=128;
    }

    public Pian(String nume, double pret, String brand, double greutate, boolean esteAcustic, int numarClape, int numarPedale, String tipPian, boolean areClapePonderate, int polifonieMaxima){
        super(nume, pret, brand, greutate, esteAcustic);
        this.numarClape = numarClape;
        this.numarPedale=numarPedale;
        this.tipPian=tipPian;
        this.areClapePonderate=areClapePonderate;
        this.polifonieMaxima=polifonieMaxima;
    }

    public Pian(Pian altPian){
        super(altPian);
        this.numarClape=altPian.numarClape;
        this.numarPedale=altPian.numarPedale;
        this.tipPian=altPian.tipPian;
        this.areClapePonderate=altPian.areClapePonderate;
        this.polifonieMaxima=altPian.polifonieMaxima;
    }

    public int getNumarClape() {
        return numarClape;
    }
    public void setNumarClape(int numarClape) {
        this.numarClape = numarClape;
    }
    public int getNumarPedale() {
        return numarPedale;
    }
    public void setNumarPedale(int numarPedale) {
        this.numarPedale = numarPedale;
    }
    public String getTipPian() {
        return tipPian;
    }
    public void setTipPian(String tipPian) {
        this.tipPian = tipPian;
    }
    public boolean isAreClapePonderate() {
        return areClapePonderate;
    }
    public void setAreClapePonderate(boolean areClapePonderate) {
        this.areClapePonderate = areClapePonderate;
    }
    public int getPolifonieMaxima() {
        return polifonieMaxima;
    }
    public void setPolifonieMaxima(int polifonieMaxima) {
        this.polifonieMaxima = polifonieMaxima;
    }

    @Override
    public void canta(){
        System.out.println("Pianul " + getNume() + " canta avand " + numarClape + " clape.");
    }

    @Override
    public void acordeaza(){
        System.out.println("Pianul " + getNume() + " se acordeaza.");
    }

    @Override
    public String toString(){
        return super.toString() +
                ", Clape: " + numarClape +
                ", Pedale: " + numarPedale +
                ", Tip: " + tipPian +
                ", Ponderat: " + areClapePonderate +
                ", Polifonie: " + polifonieMaxima;
    }
}
