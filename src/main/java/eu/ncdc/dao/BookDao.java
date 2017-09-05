package eu.ncdc.dao;

import eu.ncdc.entity.Book;

import java.util.List;

public interface BookDao {

    //C-reate
    void saveBook(Book book);
    //R-ead
    Book findBookById(Integer id);
    //L-ist
    List<Book> findAllBooks();

}
