package eu.ncdc.controller;

import eu.ncdc.entity.Book;
import eu.ncdc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @RequestMapping(value = "addBook.html", method = RequestMethod.GET)
    public ModelAndView showAddBook(){ return new ModelAndView("/addBook", "book", new Book());}

    @RequestMapping(value = "addBook.html")
    public ModelAndView addBook(@Valid Book book, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("/addBook");
        }
        bookService.saveBook(book);
        return new ModelAndView("allBooks","bookList", bookService.findAllBooks());
    }

    @RequestMapping(value = "allBooks.html")
    public ModelAndView allBooks(){
        return new ModelAndView(
                "allBooks","bookList", bookService.findAllBooks());
    }


}
