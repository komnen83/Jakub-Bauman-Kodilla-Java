package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        for(Integer element : numbers)  {
            if(element % 2 == 0)    {
                 evenList.add(element);
            }
        } return evenList;
    }
}
