package com.mig23catalog.entities.compactSubstations;

import com.mig23catalog.entities.enums.compactSubstationEnums.*;


import javax.persistence.*;

@Entity
@Table(name = "compact_substations")
public class CompactSubtation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    @Enumerated(EnumType.STRING)
    private SubstationType type;

    @Enumerated(EnumType.STRING)
    @Column(name = "service_type")
    private SubstationService serviceType;

    @Column(name = "download_link")
    private String downloadLink;

    @Column(name = "view_link")
    private String viewLink;

    @Enumerated (EnumType.STRING)
    private SubstationHeight height;

    @Enumerated (EnumType.STRING)
    private SubstationWidth width;

    @Enumerated (EnumType.STRING)
    private SubstationDepth depth;

    public CompactSubtation() {
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

    public SubstationType getType() {
        return type;
    }

    public void setType(SubstationType type) {
        this.type = type;
    }

    public SubstationService getServiceType() {
        return serviceType;
    }

    public void setServiceType(SubstationService serviceType) {
        this.serviceType = serviceType;
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

    public SubstationHeight getHeight() {
        return height;
    }

    public void setHeight(SubstationHeight height) {
        this.height = height;
    }

    public SubstationWidth getWidth() {
        return width;
    }

    public void setWidth(SubstationWidth width) {
        this.width = width;
    }

    public SubstationDepth getDepth() {
        return depth;
    }

    public void setDepth(SubstationDepth depth) {
        this.depth = depth;
    }
}
