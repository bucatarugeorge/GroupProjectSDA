package com.sda.grouproject.model;

import com.sda.grouproject.enums.AgeRestriction;
import com.sda.grouproject.enums.Exclusive;
import com.sda.grouproject.enums.Genre;

public class Game {

    private Integer id;
    private String name;
    private Double price;
    private String description;
    private Genre genre;
    private Exclusive exclusive;
    private Rating rating;
    private AgeRestriction ageRestriction;

}
