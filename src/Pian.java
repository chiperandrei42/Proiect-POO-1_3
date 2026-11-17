public class Pian extends InstrumentMuzical implements Instrument{
    private int numarClape;

    public Pian(String nume, double pret, int numarClape){
        super(nume, pret);
        this.numarClape = numarClape;
    }

    @Override
    public void canta(){
        System.out.println("Pianul " + nume + " canta avand " + numarClape + " clape."):
    }

    @Override
    public void acordeaza(){
        System.out.println(("Pianul " + nume + " se acordeaza.");
    }
}
