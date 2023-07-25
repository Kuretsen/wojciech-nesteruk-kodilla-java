package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){
        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        bookSet.add(new Book("John Ronald Reuel Tolkien", "The Fellowship of the Ring", 1954, "J. R. R. Tolkien"));
        bookSet.add(new Book("Trudi Canavan", "Priestess of the White", 2005, "T. Canavan"));
        bookSet.add(new Book("Brandon Sanderson", "The Wat of Kings", 2010, "B. Sanderson"));
        //Then
        assertEquals(2005, medianAdapter.publicationYearMedian(bookSet));
    }
}