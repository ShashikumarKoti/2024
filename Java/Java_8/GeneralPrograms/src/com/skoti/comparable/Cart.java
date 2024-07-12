package com.skoti.comparable;

public class Cart implements Comparable<Cart>{

    private String item;
    private double price;

    public Cart(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Cart cart) {
        return Double.compare(this.price, cart.getPrice());
    }

}
