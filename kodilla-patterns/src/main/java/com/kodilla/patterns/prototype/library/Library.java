package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Task;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Library extends Prototype<Library> {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library( final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String s = "   Library [" + name + "]";
        for (Book book : books) {
            s = s + "\n" + book.toString();
        }
        return s + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Library library = (Library) o;

        if (!Objects.equals(name, library.name)) return false;
        return Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books);
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }


    public Library deepClone() throws CloneNotSupportedException {
        Library cloneLibrary = super.clone();
        cloneLibrary.books = new HashSet<>();
        for (Book book: books) {
            Book clonedBook = new Book(book.title, book.author, book.publicationDate);
            cloneLibrary.getBooks().add(clonedBook);
        }
        return cloneLibrary;
    }
}
