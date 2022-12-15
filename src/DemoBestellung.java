public class DemoBestellung {
    public static void main(String[] args) {
        Bestellzeile bestellung1 = new Bestellzeile("Pizza",10, 10);
        Bestellzeile bestellung2 = new Bestellzeile("Spaghetti",10, 10);
        Bestellzeile bestellung3 = new Bestellzeile("Schnitzel",10, 10);

        Bestellzeile[] zeilen = {bestellung1,bestellung2,bestellung3};
        Bestellung bestellungGruppe = new Bestellung("Bestellung 001",zeilen);

        bestellungGruppe.printBestellung();

        double a = bestellungGruppe.getKosten();
        System.out.println(a);


    }



}
