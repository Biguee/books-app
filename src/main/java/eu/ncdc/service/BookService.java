package eu.ncdc.service;

import eu.ncdc.dao.BookDao;
import eu.ncdc.dao.BookDaoImpl;
import eu.ncdc.entity.Book;
import eu.ncdc.rest.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void saveBook(Book book){
        bookDao.saveBook(book);
    }

    public Book findBookById(Integer id){ return bookDao.findBookById(id); }

    public List<Book> findAllBooks(){return bookDao.findAllBooks();}

//    public ResultPage<Book> getBook(int pageNumber, int pageSize) {
//        Page<Book> bookPage = bookDao.findAllBooks(new PageRequest(pageNumber, pageSize));
//        return new ResultPage<>(bookPage.getContent(), bookPage.getNumber(), bookPage.getTotalPages());
//    }
}
