package com.github.model;

public class BookToRead {
    private Long id;
    private Book book;
    private User user;

    public Long getId() {
        return id;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}