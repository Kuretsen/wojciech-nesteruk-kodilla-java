package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library fantasy = new Library("Fantasy");

        Book book1 = new Book("Gra o tron", "George R. R. Martin", LocalDate.of(1996, 8, 1));
        Book book2 = new Book("Kaplanka w bieli", "Trudi Canavan", LocalDate.of(2005, 10, 26));
        Book book3 = new Book("Wladca pierscieni: Druzyna pierscienia", "J. R. R. Tolkien", LocalDate.of(1954, 7, 29));
        fantasy.getBooks().add(book1);
        fantasy.getBooks().add(book2);
        fantasy.getBooks().add(book3);

        //making a shallow copy of object fantasy
        Library shallowCloneFantasy = null;
        try {
            shallowCloneFantasy = fantasy.shallowCopy();
            shallowCloneFantasy.setName("Shallow copy of fantasy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object fantasy
        Library deepCloneFantasy = null;
        try {
            deepCloneFantasy = fantasy.deepClone();
            deepCloneFantasy.setName("Deep copy of fantasy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        fantasy.getBooks().remove(book3);

        //Then
        System.out.println(fantasy);
        System.out.println(shallowCloneFantasy);
        System.out.println(deepCloneFantasy);
        assertEquals(2, fantasy.getBooks().size());
        assertEquals(2, shallowCloneFantasy.getBooks().size());
        assertEquals(3, deepCloneFantasy.getBooks().size());
        assertEquals(fantasy.getBooks(), shallowCloneFantasy.getBooks());
        assertNotEquals(fantasy.getBooks(), deepCloneFantasy.getBooks());
    }
}
