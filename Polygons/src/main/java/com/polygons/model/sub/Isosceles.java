package com.polygons.model.sub;

import com.polygons.model.base.Triangle;

public class Isosceles extends Triangle {

    public Isosceles(double sideA, double sideB) {
        super(sideA, sideB, sideA);
    }

    @Override
    public double getHeight() {
        return Math.sqrt(Math.pow(getSideA(), 2) - Math.pow(getSideB(), 2) / 4);
    }

    @Override
    public String toString() {
        return "Isosceles Triangle";
    }
}
