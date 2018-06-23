package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "Shopping task";
    public static final String PAINTING_TASK = "Painting task";
    public static final String DRIVING_TASK = "Driving task";

    public final Task makeShape(final String classTask) {
        switch(classTask) {
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping", "T-Shirts", 20);
            case PAINTING_TASK:
                return new PaintingTask("Painting", "Green", "Cow");
            case DRIVING_TASK:
                return new DrivingTask("Driving", "San Fransisco", "Jetpack");
            default:
                return null;
        }
    }
}
