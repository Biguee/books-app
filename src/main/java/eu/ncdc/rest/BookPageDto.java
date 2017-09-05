package eu.ncdc.rest;

import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel(value = "Book")
public class BookPageDto {

    private List<BookDto> books;
    private int pageNumber;
    private int totalPages;

    public BookPageDto(List<BookDto> books, int pageNumber, int totalPages) {
        this.books = books;
        this.pageNumber = pageNumber;
        this.totalPages = totalPages;
    }

    public BookPageDto() {
    }

    public List<BookDto> getBooks() {
        return books;
    }

    public void setBooks(List<BookDto> books) {
        this.books = books;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
