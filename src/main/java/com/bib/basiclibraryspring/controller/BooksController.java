package com.bib.basiclibraryspring.controller;

import com.bib.basiclibraryspring.model.Books;
import com.bib.basiclibraryspring.service.BooksService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/book")
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Books>> queryAllBook() {
        List<Books> list = booksService.queryAllBook();
        ResponseEntity<List<Books>> books = new ResponseEntity<>(list, HttpStatus.OK);
        return books;

    }


    @PostMapping("/new")
    public Books addBook( @RequestBody Books books) {
        log.info("addBook: " + books);
        booksService.addBook(books);
        return books;
    }

    @PostMapping("/update/{id}")
    public Books updateBook(@PathVariable(value = "id") Long id,
                            @RequestBody Books books) {
        //booksService.queryBookById(id);
        log.info("update" + books);
        books.setId(id);
        booksService.updateBook(books);
        return books;
    }


    @DeleteMapping("/delete/{id}")
    public Books deleteBookById(@PathVariable(value = "id") Long id, Books books) {
        log.info("book id: " + id);
        booksService.deleteBookById(id);
        return books;
    }

    @GetMapping("/search/{word}")
    public List<Books> deleteBookById(@PathVariable(value = "word") String word) {
        List<Books> list = booksService.searchAllColumns(word);
        return list;

    }
}