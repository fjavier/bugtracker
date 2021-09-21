package com.learning.bugtracker.entity;

import javax.persistence.*;

@Entity
@Table(name = "application")
public class ApplicationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String appName;

    @Column(length = 2000)
    private String owner;

    private String description;

    public ApplicationEntity(String appName, String owner, String description) {
        this.appName = appName;
        this.owner = owner;
        this.description = description;
    }

    public ApplicationEntity(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", name='" + appName + '\'' +
                ", owner=" + owner +
                ", description='" + description + '\'' +
                '}';
    }
}
