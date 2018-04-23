package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {

//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify(() -> System.out.println("Beautify".toUpperCase()));
//        poemBeautifier.beautify(() -> System.out.println("each"));
//        poemBeautifier.beautify(() -> System.out.println("text"));
//        poemBeautifier.beautify(() -> System.out.println("line"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}

