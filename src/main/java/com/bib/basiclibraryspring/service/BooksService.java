package com.bib.basiclibraryspring.service;

import com.bib.basiclibraryspring.model.Books;

import java.util.List;

public interface BooksService {


    Long addBook(Books books);

    Long updateBook(Books books);

    Long deleteBookById(Books id);

    Books queryBookById(Long id);

    List<Books> queryAllBook();

    List<Books> searchAllColumns(String word);


}