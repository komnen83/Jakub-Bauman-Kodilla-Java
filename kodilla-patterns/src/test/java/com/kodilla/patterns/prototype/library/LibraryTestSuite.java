package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {

        Book book = new Book("Solaris", "Stanisław Lem", LocalDate.of(1961,01,01));
        Book book1 = new Book("Lolita", "Vladimir Nabokov", LocalDate.of(1955, 01, 01));
        Book book2 = new Book("Annihilation", "Jeff VanderMeer", LocalDate.of(2014,01,01));
        Book book3 = new Book("Tortilla Flat", "John Steinbeck", LocalDate.of(1935,01,01));

        Library library = new Library("Without clone");
        library.getBooks().add(book);
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("With shallow clone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try{
            deepCloneLibrary = library.deepCopy();
            cloneLibrary.setName("With deep clone");
        } catch (CloneNotSupportedException e)  {
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);

//        library.getBooks().remove(book);

        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, cloneLibrary.getBooks().size());
        Assert.assertEquals(4, deepCloneLibrary.getBooks().size());
    }
}
