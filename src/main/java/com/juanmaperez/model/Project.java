package com.juanmaperez.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String url_github;
    private String url_playstore;
    private String image_1;
    private String image_2;
    private String image_3;
    private String image_4;


    public Project() { }

    public Project(String title, String description, String url_github, String url_playstore,
                   String image_1, String image_2, String image_3, String image_4) {

        this.title = title;
        this.description = description;
        this.url_github = url_github;
        this.url_playstore = url_playstore;
        this.image_1 = image_1;
        this.image_2 = image_2;
        this.image_3 = image_3;
        this.image_4 = image_4;
    }

    public Project(Long id, String title, String description, String url_github, String url_playstore,
                   String image_1, String image_2, String image_3, String image_4) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.url_github = url_github;
        this.url_playstore = url_playstore;
        this.image_1 = image_1;
        this.image_2 = image_2;
        this.image_3 = image_3;
        this.image_4 = image_4;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl_github() {
        return url_github;
    }

    public void setUrl_github(String url_github) {
        this.url_github = url_github;
    }

    public String getUrl_playstore() {
        return url_playstore;
    }

    public void setUrl_playstore(String url_playstore) {
        this.url_playstore = url_playstore;
    }

    public String getImage_1() {
        return image_1;
    }

    public void setImage_1(String image_1) {
        this.image_1 = image_1;
    }

    public String getImage_2() {
        return image_2;
    }

    public void setImage_2(String image_2) {
        this.image_2 = image_2;
    }

    public String getImage_3() {
        return image_3;
    }

    public void setImage_3(String image_3) {
        this.image_3 = image_3;
    }

    public String getImage_4() {
        return image_4;
    }

    public void setImage_4(String image_4) {
        this.image_4 = image_4;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
