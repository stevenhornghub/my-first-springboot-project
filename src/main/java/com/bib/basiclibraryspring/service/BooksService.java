package com.bib.basiclibraryspring.service;

import com.bib.basiclibraryspring.mapper.BooksMapper;
import com.bib.basiclibraryspring.model.Books;

import java.util.List;

public interface BooksService {


    Long addBook(Books books);

    Long deleteBookById(Long id);

    Long updateBook(Books books);

    Books queryBookById(Long id);


    List<Books> queryAllBook();


}