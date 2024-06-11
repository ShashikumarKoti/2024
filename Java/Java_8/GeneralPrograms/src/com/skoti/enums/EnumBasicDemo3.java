package com.skoti.enums;

enum Beer {

    KF(70), OC(80), RC(90), FO;

    private int price;

    Beer(int price) {
        this.price = price;
    }

    Beer() {
        this.price = 60;   //for FO enum
    }

    public int getPrice() {
        return price;
    }
}

public class EnumBasicDemo3 {

    public static void main(String[] args) {

        Beer[] beerList = Beer.values();

        for (Beer beer : beerList) {
            System.out.println(beer + " and price is " + beer.getPrice());
        }
    }
}
