package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = new int[20];
        Average average = new Average();
        //When
        double result = average.getAverage(numbers);
        //Then
        Assert.assertEquals(9.5, result, 0.0);
    }
}
