package com.pavi.repository;

import com.pavi.model.Book;

import java.util.List;

public interface BookRepository {

    void addBook(Book book);
    List<Book> getAllBooks();
    List<Book> findByGenre(String genre);

}
