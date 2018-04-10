package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
//        SimpleUser simpleUser = new SimpleUser("theForumUser");
//
//        String result = simpleUser.getUsername();
//
//        if (result.equals("theForumUser")) {
//            System.out.println("test OK");
//        } else {
//            System.out.println("Error!");
//        }
//        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator(4,6);

        int result1 = calculator.add();
        int result2 = calculator.substract();

        if (result1 == 4 + 6)   {
            System.out.println("test OK");
        } else {
            System.out.println("error");
        }
        if ( result2 == 3 - 6)  {
            System.out.println("test OK");
        } else {
            System.out.println("error");
        }

    }
}
