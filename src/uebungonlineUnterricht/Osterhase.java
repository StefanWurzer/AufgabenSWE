package uebungonlineUnterricht;

public class Osterhase extends Hase{
    public Osterhase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        //super.verteilen();
        System.out.println(name + " versteckt Geschenke und Ostereier" );
    }
}


