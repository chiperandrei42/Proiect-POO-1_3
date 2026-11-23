public class Main {
    public static void main (String[] args){
        System.out.println("================ 1. TESTARE CHITARA ================");
        // Constructor fara argumente
        Chitara c1 = new Chitara();
        System.out.println("Chitara default:\n" + c1);
        // Constructor cu toate argumentele
        Chitara c2 = new Chitara("Stratocaster", 4200.0, "Fender", 3.6, false,
                6, "Artar", true, 648.0, "Sunburst");
        System.out.println("\nChitara completa:\n" + c2);
        // Constructor de copiere
        Chitara c3 = new Chitara(c2);
        c3.setPret(3950.0); // Modificare prin setter
        System.out.println("\nCopie chitara modificata (Pret nou: " + c3.getPret() + "):\n" + c3);
        // Metode din interfata
        c2.canta();
        c2.acordeaza();
        System.out.println("\n================ 2. TESTARE PIAN ================");
        // Constructor fara argumente
        Pian p1 = new Pian();
        System.out.println("Pian default:\n" + p1);
        // Constructor cu toate argumentele
        Pian p2 = new Pian("U1", 28000.0, "Yamaha", 228.0, true,
                88, 3, "Vertical", true, 256);
        System.out.println("\nPian complet:\n" + p2);
        // Constructor de copiere
        Pian p3 = new Pian(p2);
        p3.setPret(27000.0);
        System.out.println("\nCopie pian modificata (Pret nou: " + p3.getPret() + "):\n" + p3);
        // Metode din interfata
        p2.canta();
        p2.acordeaza();
    }
}
