package com.example.repositry;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.FileEntity;

public interface FileRepository extends JpaRepository<FileEntity, Integer> {

    List<FileEntity> findByExpiryTimeBefore(LocalDateTime now);
} 