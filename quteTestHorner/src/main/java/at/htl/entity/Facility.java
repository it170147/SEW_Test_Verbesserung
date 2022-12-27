package at.htl.entity;

import javax.persistence.*;

public class Facility {


    private Long id;

    private String name;
    private String description;
    @Column(name = "AREA_WIDTH")
    private int areaWidth;
    @Column(name = "AREA_HEIGHT")
    private int areaHeight;

    public Facility(String name, String description, int areaWidth, int areaHeight) {
        this.name = name;
        this.description = description;
        this.areaWidth = areaWidth;
        this.areaHeight = areaHeight;
    }

    public Facility() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public int getAreaWidth() {
        return areaWidth;
    }

    public void setAreaWidth(int areaWidth) {
        this.areaWidth = areaWidth;
    }

    public int getAreaHeight() {
        return areaHeight;
    }

    public void setAreaHeight(int areaHeight) {
        this.areaHeight = areaHeight;
    }

    @Override
    public String toString() {
        return String.format("%d: %s", getId(), getName());
    }
}
