public class Bestellung {
    private String nummer;
    private Bestellzeile[] zeilen;

    public Bestellung(String nummer, Bestellzeile[] zeilen) {
        this.nummer = nummer;
        this.zeilen = zeilen;
    }

    public String getNummer() {
        return nummer;
    }

    public Bestellzeile[] getZeilen() {
        return zeilen;
    }

    public void printBestellung(){
        System.out.println(nummer);
        for (int i = 0; i < zeilen.length; i++) {
            System.out.print(" Name: "+zeilen[i].getName()+", menge: "+zeilen[i].getMenge()+", Preis: "+zeilen[i].getPreis());
            System.out.println();

        }
    }
    public double getKosten(){
        double  a = 0;
        for (int i = 0; i < zeilen.length; i++) {
            a = a + zeilen[i].getKosten();

        }
        return a;
    }

}
