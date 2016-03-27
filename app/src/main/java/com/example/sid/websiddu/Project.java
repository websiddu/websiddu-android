package com.example.sid.websiddu;

import java.io.Serializable;
import java.util.ArrayList;

public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    private Id id;
    private String thumbnail;
    private String banner;
    private String title;
    private Integer sequence;
    private Integer votes;
    private Boolean isActive;
    private String description;
    private String size;
    private String shortDescription;
    private String skills;
    private String screenshots;
    private Project nextProject;
    private Project previousProject;
    private String projectUrl;

    public String getProjectUrl() {
        return projectUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public Integer getSequence() {
        return sequence;
    }

    public Integer getVotes() {
        return votes;
    }


    public Boolean getActive() {
        return isActive;
    }

    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getSkills() {
        return skills;
    }

    public String getScreenshots() {
        return screenshots;
    }

    public Project getNextProject() {
        return nextProject;
    }

    public Project getPreviousProject() {
        return previousProject;
    }

    public String getBanner() {
        return this.banner;

    }

    public Id getId() {
        return this.id;
    }

    public String getContent() {
        return this.thumbnail;
    }

}

