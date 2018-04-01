package com.kodilla;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b)    {
        this.a = a;
        this.b = b;
    }

    public int sumAAndB()   {
        return a + b;
    }

    public int differenceAAndB()    {
        return a - b;
    }
}

class CalculatorApp {
    public static void main(String[]args){

        Calculator simpleCalculator = new Calculator(5,6);

        int sum = simpleCalculator.sumAAndB();
        int difference = simpleCalculator.differenceAAndB();

        System.out.println("Sum = " + sum + " Difference = " + difference);
    }
}
