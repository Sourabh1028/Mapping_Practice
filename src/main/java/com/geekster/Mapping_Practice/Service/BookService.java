package com.geekster.Mapping_Practice.Service;

import com.geekster.Mapping_Practice.Model.Book;
import com.geekster.Mapping_Practice.Repositary.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public void addBook(Book book) {
        bookRepo.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book getBook(Integer id) {
        return bookRepo.getById(id);
    }

    public void updateBook(Book book) {
        bookRepo.save(book);
    }

    public void deleteBook(Integer id) {
        bookRepo.deleteById(id);
    }
}
