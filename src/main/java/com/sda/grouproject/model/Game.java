package com.sda.grouproject.model;

import com.sda.grouproject.enums.AgeRestriction;
import com.sda.grouproject.enums.Exclusive;
import com.sda.grouproject.enums.Genre;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    private Integer gameId;
    @Column(name = "game_name")
    private String gameName;
    @Column(name = "price")
    private Double price;
    @Column(name = "description")
    private String description;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @Enumerated(EnumType.STRING)
    private Exclusive exclusive;
    @Column(name = "rating")
    private double rating;
    @Enumerated(EnumType.STRING)
    private AgeRestriction ageRestriction;
    @Column(name = "rating_count")
    private int ratingCount;
    private int totalRatingSum;

    @ManyToOne
    @JoinColumn(name = "developer_id")
    private Developer developer;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @ManyToMany
    @JoinTable(name = "shopping_cart",
    joinColumns ={@JoinColumn(name = "game_id")},
    inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private Set<User> userSet= new HashSet<>();

    public Game(String gameName, Double price, String description, Genre genre,
                Exclusive exclusive, int rating, AgeRestriction ageRestriction, Publisher publisher, Developer developer) {
        this.gameName = gameName;
        this.price = price;
        this.description = description;
        this.genre = genre;
        this.exclusive = exclusive;
        this.rating = rating;
        this.ageRestriction = ageRestriction;
        this.publisher= publisher;
        this.developer= developer;
    }

    public Game() {
    }


    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Exclusive getExclusive() {
        return exclusive;
    }

    public void setExclusive(Exclusive exclusive) {
        this.exclusive = exclusive;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(AgeRestriction ageRestriction) {
        this.ageRestriction = ageRestriction;
    }


    public Integer getTotalRatingSum() {
        return totalRatingSum;
    }

    public void setTotalRatingSum(Integer totalRatingSum) {
        this.totalRatingSum = totalRatingSum;
    }

    public void setTotalRatingSum(int totalRatingSum) {
        this.totalRatingSum = totalRatingSum;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    @Override
    public String toString() {
        return   gameName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", publisher= "+ publisher.getPublisherName()+
                ", developer= "+ developer.getDeveloperName()+
                ", genre=" + genre +
                ", exclusive=" + exclusive +
                ", rating=" + rating +
                ", ratings=" + ratingCount +
                ", ageRestriction=" + ageRestriction +
                '\n';
    }
}
