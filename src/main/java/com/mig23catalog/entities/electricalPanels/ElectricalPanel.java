package com.mig23catalog.entities.electricalPanels;

import com.mig23catalog.entities.enums.electricalPanelEnums.ElectricalPanelDepth;
import com.mig23catalog.entities.enums.electricalPanelEnums.ElectricalPanelHeight;
import com.mig23catalog.entities.enums.electricalPanelEnums.ElectricalPanelType;
import com.mig23catalog.entities.enums.electricalPanelEnums.ElectricalPanelWidth;

import javax.persistence.*;

@Entity
@Table(name = "electrical_panels")
public class ElectricalPanel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    @Enumerated (EnumType.STRING)
    private ElectricalPanelType type;

    @Column(name = "download_link")
    private String downloadLink;

    @Column(name = "view_link")
    private String viewLink;

    @Enumerated (EnumType.STRING)
    private ElectricalPanelHeight height;

    @Enumerated (EnumType.STRING)
    private ElectricalPanelWidth width;

    @Enumerated (EnumType.STRING)
    private ElectricalPanelDepth depth;

    public ElectricalPanel() {
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

    public ElectricalPanelType getType() {
        return type;
    }

    public void setType(ElectricalPanelType type) {
        this.type = type;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public ElectricalPanelHeight getHeight() {
        return height;
    }

    public void setHeight(ElectricalPanelHeight height) {
        this.height = height;
    }

    public ElectricalPanelWidth getWidth() {
        return width;
    }

    public void setWidth(ElectricalPanelWidth width) {
        this.width = width;
    }

    public ElectricalPanelDepth getDepth() {
        return depth;
    }

    public void setDepth(ElectricalPanelDepth depth) {
        this.depth = depth;
    }

    public void setViewLink(String viewLink) {
        this.viewLink = viewLink;
    }

    public String getViewLink() {
        return null;
    }
}
