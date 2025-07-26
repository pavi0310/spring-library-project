package com.pavi.repository;

import com.pavi.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBookRepository implements BookRepository {

    List<Book> books = new ArrayList<Book>();
    @Override
    public void addBook(Book book) {
        books.add(book);
    }
    @Override
    public List<Book> getAllBooks(){
        return books;
    }
    @Override
    public List<Book> findByGenre(String genre){
        List<Book> result = new ArrayList<>();
        for( Book book: books ){
            if(book.getGenre().equalsIgnoreCase(genre)){
                result.add(book);
            }
        }
        return result;
    }

}
