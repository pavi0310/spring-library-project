package com.pavi.service;

import com.pavi.model.Book;

import java.util.List;

public interface LibraryService {

    void addBook(Book book);
    List<Book> getAllBooks();
    List<Book> getBooksByGenre(String genre);

}
