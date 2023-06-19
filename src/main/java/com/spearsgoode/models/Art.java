package com.spearsgoode.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Art {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String medium;
    private String link;
    private String type;
    private String category;
    private double height;
    private double width;
    private boolean feature;

    /* ----------
    CONSTRUCTORS
   */
    public Art() {}

    public Art(String title, String medium, String link, String type, String category, double height, double width, boolean feature) {
        this.title = title;
        this.medium = medium;
        this.link = link;
        this.type = type;
        this.category = category;
        this.height = height;
        this.width = width;
        this.feature = feature;
    }

    /* ----------
    GETTERS
    */

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMedium() {
        return medium;
    }

    public String getLink() {
        return link;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public boolean getFeature() {
        return feature;
    }

    /* ----------
    SETTERS
    */

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setFeature(boolean feature) {
        this.feature = feature;
    }
}
