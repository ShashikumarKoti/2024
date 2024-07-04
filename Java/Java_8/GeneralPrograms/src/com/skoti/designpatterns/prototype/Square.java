package com.skoti.designpatterns.prototype;

public class Square implements Shape{

    private String color;

    Square(String color) {
        this.color = color;
    }
    @Override
    public Shape clone() {
        return new Square(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " square");
    }
}
