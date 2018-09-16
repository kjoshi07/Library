package com.github.resource;

public class FileResource {
    private Long id;
    private String fileName;
    private byte[] data;

    public FileResource() {
    }

    public FileResource(Long id, String fileName, byte[] data) {
        this.id = id;
        this.fileName = fileName;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
