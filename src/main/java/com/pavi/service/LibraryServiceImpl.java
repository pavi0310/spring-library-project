package com.pavi.service;

import com.pavi.model.Book;
import com.pavi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService{

    private final BookRepository bookRepository;

    @Autowired
    public LibraryServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(Book book) {
        bookRepository.addBook(book);
    }
    @Override
    public List<Book> getAllBooks(){
        return bookRepository.getAllBooks();
    }
    @Override
    public List<Book> getBooksByGenre(String genre){
        return bookRepository.findByGenre(genre);
    }
}
