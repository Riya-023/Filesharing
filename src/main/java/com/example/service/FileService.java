package com.example.service;

import java.io.IOException;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import com.example.model.FileModel;

public interface FileService {

    /**
     * Retrieves all file records.
     * 
     * @return a list of FileModel objects representing all stored files.
     */
    List<FileModel> getAllFiles();

    /**
     * Handles file upload.
     * 
     * @param file        the file to be uploaded.
     * @param uploadedBy  the user uploading the file.
     * @return a ResponseEntity indicating the success or failure of the operation.
     * @throws IOException if an I/O error occurs during file processing.
     */
    ResponseEntity<String> uploadFile(MultipartFile file, String uploadedBy) throws IOException;
}

