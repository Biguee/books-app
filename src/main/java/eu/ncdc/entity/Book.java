package eu.ncdc.entity;

import eu.ncdc.validation.AuthorStartsFromA;
import eu.ncdc.validation.CorrectISBN;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @AuthorStartsFromA
    @Column(name = "author")
    private String author;
    @Length(min = 2, max = 100)
    @Column(name = "title")
    private String title;
    @CorrectISBN
    @Column(name = "isbn")
    private String isbn;

    public Book(String author, String title, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) { this.author = author; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) { this.title = title; }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) { this.isbn = isbn; }
}
