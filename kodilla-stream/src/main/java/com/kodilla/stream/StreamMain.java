package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify(() -> System.out.println("Beautify".toUpperCase()));
//        poemBeautifier.beautify(() -> System.out.println("each"));
//        poemBeautifier.beautify(() -> System.out.println("text"));
//        poemBeautifier.beautify(() -> System.out.println("line"));

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
    }
}

