package com.kodilla;

import java.util.*;

class RandomA   {

    public String generateRandomA() {
        Random theGenerator = new Random();
        String myString = "a";
        for (int i = 0; i < theGenerator.nextInt(50); i++) {
            myString += "a";
        }
        return myString;
    }
}

class EvenAndOddSplitter {

    List<String> evenList = new ArrayList<String>();
    List<String> oddList = new ArrayList<String>();

    public void EvenAndOddSplitter(Deque<String> theNumber)  {
        while(!theNumber.isEmpty()) {
            String theTask = theNumber.poll();

            if (theTask.length() % 2 == 0)
            {
                evenList.add(theTask);
            } else {
                oddList.add(theTask);
            }
        }
        System.out.println("Even list: " + evenList + "\nOdd list: " + oddList);
    }

    public List<String> getEvenList() {
        return evenList;
    }

    public List<String> getOddList() {
        return oddList;
    }
}

class Serpent {
    public static void main(String[] args) {

        RandomA objectA = new RandomA();

        ArrayDeque<String> letter = new ArrayDeque<>();
        for(int i = 0; i < 50; i++) {
            letter.offer(objectA.generateRandomA());
        }
        System.out.println("Random 'a' list: " + letter + "\nList size: " + letter.size() + "\n");

        EvenAndOddSplitter evenAndOddSplitter = new EvenAndOddSplitter();
        evenAndOddSplitter.EvenAndOddSplitter(letter);
    }
}




