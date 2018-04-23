//package com.kodilla.testing.shape;
//
//import org.junit.*;
//import sun.security.provider.SHA;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ShapeCollectorTestSuite {
//    private static int testCounter = 0;
//
//    @BeforeClass
//    public static void beforeAllTests() {
//        System.out.println("This is the beginning of tests.");
//    }
//
//    @AfterClass
//    public static void afterAllTests() {
//        System.out.println("All tests are finished.");
//    }
//
//    @Before
//    public void beforeEveryTest() {
//        testCounter++;
//        System.out.println("Preparing to execute test #" + testCounter);
//    }
//
//    @Test
//    public void testAddFigure()  {
//        //Given
//        ShapeCollector shapeCollector = new ShapeCollector();
//        //When
//        Shape result = shapeCollector.addFigure(new Triangle("Triangle", 15));
//        //Then
//        Assert.assertEquals(1, result);
//    }
//
//    @Test
//        public void testRemoveFigure()   {
//        //Given
//        ShapeCollector shapeCollector = new ShapeCollector();
//        Square square = new Square("asdf", 10);
//        //When
//        shapeCollector.addFigure(square);
//        ArrayList<Shape> result = shapeCollector.removeFigure(square);
//        //Then
//        Assert.assertEquals(0, result);
//    }
//
//    @Test
//        public void testGetFigure()    {
//        //Given
//        ShapeCollector shapeCollector = new ShapeCollector();
//        List<ShapeCollector> shapes = new ArrayList<>();
//        shapes shape1 = shapes.add(new Triangle("asdf", 15));
//        shapes shape2 = shapes.add(new Square("asdf", 10));
//
//        //When
//        shapeCollector.addFigure(new Triangle ("Triangle", 12));
//        shapeCollector.getFigure(1);
//        //Then
//        Assert.assertEquals(1, shapes.size());
//    }
//
//    @Test
//        public void testShowFigures()   {
//        //Given
//        ShapeCollector shapeCollector = new ShapeCollector();
//        ArrayList<Shape> list = new ArrayList<>();
//        list.add(new Triangle("Triangle", 12));
//        list.add(new Square("Square", 14));
//        list.add(new Circle("Circle", 15));
//        //When
//        shapeCollector.showFigures();
//        //Then
//        Assert.assertTrue("Circle", false);
//
//    }
//}
