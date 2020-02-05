package be.lens.syntra.livecode.client.service;

import be.lens.syntra.livecode.client.model.Book;

import java.util.List;

public interface BookService {
    Book getBook(String isbn);

    List<Book> getAllBooks();
}
