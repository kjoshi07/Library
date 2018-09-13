package com.github.resource;

public class AddBookResource {
    private String title;
    private String description;
    private Long coverImageId;
    private Long contentId;
    private Long[] categories;

    public AddBookResource(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public AddBookResource(String title, String description, Long coverImageId, Long contentId, Long[] categories) {
        this.title = title;
        this.description = description;
        this.coverImageId = coverImageId;
        this.contentId = contentId;
        this.categories = categories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCoverImageId() {
        return coverImageId;
    }

    public void setCoverImageId(Long coverImageId) {
        this.coverImageId = coverImageId;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public Long[] getCategories() {
        return categories;
    }

    public void setCategories(Long[] categories) {
        this.categories = categories;
    }
}
