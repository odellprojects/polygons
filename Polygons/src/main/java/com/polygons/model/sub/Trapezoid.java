package com.polygons.model.sub;

import com.polygons.model.base.Quadrilateral;

public class Trapezoid extends Quadrilateral {

    private final int angle;

    public Trapezoid(double sideA, double sideB, double sideC,
                     double sideD, int angle) {
        super(sideA, sideB, sideC, sideD);
        this.angle = angle;
    }

    @Override
    public double getHeight() {
        return getSideC() * Math.sin(Math.toRadians(angle));
    }

    @Override
    public double getArea() {
        return .5 * (getSideA() + getSideC() * getHeight());
    }

    @Override
    public double getPerimeter() {
        return getSideA() + getSideB() + getSideC() + getSideD();
    }

    @Override
    public String toString() { return "Trapezoid"; }

}
