package com.github.repository;

import com.github.Application;
import com.github.model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    public void shouldReturnTrueIfFoundBook(){
        Book book = bookRepository.save(new Book("La La Land"));
        Book foundBook = bookRepository.findById(book.getId()).orElse(new Book());

        assertEquals(book.getId(), foundBook.getId());
    }
}