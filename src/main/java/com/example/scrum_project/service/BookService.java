package com.example.scrum_project.service;


import com.example.scrum_project.model.Book;
import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookByIsbn(String isbn);
    Book createBook(Book book);
    Book updateBook(String isbn, Book book);
    void deleteBook(String isbn);
}
