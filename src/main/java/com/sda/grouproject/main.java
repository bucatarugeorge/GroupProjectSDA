package com.sda.grouproject;

import com.sda.grouproject.enums.AgeRestriction;
import com.sda.grouproject.enums.Exclusive;
import com.sda.grouproject.enums.Genre;
import com.sda.grouproject.model.Developer;
import com.sda.grouproject.model.Game;
import com.sda.grouproject.model.Publisher;
import com.sda.grouproject.model.User;
import com.sda.grouproject.repository.*;
import com.sda.grouproject.utils.SessionManager;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        DeveloperRepository developerRepository= new DeveloperRepository();
        PublisherRepository publisherRepository= new PublisherRepository();
        GameRepository gameRepository= new GameRepository();

        User user1= new User("bigPePeEnergy69", "bibPP420@gmail.smokeit","123456");
        Developer developer1= new Developer("ABCD");
        Publisher publisher1= new Publisher("EFGH");

        UserRepository.getInstance().save(user1);
        developerRepository.save(developer1);
        publisherRepository.save(publisher1);

        User user= new User();

        GameUserInterface gameUserInterface= new GameUserInterface();
        //gameUserInterface.registerSave(user);


        Game game1= new Game("Cyberpunk 2077", 60.0,"Dissapointment", Genre.SANDBOX,
                Exclusive.ALL,3, AgeRestriction.MATURE);
        gameRepository.save(game1);

        gameUserInterface.logIn();
        Scanner scanner= new Scanner(System.in);
        SessionManager.shutDown();
    }
}
