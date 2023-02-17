package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private final List<Shape> shapeCollector = new ArrayList<>();

    public List<Shape> getShapeCollector() {
        return shapeCollector;
    }

    public void addFigure (Shape shape) {
        shapeCollector.add(shape);
    }
    public boolean removeShape (Shape shape) {
        return shapeCollector.remove(shape);
    }
    public Shape getFigure (int n) {
        if (n< shapeCollector.size() && n >=0) {
            return shapeCollector.get(n);
        } else {
            return null;
        }
    }
    public String showFigures(Shape shape) {
        return "Shape name: " + shape.getShapeName() + " field: " + shape.getField();
    }
}
