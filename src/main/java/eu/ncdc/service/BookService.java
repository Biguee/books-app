package eu.ncdc.service;

import eu.ncdc.dao.BookDao;
import eu.ncdc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    //create
    public void saveBook(Book book){
        bookDao.saveBook(book);
    }
    //read
    public Book findBookById(Integer id){ return bookDao.findBookById(id); }
    //list
    public List<Book> findAllBooks(){return bookDao.findAllBooks();}

}
