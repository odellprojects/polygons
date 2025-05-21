package com.polygons.model.base;

public abstract class Quadrilateral extends Polygon {

    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double sideD;

    public Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
        super(4);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public double getSideA() { return sideA; }

    public double getSideB() { return sideB; }

    public double getSideC() { return sideC; }

    public double getSideD() { return sideD; }

    @Override
    public double getHeight() { return sideB; }

    @Override
    public double getArea() { return sideA * sideB; }

    @Override
    public String toString() { return "Quadrilateral"; }

}
