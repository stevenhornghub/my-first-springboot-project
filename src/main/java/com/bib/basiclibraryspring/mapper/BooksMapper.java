package com.bib.basiclibraryspring.mapper;

import com.bib.basiclibraryspring.model.Books;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface BooksMapper {


    @Insert("INSERT INTO book(name, description, genre, author) " +
            " VALUES (#{name}, #{description}, #{genre}, #{author})")
    Long addBook(Books books);


    @Update("UPDATE library.book SET name=#{name}, description=#{description}, genre=#{genre}, author=#{author} WHERE id=#{id}")
    Long updateBook(Books books);


    @Delete("DELETE FROM library.book WHERE id=#{bookId}")
    Long deleteBookById(Long bookId);


    @Select("SELECT * FROM book WHERE id=#{id}")
    Books queryBookById(@Param("id") Long id);

    @Select("SELECT * FROM book")
    List<Books> queryAllBook();

    @Select("SELECT * FROM library.book WHERE description LIKE '%' #{description} '%' OR name LIKE '%' #{name} '%' OR genre LIKE '%' #{genre} '%' OR author LIKE '%' #{author} '%'")
    List<Books> searchAllColumns(String word);

}