package com.github.model;

import javax.persistence.*;

@Entity
@Table(name = "upload_file")
public class UploadFile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "file_name")
    private String fileName;
    private byte[] data;

    public String getFileName() {
        return fileName;
    }
    public byte[] getData() {
        return data;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setData(byte[] data) {
        this.data = data;
    }
}