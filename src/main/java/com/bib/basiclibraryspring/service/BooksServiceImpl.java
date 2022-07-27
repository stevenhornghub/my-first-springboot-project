package com.bib.basiclibraryspring.service;

import com.bib.basiclibraryspring.mapper.BooksMapper;
import com.bib.basiclibraryspring.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public Long addBook(Books books) {

        return booksMapper.addBook(books);
    }
    @Override
    public Long deleteBookById(Long id) {

        return booksMapper.deleteBookById(id);
    }
    @Override
    public Long updateBook(Books books) {

        return booksMapper.updateBook(books);
    }
    @Override
    public Books queryBookById(Long id) {

        return booksMapper.queryBookById(id);
    }
    @Override
    public Books queryBookByName(String name) {

        return booksMapper.queryBookByName(name);
    }
    @Override
    public List<Books> queryAllBook() {

        return booksMapper.queryAllBook();
    }
}
