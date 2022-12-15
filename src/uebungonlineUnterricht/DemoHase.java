package uebungonlineUnterricht;

public class DemoHase {
    public static void main(String[] args) {
        Hase a = new Hase("Bert");
        Hase b = new Osterhase("Bert");
        Hase c = new Weihnachtshase("Bert");

        a.verteilen();
        b.verteilen();
        c.verteilen();

        Hasenstall hoppelwiese = new Hasenstall();
        hoppelwiese.add(a);
        hoppelwiese.add(b);
        hoppelwiese.add(c);

    }

}
