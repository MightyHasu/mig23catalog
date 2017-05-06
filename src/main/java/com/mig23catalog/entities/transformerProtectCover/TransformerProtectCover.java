package com.mig23catalog.entities.transformerProtectCover;


import com.mig23catalog.entities.enums.transformerProtectCoverEnums.TransformerProtectCoverHeight;
import com.mig23catalog.entities.enums.transformerProtectCoverEnums.TransformerProtectCoverWidth;
import com.mig23catalog.entities.enums.transformerProtectCoverEnums.TransformerProtectiveCoverDepth;

import javax.persistence.*;

@Entity
@Table(name = "transformer_protect_covers")
public class TransformerProtectCover {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    @Column(name = "download_link")
    private String downloadLink;

    @Column(name = "view_link")
    private String viewLink;

    @Enumerated (EnumType.STRING)
    private TransformerProtectCoverHeight height;

    @Enumerated (EnumType.STRING)
    private TransformerProtectCoverWidth width;

    @Enumerated (EnumType.STRING)
    private TransformerProtectiveCoverDepth depth;

    public TransformerProtectCover() {
    }

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

    public TransformerProtectCoverHeight getHeight() {
        return height;
    }

    public void setHeight(TransformerProtectCoverHeight height) {
        this.height = height;
    }

    public TransformerProtectCoverWidth getWidth() {
        return width;
    }

    public void setWidth(TransformerProtectCoverWidth width) {
        this.width = width;
    }

    public TransformerProtectiveCoverDepth getDepth() {
        return depth;
    }

    public void setDepth(TransformerProtectiveCoverDepth depth) {
        this.depth = depth;
    }
}
