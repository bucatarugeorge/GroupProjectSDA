package com.sda.grouproject.model;

import javax.persistence.*;

@Entity
@Table(name = "developers")
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "developer_id")
    private Integer developerId;
    @Column(name ="developer_name")
    private String developerName;

    public Developer(String name) {
        this.developerName = name;
    }

    public Developer() {
    }

    public Integer getId() {
        return developerId;
    }

    public void setId(Integer id) {
        this.developerId = id;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String name) {
        this.developerName = name;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + developerId +
                ", name='" + developerName + '\'' +
                '}';
    }
}
