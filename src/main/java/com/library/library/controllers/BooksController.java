package com.library.library.controllers;

import com.library.library.data.Book;
import com.library.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BooksController {
    @Autowired
    BookService bookService;
    @RequestMapping(method = RequestMethod.POST,value = "/books")
    public void postBook(@RequestBody Book book){
        bookService.addBook(book);
    }
}
