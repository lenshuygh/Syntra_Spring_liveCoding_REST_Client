package be.lens.syntra.livecode.client.dto;

import be.lens.syntra.livecode.client.model.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookList {
    private List<Book> books;
}
