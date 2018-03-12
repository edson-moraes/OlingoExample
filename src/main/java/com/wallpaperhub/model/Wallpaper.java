package com.wallpaperhub.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sun.istack.internal.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public class Wallpaper {

    @Id
    @NotNull
    private long id;

    @NotNull
    private int width;

    @NotNull
    private int length;

    @NotNull
    private WallpaperCategory category;

    @NotNull
    private Calendar uploadedAt;

    @NotNull
    private long uploader;

    @NotNull
    private String filePath;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
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

    public long getUploader() {
        return uploader;
    }

    public void setUploader(long uploader) {
        this.uploader = uploader;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}
