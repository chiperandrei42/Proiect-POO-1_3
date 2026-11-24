public class Main {
    public static void main(String[] args) {

        InstrumentMuzical i1 = new InstrumentMuzical();
        InstrumentMuzical i2 = new InstrumentMuzical("Instrument Acustic", 1200.0, "Yamaha", 2.5, true);
        InstrumentMuzical i3 = new InstrumentMuzical(i2);
        i3.setNume("Instrument Clasic");

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        System.out.println();


        Saxofon s1 = new Saxofon();
        Saxofon s2 = new Saxofon("YAS-280", 4500.0, "Yamaha", 3.2, false, "Alto", "Alama", 23, true, "Auriu");
        Saxofon s3 = new Saxofon(s2);
        s3.setTip("Tenor");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        s2.canta();
        s2.acordeaza();

        System.out.println();


        Contrabas c1 = new Contrabas();
        Contrabas c2 = new Contrabas("Master", 3800.0, "Hora", 11.0, true, 4, "Molid", true, 1.85, "3/4");
        Contrabas c3 = new Contrabas(c2);
        c3.setNumarCorzi(5);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        c2.canta();
        c2.acordeaza();
    }
}