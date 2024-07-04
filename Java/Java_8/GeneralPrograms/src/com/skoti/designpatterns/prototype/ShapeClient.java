package com.skoti.designpatterns.prototype;

public class ShapeClient {

    private Shape shapePrototype;

    ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    public Shape createShape() {
        return shapePrototype.clone();
    }
}
