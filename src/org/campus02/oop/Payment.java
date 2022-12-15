package org.campus02.oop;

public class Payment {
    private double amount;
    private String currency;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double calcTransactionCosts() {
        return amount;
    }

    public double exchangeToEUR() {

        switch (currency) {
            case "EUR":
                return amount;

            case "USD":
                amount = amount / 1.1;
                return amount;

            case "GPB":
                amount = amount / 0.85;
                return amount;

            case "SEK":
                amount = amount / 9.5;
                return amount;

            case "HUF":
                amount = amount / 310;
                return amount;

            default:
                amount = amount / 2;
                return amount;

        }
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
}


