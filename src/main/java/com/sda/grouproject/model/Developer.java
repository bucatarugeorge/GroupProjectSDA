package com.sda.grouproject.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "developers")
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "developer_id")
    private Integer developerId;
    @Column(name ="developer_name")
    private String developerName;
    @OneToMany(mappedBy = "developer")
    private List<Game> gameList;

    public Developer(String name) {
        this.developerName = name;
    }

    public Developer() {
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String name) {
        this.developerName = name;
    }

    public Integer getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Integer developerId) {
        this.developerId = developerId;
    }

    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + developerId +
                ", name='" + developerName + '\'' +
                '}';
    }
}
