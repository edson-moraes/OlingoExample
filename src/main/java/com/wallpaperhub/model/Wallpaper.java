package com.wallpaperhub.model;

import com.wallpaperhub.enums.WallpaperCategory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public class Wallpaper {

    @Id
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private Integer width;

    @Column(nullable = false)
    private Integer length;

    @Column(nullable = false)
    private WallpaperCategory category;

    @Column(nullable = false)
    private Calendar uploadedAt;

    @Column(nullable = false)
    private Long uploader;

    @Column(nullable = false)
    private String filePath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public WallpaperCategory getCategory() {
        return category;
    }

    public void setCategory(WallpaperCategory category) {
        this.category = category;
    }

    public Calendar getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(Calendar uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

    public Long getUploader() {
        return uploader;
    }

    public void setUploader(Long uploader) {
        this.uploader = uploader;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}
