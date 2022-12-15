package uebungonlineUnterricht;

import java.util.ArrayList;

public class Hasenstall {
    private ArrayList<Hase> stall = new ArrayList<>();


    public void add(Hase h){
        stall.add(h);
    }

    public void fuettern(){
        for(Hase h : stall){
            h.fressen();
        }
    }

    public void verteilen(){
        for(Hase h : stall){
            h.verteilen();
        }
    }
}
