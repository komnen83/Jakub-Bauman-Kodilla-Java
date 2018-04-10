package com.kodilla;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public int hashCode()    {
        return 0;
    }

    public boolean equals(Object o) {
        Book e = (Book) o;
        return (title.equals(getTitle())) && (author.equals(getAuthor()));
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class BookApp {
    public static void main(String[] args) {

        List<Book> bookList = new LinkedList<>();
        for (int i = 0; i < 5000000; i++) {
            bookList.add(new Book("Solaris", "Stanisław Lem"));
        }

        System.out.println("Quantity of elements in the bookList: " + bookList.size());

        long begin = System.nanoTime();
        bookList.remove(bookList.size()-1);
        long end = System.nanoTime();
        System.out.println("Removing last element has taken: " + (end - begin) + "ms");

        begin = System.nanoTime();
        bookList.remove(0);
        end = System.nanoTime();
        System.out.println("Removing first element has taken: " + (end - begin) + "ms");

        begin = System.nanoTime();
        ((LinkedList<Book>) bookList).addFirst(new Book("Solaris", "Stanislaw Lem"));
        end = System.nanoTime();
        System.out.println("Adding first element has taken: " + (end - begin) + "ms");

        begin = System.nanoTime();
        ((LinkedList<Book>) bookList).addLast(new Book("Catch 22", "Joseph Heller"));
        end = System.nanoTime();
        System.out.println("Adding last element has taken: " + (end - begin) + "ms");

        Map<Integer, Book> bookMap = new HashMap<>();
            for (int n = 0; n < 4000000; n++) {
                bookMap.put(0, new Book("adsf", "asdf"));
            }
        System.out.println("Quantity element of bookMap: " + bookMap.size());

        begin = System.nanoTime();
        bookMap.get(0);
        end = System.nanoTime();
        System.out.println("Searching element in bookMap: " + (end - begin) + "ms");

        begin = System.nanoTime();
        bookMap.put(0, new Book("asdf", "asdf"));
        end = System.nanoTime();
        System.out.println("Adding element to bookMap: " + (end - begin) + "ms");

        begin = System.nanoTime();
        bookMap.remove(0);
        end = System.nanoTime();
        System.out.println("Removing element from bookMap: " + (end - begin) + "ms");
    }
}
