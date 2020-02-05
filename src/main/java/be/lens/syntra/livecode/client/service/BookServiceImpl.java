package be.lens.syntra.livecode.client.service;

import be.lens.syntra.livecode.client.dto.BookList;
import be.lens.syntra.livecode.client.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    RestTemplate restTemplate;

    @Autowired
    public BookServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Book getBook(String isbn) {
        Book book = restTemplate.getForObject("http://localhost:8080/books/" + isbn, Book.class);
        return book;
    }

    @Override
    public List<Book> getAllBooks() {
        BookList bookList = restTemplate.getForObject("http://localhost:8080/books", BookList.class);
        return bookList.getBooks();
    }
}
