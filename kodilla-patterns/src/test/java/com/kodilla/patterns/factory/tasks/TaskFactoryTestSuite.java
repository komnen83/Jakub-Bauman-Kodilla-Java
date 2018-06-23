package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeShape(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
        System.out.println(shoppingTask);
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeShape(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals("Painting", paintingTask.getTaskName());
        System.out.println(paintingTask);
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeShape(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals("Driving", drivingTask.getTaskName());
        System.out.println(drivingTask);
    }
}
