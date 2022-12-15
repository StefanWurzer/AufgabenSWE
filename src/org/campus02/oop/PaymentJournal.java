package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {
    private ArrayList<Payment> liste = new ArrayList<Payment>();

    public void add(Payment p){
        liste.add(p);
    }

    public double totalTransactionCosts(){
        double gesamtKosten = 0;
        for (int i = 0; i < liste.size(); i++) {
            gesamtKosten = gesamtKosten + liste.get(i).calcTransactionCosts();
        }
        return gesamtKosten;
    }

    //public HashMap<String,Double> getPaymentsPerCurrency(){

    //}

}

