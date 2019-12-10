package com.library.library.services;

import com.library.library.data.Book;

import java.util.List;

/**
 * Interface interacts with book repository to perform crud operations
 */
public interface BookService {
    void addBook(Book book);
    List<Book> getBooks(String bookName);
    List<Book> getBooks();
}
