package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class shapeCollectorTestSuite {
    @Nested
    @DisplayName("Tests for adding figures")
    class TestAdding {
        @Test
        public void testAddFigureSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(8);
            //When
            shapeCollector.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeCollector().size());
        }
        @Test
        public void testAddFigureCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(5);
            //When
            shapeCollector.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeCollector().size());
        }
        @Test
        public void testAddFigureTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(4, 5, 6);
            //When
            shapeCollector.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeCollector().size());
        }
    }
    @Nested
    @DisplayName("Tests for removing figures")
    class TestRemoves {
        @Test
        public void testRemoveFigureSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(8);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeShape(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapeCollector().size());
        }
        @Test
        public void testRemoveFigureCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(5);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeShape(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapeCollector().size());
        }
        @Test
        public void testRemoveFigureTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(4, 5, 6);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeShape(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapeCollector().size());
        }
    }
    @Nested
    @DisplayName("Tests for getting figures")
    class TestGetFigures {
        @Test
        public void testGetFigureSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(8);
            shapeCollector.addFigure(shape);
            //When
            Shape getShape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, getShape);
        }
        @Test
        public void testGetFigureCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(5);
            shapeCollector.addFigure(shape);
            //When
            Shape getShape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, getShape);
        }
        @Test
        public void testGetFigureTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(4, 5, 6);
            shapeCollector.addFigure(shape);
            //When
            Shape getShape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, getShape);
        }
    }
    @Nested
    @DisplayName("Tests for showing figures")
    class TestShowFigures {
        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Square(8);
            Shape shape2 = new Circle(5);
            Shape shape3 = new Triangle(3, 4, 5);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            shapeCollector.addFigure(shape3);
            //When
            String showShape1 = shapeCollector.showFigures(shape1);
            String showShape2 = shapeCollector.showFigures(shape2);
            String showShape3 = shapeCollector.showFigures(shape3);
            String result1 = "Shape name: " + "Square" + " field: " + 64.0;
            String result2 = "Shape name: " + "Circle" + " field: " + (Math.PI * Math.pow(5, 2));
            String result3 = "Shape name: " + "Triangle" + " field: " + 6.0;
            //Then
            Assertions.assertEquals(showShape1, result1);
            Assertions.assertEquals(showShape2, result2);
            Assertions.assertEquals(showShape3, result3);
        }
    }
}