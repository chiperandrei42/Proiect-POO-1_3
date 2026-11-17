package instrumente.task1;

class Chitara extends InstrumentMuzical implements Instrument{
       private int numarCorzi;

       public Chitara(String nume, double pret, int numarCorzi){
           super(nume, pret);
           this.numarCorzi=numarCorzi;
       }

       @Override
    public void canta(){
           System.out.println("Chitara " + nume + " canta la " + numarCorzi + " corzi.");
       }
       @Override
    public void acordeaza(){
           System.out.println("Chitara " + nume + " se acordeaza.");
       }
}
