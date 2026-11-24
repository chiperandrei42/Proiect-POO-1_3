package instrumente.task2;

public class Main {
    public static void main(String[] args) {
        // Constructor fără argumente
        Vioara vioaraImplicita = new Vioara();
        Tobe tobeImplicite = new Tobe();

        // Constructor cu toate argumentele
        Vioara vioara = new Vioara(
                "Stradivarius Model", "Stentor", 1800.0, 2023, "Maro lucios", "Nou",
                "4/4", "Molid și arțar", 4, true, "Ulei"
        );
        Tobe tobe = new Tobe(
                "Export Series", "Pearl", 4200.0, 2022, "Negru", "Nou",
                5, true, "Acustice", "Mylar", true
        );

        // Constructor de copiere + modificare prin setteri
        Vioara copieVioara = new Vioara(vioara);
        copieVioara.setPret(1650.0);
        copieVioara.setStare("Resigilat");

        Tobe copieTobe = new Tobe(tobe);
        copieTobe.setNumarTobe(6);

        System.out.println("=== Afișare caracteristici (toString) ===");
        System.out.println(vioaraImplicita);
        System.out.println(vioara);
        System.out.println("Copie modificată: " + copieVioara);
        System.out.println();
        System.out.println(tobeImplicite);
        System.out.println(tobe);
        System.out.println("Copie modificată: " + copieTobe);

        System.out.println("\n=== Metode din interfață ===");
        vioara.acordeaza();
        vioara.canta();
        tobe.acordeaza();
        tobe.canta();
    }
}
