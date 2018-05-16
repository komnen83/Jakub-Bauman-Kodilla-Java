package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average implements ArrayOperations {

        public double getAverage(int[] numbers)   {

        IntStream.range(0, numbers.length)
                    .forEach(System.out::println);
        IntStream.range(0, numbers.length)
                    .average();

        return 0;
        }
}

