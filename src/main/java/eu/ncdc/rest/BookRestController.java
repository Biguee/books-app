package eu.ncdc.rest;

import eu.ncdc.entity.Book;
import eu.ncdc.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;

import static org.springframework.http.ResponseEntity.created;

@Api(description = "Books resource")
@RequestMapping(value = UriBuilder.PREFIX + "/books")
@RestController
public class BookRestController {

    private BookService bookService;
    private ModelMapper mapper;
    private UriBuilder uriBuilder;

    @Autowired
    public BookRestController(BookService bookService, ModelMapper mapper) {
        this.bookService = bookService;
        this.mapper = mapper;
    }

    @ApiOperation(value = "Create new book")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> addBook2(@ApiParam(name = "book")@RequestBody BookDto bookDto){
        Book book = mapper.map(bookDto, Book.class);
        bookService.saveBook(book);
        URI uri = uriBuilder. requestUriWithId(book.getId());
        return created(uri).build();
    }

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
