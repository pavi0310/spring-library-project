package com.pavi;

import com.pavi.model.Book;
import com.pavi.repository.BookRepository;
import com.pavi.repository.InMemoryBookRepository;
import com.pavi.service.LibraryService;
import com.pavi.service.LibraryServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class LibraryApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        LibraryService libraryService = applicationContext.getBean(LibraryService.class);

        libraryService.addBook(new Book(1, "Wings of Fire", "A.P.J. Abdul Kalam", "Autobiography"));
        libraryService.addBook(new Book(2, "The Hobbit", "J.R.R. Tolkien", "Fantasy"));
        libraryService.addBook(new Book(3, "The Alchemist", "Paulo Coelho", "Fiction"));

        System.out.println("All books here:");
        List<Book> allBooks = libraryService.getAllBooks();
        allBooks.forEach(book -> System.out.println(book.getTitle()));

        System.out.println("Fantasy books: ");
        List<Book> fantasyBooks = libraryService.getBooksByGenre("Fantasy");
        fantasyBooks.forEach(book -> System.out.println(book.getTitle()));

    }
}