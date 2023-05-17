package com.geekster.Mapping_Practice.Controller;

import com.geekster.Mapping_Practice.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping()
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping()
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("{id}")
    public Book getbook(@PathVariable Integer id){
        return bookService.getBook(id);
    }

    @PutMapping()
    public void updateBook(@RequestBody Book book){
        bookService.updateBook(book);
    }

    @DeleteMapping("{id}")
    public void deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
    }
}
