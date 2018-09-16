package com.github.service.implementations;

import com.github.model.UploadFile;
import com.github.repository.UploadFileRepository;
import com.github.resource.FileResource;
import com.github.service.UploadFileService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UploadFileServiceImplementation implements UploadFileService {
    private UploadFileRepository uploadFileRepository;
    private ModelMapper modelMapper;

    @Autowired
    public UploadFileServiceImplementation(UploadFileRepository uploadFileRepository, ModelMapper modelMapper){
        this.uploadFileRepository = uploadFileRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    @Override
    public Long save(String filename, byte[] data) {
        UploadFile uploadFile = new UploadFile();
        uploadFile.setFileName(filename);
        uploadFile.setData(data);

        UploadFile saved = uploadFileRepository.save(uploadFile);
        return saved.getId();
    }

    @Override
    public Optional<FileResource> findById(Long id) {
        return uploadFileRepository.findById(id)
                .map(file -> modelMapper.map(file, FileResource.class));
    }
}
