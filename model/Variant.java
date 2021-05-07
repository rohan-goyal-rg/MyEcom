package model;

public class Variant {
    String quantity;
    float price;

    //parameterized constructor
    public Variant(String quantity, float price) {
        this.quantity = quantity;
        this.price = price;
    }

    //Overrides toString() method
    @Override
    public String toString() {
        return String.format("%s @ Rs. %.2f",quantity,price);
    }
}
