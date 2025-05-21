package com.polygons.controller;

import com.polygons.model.base.Polygon;

public class Controller {

    private String precisionValue(double value) {
        return String.format("%.2f",  value);
    }

    public void processPolygon(Polygon polygon) {
        System.out.println("The height of this "+ polygon +
                " is " + precisionValue(polygon.getHeight()));
        System.out.println("The perimeter of this " + polygon +
                " is " + precisionValue(polygon.getPerimeter()));
        System.out.println("The area of this " + polygon +
                " is " + precisionValue(polygon.getArea()));
        System.out.println("The interior angle of this " + polygon +
                " is " + precisionValue(polygon.getInteriorAngle()));
    }

}
