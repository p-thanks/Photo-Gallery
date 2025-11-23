package com.example.Photo_Gallary.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fileName;

    @Lob
    private String url; // path or download link
    private LocalDateTime uploadTime;

//        public Image(String fileName, String url) {
//            this.fileName = fileName;
//            this.url = url;
//            this.uploadTime = LocalDateTime.now();
//        }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(LocalDateTime uploadTime) {
        this.uploadTime = uploadTime;
    }
}


