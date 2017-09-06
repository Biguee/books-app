package eu.ncdc.rest;

import eu.ncdc.entity.Book;
import eu.ncdc.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.List;

import static org.springframework.http.ResponseEntity.created;

@RestController
public class BookRestController {

    @Autowired
    private BookService bookService;

//    @RequestMapping(value = "/book", method = RequestMethod.POST)
//    public ResponseEntity<Book> addBook(@RequestBody Book book) {
//        HttpHeaders headers = new HttpHeaders();
//        if (book == null) {
//            return new ResponseEntity<Book>(HttpStatus.BAD_REQUEST);
//        }
//        bookService.saveBook(book);
//        headers.add("Book added  - ", String.valueOf(book.getId()));
//        return new ResponseEntity<Book>(book, headers, HttpStatus.CREATED);
//    }
//

//    @RequestMapping(value = "/list")
//    public List<Book> getAllBooks(){
//        return bookService.findAllBooks();
//    }
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public String addBook3(@RequestBody Book book){
//        bookService.saveBook(book);
//        return "OK";
//    }


//
//    @RequestMapping(value = "/add/{author}/{title}/{isbn}")
//    public String addBook2(@PathVariable Book book){
//        bookService.saveBook(book);
//        return "OK";
//    }

//    @GetMapping("/books")
//    public List getAllBooks() {
//        return bookService.findAllBooks();
//    }

//    @RequestMapping(value = "/book", method = RequestMethod.GET)
//    public ResponseEntity<List<Book>> getAllBooks() {
//        List<Book> books = bookService.findAllBooks();
//
//        if(books.isEmpty()){
//            return new ResponseEntity<List<Book>>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
//    }

//    private BookService bookService;
//    private ModelMapper mapper;
//    private UriBuilder uriBuilder;
//
//    @Autowired
//    public BookRestController(BookService bookService, ModelMapper mapper) {
//        this.bookService = bookService;
//        this.mapper = mapper;
//    }
//
//    @ApiOperation(value = "Create new book")
//    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<Void> addBook2(@ApiParam(name = "book")@RequestBody BookDto bookDto){
//        Book book = mapper.map(bookDto, Book.class);
//        bookService.saveBook(book);
//        URI uri = uriBuilder. requestUriWithId(book.getId());
//        return created(uri).build();
//    }

//    @ApiOperation(value = "Get all books", response = BookPageDto.class)
//    @RequestMapping(method = RequestMethod.GET)
//    public BookPageDto getAllBooks(
//            @RequestParam(required = false, defaultValue = "0", name = "pageNumber") int pageNumber,
//            @RequestParam(required = false, defaultValue = "20", name = "pageSize") int pageSize) {
//        ResultPage<Book> resultPage = bookService.getBook(pageNumber, pageSize);
////        List<BookDto> bookDtos = mapper.map(resultPage.getContent(), BookDto.class);
////        return new BookPageDto(bookDtos, resultPage.getPageNumber(), resultPage.getTotalPages());
//    }

}
