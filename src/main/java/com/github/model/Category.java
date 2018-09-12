package com.github.model;

import java.util.List;

public class Category {
    private Long id;
    private String name;
    private List<Book> books;
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Book> getListOfBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}