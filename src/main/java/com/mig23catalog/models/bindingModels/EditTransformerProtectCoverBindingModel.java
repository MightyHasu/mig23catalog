package com.mig23catalog.models.bindingModels;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EditTransformerProtectCoverBindingModel {

    private long id;

    @NotNull
    @Size(min = 5, max = 300, message = "Invalid description! Description must be between 5 and 300 symbols.")
    private String description;

    @NotNull
    @Pattern(regexp = "^https:\\/\\/drive\\.google\\.com\\/open\\/?(.*)", message = "Invalid download link!")
    private String downloadLink;

    @NotNull
    @Pattern(regexp = "^https:\\/\\/drive\\.google\\.com\\/open\\/?(.*)", message = "Invalid view link!")
    private String viewLink;

    @NotNull(message = "Height cannot be null!")
    private String height;

    @NotNull(message = "Width cannot be null!")
    private String width;

    @NotNull(message = "Depth cannot be null!")
    private String depth;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public String getViewLink() {
        return viewLink;
    }

    public void setViewLink(String viewLink) {
        this.viewLink = viewLink;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }
}
