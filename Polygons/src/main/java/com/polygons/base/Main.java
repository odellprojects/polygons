package com.polygons.base;

import com.polygons.controller.Controller;
import com.polygons.model.sub.*;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.processPolygon(new Scalene(34, 83, 64));
    }
}
