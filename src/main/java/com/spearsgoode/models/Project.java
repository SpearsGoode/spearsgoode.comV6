package com.spearsgoode.models;

public class Project {
    private String title;   // Title of Project
    private String tag;     // Simple & Unique Tag (Used for src, id, etc)
    private String date;    // Date Completed
    private String img;     // Link to Image
    private String alt;     // Alt Text for SEO/accessibility
    private String link;    // Link to Project
    private String intro;   // Into Text for Project
    private String info;    // Content for Project Modal

    public Project(String title, String tag, String date, String img, String alt, String link, String intro, String info) {
        this.title = title;
        this.tag = tag;
        this.date = date;
        this.img = img;
        this.alt = alt;
        this.link = link;
        this.intro = intro;
        this.info = info;
    }

    /* ----------
        GETTERS
     */
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
