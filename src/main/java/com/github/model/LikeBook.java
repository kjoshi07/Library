package com.github.model;

import javax.persistence.*;

@Entity
@Table(name = "like_book")
public class LikeBook {
    @Id
    private Long id;
    @OneToOne(cascade = CascadeType.MERGE)
    private Book book;
    @OneToOne(cascade = CascadeType.MERGE)
    private User user;

    public void setId(Long id) {
        this.id = id;
    }

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