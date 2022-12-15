package uebungonlineUnterricht;

import java.util.ArrayList;

public class Customer extends Person{
    private int customerNumber;
    private ArrayList<Address> addresses = new ArrayList<>();

    public Customer(int customerNumber) {
        super("Susi","Sorglos");
        this.customerNumber = customerNumber;
    }

    public void add(Address address) {
        addresses.add(address);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", firstname=" + firstname +
                ", lastname=" + lastname +
                ", addresses=" + addresses +
                '}';
    }
}