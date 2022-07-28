package com.bib.basiclibraryspring.mapper;

import com.bib.basiclibraryspring.model.Books;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface BooksMapper {


    @Insert("INSERT INTO books(name, description, genre, author) " +
            " VALUES (#{name}, #{description}, #{genre}, #{author})")
    Long addBook(Books books);

    @Delete("DELETE FROM books WHERE id=#{id}")
    Long deleteBookById(@Param("id") Long id);

    @Update("UPDATE books SET name=#{name}, description=#{description}, genre=#{genre}, author#{author})" + "WHERE (id=#{id})")
    Long updateBook(Books books);

    @Select("SELECT * FROM books WHERE id=#{id}")
    Books queryBookById(@Param("id") Long id);

    @Select("SELECT * FROM books")
    List<Books> queryAllBook();
}