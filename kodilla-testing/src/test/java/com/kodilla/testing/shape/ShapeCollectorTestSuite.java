package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
        public void testAddFigure()  {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> list = new ArrayList<>();
        list.add(new Circle("Circle", 10));
        list.add(new Triangle("Triangle", 12));
        list.add(new Square("Square", 14));
        //When
        Shape result = shapeCollector.addFigure(new Triangle("Triangle", 12));
        //Then
        Assert.assertEquals("Triangle", result);
    }

    @Test
        public void testRemoveFigure()   {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> list = new ArrayList<>();
        list.add(new Triangle("Triangle", 12));
        list.add(new Square("Square", 14));
        list.add(new Circle("Circle", 15));
        //When
        shapeCollector.addFigure(new Square("Square", 14));
        String result = shapeCollector.removeFigure(new Square("Square", 14));
        //Then
        Assert.assertFalse(list.contains("Square"));
        Assert.assertEquals("Square", result);
    }

    @Test
        public void testGetFigure()    {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> list = new ArrayList<>();
        list.add(new Triangle("Triangle", 12));
        list.add(new Square("Square", 14));
        list.add(new Circle("Circle", 15));
        //When
        shapeCollector.addFigure(new Triangle ("Triangle", 12));
        shapeCollector.getFigure(1);
        //Then
        Assert.assertEquals(1, list.size());
        Assert.assertFalse(list.contains(4));
        Assert.assertTrue(list.contains(0));
    }

    @Test
        public void testShowFigures()   {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> list = new ArrayList<>();
        list.add(new Triangle("Triangle", 12));
        list.add(new Square("Square", 14));
        list.add(new Circle("Circle", 15));
        //When
        shapeCollector.showFigures();
        //Then
        Assert.assertTrue("Circle", false);

    }
}
