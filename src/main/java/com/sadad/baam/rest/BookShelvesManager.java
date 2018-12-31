package com.sadad.baam.rest;

import com.sadad.baam.model.Book;
import com.sadad.baam.model.BookShelves;

import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("books")
public class BookShelvesManager {

    @GET
    @Produces(APPLICATION_JSON)
    public List<Book> getAllBooks() {
        return BookShelves.getInstance().getBooks();
    }

    @GET
    @Produces(APPLICATION_JSON)
    @Path("{ISBN}")
    public Book getBook(@PathParam("ISBN") String ISBN) {
        List<Book> books = BookShelves.getInstance().getBooks();
        for (Book book : books) {
            if (book.getISBN().equalsIgnoreCase(ISBN)) {
                return book;
            }
        }
        return null;
    }

    @PUT
    @Produces(APPLICATION_JSON)
    @Path("{ISBN}")
    public List<Book> addBook(@PathParam("ISBN") String newBookISBN, Book newBook) {
        List<Book> books = BookShelves.getInstance().getBooks();
        books.add(new Book(newBookISBN, newBook.getName(), newBook.getAuthorName()));
        return books;
    }

    @POST
    @Produces(APPLICATION_JSON)
    @Path("{ISBN}")
    public List<Book> updateBook(@PathParam("ISBN") String ISBN, Book updatedBook) {
        List<Book> books = BookShelves.getInstance().getBooks();
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)){
                book = new Book(ISBN, updatedBook.getName(), updatedBook.getAuthorName());
            }
        }
        return books;
    }

    @DELETE
    @Produces(APPLICATION_JSON)
    @Path("{ISBN}")
    public List<Book> deleteBook(@PathParam("ISBN") String ISBN) {
        List<Book> books = BookShelves.getInstance().getBooks();
        for (Book book : books) {
            if (book.getISBN().equals(ISBN))
                books.remove(book);
            break;
        }
        return books;
    }

    @DELETE
    @Produces(APPLICATION_JSON)
    @Path("{ISBN}/all")
    public List<Book> deleteAllBook(@PathParam("ISBN") String ISBN) {
        List<Book> books = BookShelves.getInstance().getBooks();
        for (Book book : books) {
            if (book.getISBN().equals(ISBN))
                books.remove(book);
        }
        return books;
    }
}