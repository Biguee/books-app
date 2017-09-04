package eu.ncdc.dao;

import eu.ncdc.entity.Book;

import java.util.List;

public interface BookDao {

    //create
    void saveBook(Book book);
    //read
    Book findBookById(Integer id);
    //list
    List<Book> findAllBooks();

}
