package com.bib.basiclibraryspring.mapper;

import com.bib.basiclibraryspring.model.Books;
import org.apache.ibatis.annotations.*;


@Mapper
public interface BooksMapper {

    @Insert("INSERT INTO books(name, description, genre, author) " +
            " VALUES (#{name}, #{description}, #{genre}, #{author})")
    Long addBook(Books books);

    Long deleteBookById(@Param("id") Long id);

    Long updateBook(Books books);

    Books queryBookById(@Param("id") Long id);

    Books queryBookByName(@Param("name") String name);
}