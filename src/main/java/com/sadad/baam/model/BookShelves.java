package com.sadad.baam.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Mkiarashpour on 12/30/2018.
 */
public class BookShelves {
    private static BookShelves ourInstance = new BookShelves();
    private List<Book> books = new ArrayList<>();
    private List<String> ISBNs = new ArrayList<>();

    public static BookShelves getInstance() {
        return ourInstance;
    }

    private BookShelves() {
        books.add(new Book("1", "Anna Karenina", "Leo Tolstoy"));
        ISBNs.add("1");
        books.add(new Book("2","Madame Bovary", "Gustave Flaubert"));
        ISBNs.add("2");
        books.add(new Book("3","Lolita", "Vladimir Nabokov"));
        ISBNs.add("3");
        books.add(new Book("4","Middlemarch", "George Eliot"));
        ISBNs.add("4");
        books.add(new Book("5","The Stories of Anton Chekhov", "Anton Chekhov"));
        ISBNs.add("5");
    }

    public List<Book> getBooks() {
        return books;
    }
}
