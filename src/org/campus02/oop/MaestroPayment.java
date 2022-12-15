package org.campus02.oop;

public class MaestroPayment extends Payment{
    private String cardNumber;

    public MaestroPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    public double calcTransactionCosts(){
        double kosten;
        kosten = exchangeToEUR()*0.75*0.01;
        if(kosten < 0.95){
            kosten = 0.95;
            return kosten;
        }
        else {
            return kosten;
        }
    }

    @Override
    public String toString() {
        return "MaestroPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                "amount='" + getAmount() + '\'' +
                "currency='" + getCurrency() + '\'' +
                "transaction costs='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
