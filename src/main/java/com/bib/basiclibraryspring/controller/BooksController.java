package com.bib.basiclibraryspring.controller;

import com.bib.basiclibraryspring.model.Books;
import com.bib.basiclibraryspring.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BooksService booksService;

//    @RequestMapping("/allBook")
//    public String list(Model model) {
//        List<Books> list = booksService.queryAllBook();
//        model.addAttribute("list", list);
//        return "allBook";
//    }

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

    @RequestMapping("/toUpdate")
    public String toUpdate(Long id, Model model) {

        Books books = booksService.queryBookById(id);
        model.addAttribute("Qbooks", books);
        return "UpdateBook";
    }


    @RequestMapping("/Updatebook")
    public String Updatebook(Books books) {

        System.out.println("addBook" + books);
        booksService.updateBook(books);
        return "redirect:/book/allBook";
    }


    @RequestMapping("/toDelete")
    public String toDelete(Long id, Model model) {

        Books books = booksService.queryBookById(id);
        model.addAttribute("books", books);
        return "DeleteBook";
    }


    @RequestMapping("/DeleteBook")
    public String DeleteBook(Long id) {

        booksService.deleteBookById(id);
        return "redirect:/book/allBook";

    }
        // Query book function
        @RequestMapping("/queryBook")
        public String queryBook(Model model, String queryBookName) {

            Books books = booksService.queryBookByName(queryBookName);
            List<Books> list = new ArrayList<Books>();
            list.add(books);
            model.addAttribute("list", list);
            return "allBook";
        }


    }