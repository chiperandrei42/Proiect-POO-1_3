class Chitara extends InstrumentMuzical implements Instrument{
       private int numarCorzi;
       private String tipLemn;
       private boolean areDoza;
       private double lungimeScala;
       private String culoare;

       public Chitara(){
           super();
           this.numarCorzi=6;
           this.tipLemn="Molid";
           this.areDoza=false;
           this.lungimeScala=648.0;
           this.culoare="Natural";
       }

       public Chitara(String nume, double pret, String brand, double greutate, boolean esteAcustic, int numarCorzi, String tipLemn, boolean areDoza, double lungimeScala, String culoare){
           super(nume, pret, brand, greutate, esteAcustic);
           this.numarCorzi=numarCorzi;
           this.areDoza=areDoza;
           this.tipLemn=tipLemn;
           this.lungimeScala=lungimeScala;
           this.culoare=culoare;
       }

       public Chitara(Chitara altaChitara){
           super(altaChitara);
           this.numarCorzi=altaChitara.numarCorzi;
           this.tipLemn=altaChitara.tipLemn;
           this.areDoza=altaChitara.areDoza;
           this.lungimeScala=altaChitara.lungimeScala;
           this.culoare=altaChitara.culoare;
       }

    public int getNumarCorzi() {
        return numarCorzi;
    }
    public void setNumarCorzi(int numarCorzi) {
        this.numarCorzi = numarCorzi;
    }
    public String getTipLemn() {
        return tipLemn;
    }
    public void setTipLemn(String tipLemn) {
        this.tipLemn = tipLemn;
    }
    public boolean isAreDoza() {
        return areDoza;
    }
    public void setAreDoza(boolean areDoza) {
        this.areDoza = areDoza;
    }
    public double getLungimeScala() {
        return lungimeScala;
    }
    public void setLungimeScala(double lungimeScala) {
        this.lungimeScala = lungimeScala;
    }
    public String getCuloare() {
        return culoare;
    }
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

       @Override
    public void canta(){
           System.out.println("Chitara " + getNume() + " canta la " + numarCorzi + " corzi.");
       }
       @Override
    public void acordeaza(){
           System.out.println("Chitara " + getNume() + " se acordeaza.");
       }
       @Override
    public String toString(){
           return super.toString()+
                   ", Corzi: " + numarCorzi +
                   ", Lemn: " + tipLemn +
                   ", Are Doza: " + areDoza +
                   ", Scala: " + lungimeScala + " mm" +
                   ", Culoare: " + culoare;
       }
}
