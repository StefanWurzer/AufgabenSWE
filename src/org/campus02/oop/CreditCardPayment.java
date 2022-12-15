package org.campus02.oop;

public class CreditCardPayment extends Payment{
    private String cardNumber;
    private String securityCode;

    public CreditCardPayment(String cardNumber, String securityCode, double amount, String currency) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
    }

    @Override
    public double calcTransactionCosts() {
        double kosten = 0;
        if(getCurrency()!="EUR"){
            kosten = 1.5 + exchangeToEUR()*0.0275;
            return kosten;
        }
        else {
            kosten = 0.5 * exchangeToEUR()*1.1;
            return kosten;
        }
    }

    @Override
    public String toString() {
        return "CreditCardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", securityCode='" + securityCode + '\'' +
                ", Amount='" + exchangeToEUR() + '\''+
                ", Currency='" + getCurrency() + '\''+
                ", Transaction costs='" + getAmount() + '\''+
                '}';

    }
}
