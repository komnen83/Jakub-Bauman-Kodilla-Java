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
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
        System.out.println(shoppingTask);
        Assert.assertTrue(shoppingTask.isTaskExecuted());


    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeShape(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Painting", paintingTask.getTaskName());
        System.out.println(paintingTask);
        Assert.assertTrue("Painting", paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeShape(TaskFactory.DRIVING_TASK);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("Driving", drivingTask.getTaskName());
        System.out.println(drivingTask);
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
