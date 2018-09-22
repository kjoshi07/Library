package com.github.service.implementations;

import com.github.model.Book;
import com.github.model.Category;
import com.github.model.UploadFile;
import com.github.repository.BookRepository;
import com.github.resource.AddBookResource;
import com.github.service.BookService;
import com.github.service.UploadFileService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service("bookService")
public class BookServiceImplementation implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private UploadFileService uploadFileService;
    @Autowired
    private ModelMapper modelMapper;

    /*@Autowired
    public BookServiceImplementation(BookRepository bookRepository, UploadFileService uploadFileService,
                                     ModelMapper modelMapper){
        this.bookRepository = bookRepository;
        this.uploadFileService = uploadFileService;
        this.modelMapper = modelMapper;
    }*/

    @Override
    public void addBook(AddBookResource addBookResource) {
        Book book = new Book();
        Long coverImageId = addBookResource.getCoverImageId();
        Long contentId = addBookResource.getContentId();
        UploadFile coverImage = null;
        UploadFile bookContent = null;

        if (coverImage != null){
            coverImage = uploadFileService.findById(coverImageId)
                    .map(fileResource -> modelMapper.map(fileResource, UploadFile.class))
                    .orElse(null);
        }
        if (contentId != null){
            bookContent = uploadFileService.findById(contentId)
                    .map(fileResource -> modelMapper.map(fileResource, UploadFile.class))
                    .orElse(null);
        }

        book.setCoverImage(coverImage);
        book.setContent(bookContent);
        book.setTitle(addBookResource.getTitle());
        book.setDescription(addBookResource.getDescription());
        book.setCategories(Arrays.stream(addBookResource.getCategories())
                .map(Category::new)
                .collect(Collectors.toSet()));

        bookRepository.save(book);
    }
}
