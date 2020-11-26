package com.netit;

import com.netit.shapes.shapes_procedurial.Geometry;
import com.netit.shapes.shapes_procedurial.NoSuchShapeException;
import com.netit.shapes.shapes_procedurial.Rectangle;

public class Main {

    public static void main(String[] args) {
        testProcedurialGeometry();
        testOopGeometry();
    }

    private static void testOopGeometry() {
        com.netit.shapes.oop.Rectangle rectangle = new com.netit.shapes.oop.Rectangle(5, 4);
        System.out.println(rectangle.area());
    }

    private static void testProcedurialGeometry() {
        Geometry geometry = new Geometry();
        Rectangle rectangle = new Rectangle();
        rectangle.height = 5;
        rectangle.width = 4;
        try {
            System.out.println(geometry.area(rectangle));
        } catch (NoSuchShapeException e) {
            System.out.println("No such shape.");
        }
    }
}
