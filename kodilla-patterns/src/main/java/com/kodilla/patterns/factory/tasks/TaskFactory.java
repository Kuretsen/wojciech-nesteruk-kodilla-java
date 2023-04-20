package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("Morning shopping task", "Bread", 1.5);
            case PAINTING -> new PaintingTask("Painting living room", "White", "Ceiling");
            case DRIVING -> new DrivingTask("Take kids to school", "Primary school number 100", "Car");
            default -> null;
        };
    }
}
