package com.github.service.implementations;

import com.github.model.Book;
import com.github.model.Category;
import com.github.model.UploadFile;
import com.github.repository.BookRepository;
import com.github.resource.AddBookResource;
import com.github.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class BookServiceImplementation implements BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookServiceImplementation(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(AddBookResource addBookResource) {
        Book book = new Book();
        //Long coverImageId = addBookResource.getCoverImageId();
        //Long contentId = addBookResource.getContentId();
        UploadFile coverImage = null;
        UploadFile bookContent = null;

        //TO DO!!!
        //case when coverImage and bookContent are not null

        //book.setCoverImage(coverImage);
        //book.setContent(bookContent);
        book.setTitle(addBookResource.getTitle());
        book.setDescription(addBookResource.getDescription());
        //book.setCategories(Arrays.stream(addBookResource.getCategories())
          //      .map(Category::new)
           //     .collect(Collectors.toSet()));

        bookRepository.save(book);
    }
}
