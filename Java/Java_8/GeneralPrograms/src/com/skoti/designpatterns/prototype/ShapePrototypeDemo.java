package com.skoti.designpatterns.prototype;

public class ShapePrototypeDemo {

    public static void main(String[] args) {

        Shape circlePrototype = new Circle("red");

        ShapeClient shapeClient = new ShapeClient(circlePrototype);
        Shape redCircle = shapeClient.createShape();
        redCircle.draw();

        Shape squarePrototype = new Square("blue");
        ShapeClient shapeClient2 = new ShapeClient(squarePrototype);
        Shape blueSquare = shapeClient2.createShape();
        blueSquare.draw();

    }
}
