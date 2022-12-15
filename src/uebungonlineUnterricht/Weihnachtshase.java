package uebungonlineUnterricht;

public class Weihnachtshase extends Hase{

    public Weihnachtshase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        //super.verteilen();
        System.out.println(name + " verteilt die Geschenke unter dem Christbaum" );
    }
}
