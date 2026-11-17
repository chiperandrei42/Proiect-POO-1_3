package instrumente.task3;

class Contrabas extends InstrumentMuzical implements Instrument {
    private int numarCorzi;
    public Contrabas(String nume, double pret, int numarCorzi) {
        super(nume, pret);
        this.numarCorzi = numarCorzi;
    }
    @Override
    public void canta() {
        System.out.println("Contrabasul cu " + numarCorzi + " corzi canta note grave.");
    }
    @Override
    public void acordeaza() {
        System.out.println("Se invart cheile de acordaj pentru contrabas.");
    }
}
