package org.campus02.oop;

public class DemoPayment {
    public static void main(String[] args) {
        CashPayment c1 = new CashPayment(150.00, "SEK");
        MaestroPayment m1 = new MaestroPayment(1200000.23,"HUF","1005 5002 3375");
        CreditCardPayment x1 = new CreditCardPayment("100 003 217","371",2000,"EUR");

        //System.out.println(c1.toString());
        //System.out.println(m1.toString());

        PaymentJournal p1 = new PaymentJournal();
        p1.add(c1);
        p1.add(m1);
        p1.add(x1);
        System.out.println(p1.totalTransactionCosts());



    }




}
