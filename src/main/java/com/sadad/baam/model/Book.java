package com.sadad.baam.model;

import org.apache.commons.lang3.StringUtils;

public class Book {
    private String ISBN;
    private String name;
    private String authorName;

    public Book() {
    }

    public Book(String ISBN) {
        this.ISBN = ISBN;
    }

    public Book(String ISBN, String name, String authorName) {
		this.ISBN = ISBN;
        this.name = name;
        this.authorName = authorName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!ISBN.equals(book.ISBN)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return ISBN.hashCode();
    }
}
