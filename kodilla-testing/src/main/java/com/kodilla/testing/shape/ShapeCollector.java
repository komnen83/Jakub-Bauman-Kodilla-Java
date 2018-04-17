package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<>();


    public Shape addFigure(Shape shape) {
        shapes.add(new Triangle("Triangle", 12));
        return shape;
    }


    public String removeFigure(Shape shape)   {
        return null;
    }

    public void getFigure(int n)    {

    }

    public void showFigures()   {

    }
}
