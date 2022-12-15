public class Rezept {

    private String name;
    private int personen;
    private Zutat[] zutaten;

    public Rezept(String name, int personen, Zutat[] zutaten) {
        this.name = name;
        this.personen = personen;
        this.zutaten = zutaten;
    }

    public String getName() {
        return name;
    }

    public int getPersonen() {
        return personen;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    public void printRezept(){
        System.out.println(name + " " + personen);
        for (int i = 0; i < zutaten.length; i++) {
            System.out.print(zutaten[i].getName());
            System.out.print(zutaten[i].getMenge());

        }
    }
    public Rezept umrechnen(int personen){
        double a = personen/(getPersonen()*1.0);
        Zutat[] neueZutaten = new Zutat[this.zutaten.length];
        for (int i = 0; i < zutaten.length; i++) {
            neueZutaten[i] = new Zutat(this.zutaten[i].getName(),(int) (this.zutaten[i].getMenge()*a));


        }
        Rezept neu = new Rezept(this.name, personen, neueZutaten);
        return neu;
    }

}
