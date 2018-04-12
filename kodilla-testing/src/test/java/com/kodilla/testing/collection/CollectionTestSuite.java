package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList()   {
        //Given
        OddNumbersExterminator emptyListExterminator = new OddNumbersExterminator();
        //When
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> result = emptyListExterminator.exterminate((ArrayList<Integer>) emptyList);
        System.out.println("Testing empty list: " + result.size());
        //Then
        Assert.assertEquals(0, result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList()  {
        //Given
        OddNumbersExterminator normalListExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);

        for(Integer temp : normalList)   {
            System.out.println(temp);
        }

        List<Integer> result = normalListExterminator.exterminate(normalList);
        System.out.println("Testing even list: " + result);
        //Then
        Assert.assertEquals(2, result.size());
        System.out.println("Testing size list: " + result.size());
        Assert.assertTrue(result.contains(2));
        System.out.println("Testing contains number 2: " + result.contains(2));
        Assert.assertFalse(result.contains(3));
        System.out.println("Testing doesn't contains number 3: " + result.contains(3));
    }
}
