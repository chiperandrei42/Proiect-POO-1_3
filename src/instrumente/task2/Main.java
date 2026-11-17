package instrumente;

public class Main {
    public static void main(String[] args) {
        InstrumentMuzical vioara = new Vioara("Stradivarius Model", "Stentor", 1800.0, "4/4", "Molid și arțar");
        InstrumentMuzical tobe = new Tobe("Export Series", "Pearl", 4200.0, 5, true);

        vioara.acordeaza();
        vioara.canta();

        System.out.println();

        tobe.acordeaza();
        tobe.canta();
    }
}
