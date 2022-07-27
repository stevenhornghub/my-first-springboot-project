package com.bib.basiclibraryspring.controller;

import com.bib.basiclibraryspring.model.Books;
import com.bib.basiclibraryspring.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping("/allBook")
    public String list(@RequestBody Model model) {
        List<Books> list = booksService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    //HTTP PROTOCOL
    @RequestMapping("/toAddBook")
    public String toAddBook() {

        return "addBook";
    }


    @RequestMapping("/addBook")
    public String addBook(@RequestBody Books books) {

        System.out.println("addBook" + books);
        booksService.addBook(books);
        return "redirect:/book/allBook";
    }

    @PostMapping("/toUpdate/{id}")
    public String toUpdate(@RequestBody Books books) {

        System.out.println("updateBook" + books);
        booksService.updateBook(books);
        return "redirect:/book/allBook";
    }


    @PostMapping("/Updatebook/{id}")
    public String updateBook(@RequestBody Books books) {

        System.out.println("addBook" + books);
        booksService.updateBook(books);
        return "redirect:/book/allBook";
    }


    @DeleteMapping("/toDelete/{id}")
    public String toDelete(@RequestBody Long id, Model model) {

        Books books = booksService.queryBookById(id);
        model.addAttribute("books", books);
        return "DeleteBook";
    }


    @DeleteMapping("/DeleteBook/{id}")
    public String deleteBookById( Long id) {

        booksService.deleteBookById(id);
        return "redirect:/book/allBook";

    }
        // Query book function
        @GetMapping("/queryBook")
        public String queryBook(Model model, Long queryBookById) {

            Books books = booksService.queryBookById(queryBookById);
            List<Books> list = new ArrayList<Books>();
            list.add(books);
            model.addAttribute("list", list);
            return "allBook";
        }


    }