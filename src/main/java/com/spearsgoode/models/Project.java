package com.spearsgoode.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;   // Title of Project
    private String tag;     // Simple & Unique Tag (Used for src, id, etc)
    private String date;    // Date Completed
    private String img;     // Link to Image
    private String alt;     // Alt Text for SEO/accessibility
    private String link;    // Link to Project
    private String intro;   // Into Text for Project
    private String info;    // Content for Project Modal

    /* ----------
        GETTERS
     */
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTag() {
        return tag;
    }

    public String getDate() {
        return date;
    }

    public String getImg() {
        return img;
    }

    public String getAlt() {
        return alt;
    }

    public String getLink() {
        return link;
    }

    public String getIntro() {
        return intro;
    }

    public String getInfo() {
        return info;
    }

    /* ----------
        SETTERS
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
