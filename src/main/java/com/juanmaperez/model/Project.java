package com.juanmaperez.model;

import com.sun.deploy.cache.SignedAsBlobJarFile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Blob;

@Entity
public class Project {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String url_github;
    private String url_playstore;
    private Blob image_1;
    private Blob image_2;
    private Blob image_3;
    private Blob image_4;

    public Project() {
    }

    public Project(String title) {

    }
}
