package com.polygons.model.base;

public abstract class Triangle extends Polygon {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super(3);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() { return sideA; }

    public double getSideB() { return sideB; }

    public double getSideC() { return sideC; }

    @Override
    public double getArea() {
        return sideB * .5 * getHeight();
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() { return "Triangle"; }

}
