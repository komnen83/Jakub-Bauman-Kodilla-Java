package com.kodilla.testing.shape;

import org.junit.*;

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
        //When
        shapeCollector.addFigure(new Triangle("Triangle", 15));
        //Then
        Assert.assertEquals(1, shapeCollector.showFigures().size());
    }

    @Test
        public void testRemoveFigure()   {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("asdf", 10);
        //When
        shapeCollector.addFigure(square);
        shapeCollector.removeFigure(square);
        //Then
        Assert.assertEquals(0, shapeCollector.showFigures().size());
    }

    @Test
        public void testGetFigure()    {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Triangle("asdf", 15));
        shapeCollector.addFigure(new Square("rter", 10));
        //When
        Shape shape1 = shapeCollector.getFigure(0);
        Shape shape2 = shapeCollector.getFigure(1);
        //Then
        Assert.assertEquals(shape1, shapeCollector.showFigures().get(0));
        Assert.assertEquals(shape2, shapeCollector.showFigures().get(1));
    }
}
