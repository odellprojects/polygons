package com.polygons.model.sub;

import com.polygons.model.base.Polygon;

public class Pentagon extends Polygon {

    private final double equalSides;

    public Pentagon(double equalSides) {
        super(5);
        this.equalSides = equalSides;
    }

    private double getFormula() {
        return 5 * (5 + 2 * Math.sqrt(5));
    }

    @Override
    public double getArea() {
        return .25 * Math.sqrt(getFormula()) * Math.pow(equalSides, 2);
    }

    @Override
    public double getHeight() {
        return equalSides * getFormula() / 2;
    }

    @Override
    public double getPerimeter() { return equalSides * 5; }

    @Override
    public String toString() { return "Pentagon"; }

}
