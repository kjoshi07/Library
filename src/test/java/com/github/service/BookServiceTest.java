package com.github.service;

import com.github.Application;
import com.github.model.Book;
import com.github.repository.BookRepository;
import com.github.resource.AddBookResource;
import com.github.service.implementations.BookServiceImplementation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertFalse;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class BookServiceTest {
    @Autowired
    private BookRepository bookRepository;
    private AddBookResource addBookResource;
    private BookService bookService;

    @Before
    public void setup(){
        bookService = new BookServiceImplementation();
        addBookResource = new AddBookResource("Title", "Description");
    }

    @Test
    public void shouldAddBookToDatabase(){
        bookService.addBook(addBookResource);

        List<Book> book = bookRepository.findAll();
        assertFalse(book.isEmpty());
    }
}
