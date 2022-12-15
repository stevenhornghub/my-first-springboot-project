package com.bib.basiclibraryspring.service;

import com.bib.basiclibraryspring.exceptions.CouldNotDeleteException;
import com.bib.basiclibraryspring.mapper.BooksMapper;
import com.bib.basiclibraryspring.model.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {

    private final BooksMapper booksMapper;

    public BooksServiceImpl(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;

    }

    @Override
    public Long addBook(Books books) {

        return booksMapper.addBook(books);
    }
    @Override
    public void deleteBookById(Long bookId) {
        Long numberOfRowAffected = booksMapper.deleteBookById(bookId);
        if(numberOfRowAffected != 1)
            throw new CouldNotDeleteException(String.format("A book with id [%d] does not exist therefore, not deleted!", bookId));
    }
    @Override
    public Long updateBook(Books books) {
        Long numberOfRowAffected = booksMapper.updateBook(books);
        if(numberOfRowAffected != 1)
            throw new CouldNotDeleteException(String.format("A book with id [%d] does not exist therefore, not updated!", books));

        return booksMapper.updateBook(books);
    }
    @Override
    public Books queryBookById(Long id) {

        return booksMapper.queryBookById(id);

    }
        @Override
        public List<Books> queryAllBook() {
        return booksMapper.queryAllBook();
    }

    @Override
    public List<Books> searchAllColumns(String word) {
        return booksMapper.searchAllColumns(word);
    }
}
