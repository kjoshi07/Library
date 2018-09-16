package com.github.service;

import com.github.resource.FileResource;

import java.util.Optional;

public interface UploadFileService {
    Long save(String filename, byte[] data);
    Optional<FileResource> findById(Long id);
}
