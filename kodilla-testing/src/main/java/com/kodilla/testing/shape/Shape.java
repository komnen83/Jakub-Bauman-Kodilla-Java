package com.kodilla.testing.shape;

interface Shape {

    String getShapeName();
    int getField();
}

class Square implements Shape   {
    private String shapeName;
    private int field;

    public Square(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getField() {
        return field;
    }

}

class Triangle implements Shape {
    private String shapeName;
    private int field;

    public Triangle(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getField() {
        return field;
    }
}

class Circle implements Shape {
    private String shapeName;
    private int field;

    public Circle(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getField() {
        return field;
    }
}