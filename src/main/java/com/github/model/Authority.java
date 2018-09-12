package com.github.model;

public class Authority {
    private Long id;
    private Role name;

    public Long getId() {
        return id;
    }
    public Role getName() {
        return name;
    }
    public void setName(Role name) {
        this.name = name;
    }
}