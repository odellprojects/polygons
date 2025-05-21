package com.polygons.model.sub;

import com.polygons.model.base.Quadrilateral;

public class Square extends Quadrilateral {

    public Square(double sideLength) {
        super(sideLength, sideLength, sideLength, sideLength);
    }

    @Override
    public double getPerimeter() {
        return getNumberOfSides() * getSideA();
    }

    @Override
    public String toString() { return "Square"; }
}
