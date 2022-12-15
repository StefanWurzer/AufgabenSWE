package org.campus02.oop;

public class CashPayment extends Payment{

    private String name;

    public CashPayment(double amount, String currency) {
        super(amount, currency);
        this.name ="void";

    }

    public CashPayment(double amount, String currency, String name) {
        super(amount, currency);
        this.name = name;
    }

    public double calcTransactionCosts(){
        double kosten = 0;
        if(name =="void"){
            kosten = 2;
            return kosten;
        }
        else{
            kosten = 0;
            return kosten;
        }
    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "name='" + name + '\'' +
                "amount='" + getAmount()+ '\'' +
                "currency='" + getCurrency()+ '\'' +
                "transaction costs='" + calcTransactionCosts()+ '\'' +
                '}';
    }
}
