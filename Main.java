public class Main {
    public static void main(String[] args) {

        Saxofon sax = new Saxofon("Yamaha", 3500, "Alto");
        Contrabas contra = new Contrabas("Hora", 2800, 4);

        sax.afiseazaDetalii();
        sax.acordeaza();
        sax.canta();
        System.out.println(); // linie goala
        contra.afiseazaDetalii();
        contra.acordeaza();
        contra.canta();
    }
}