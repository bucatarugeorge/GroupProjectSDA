package com.sda.grouproject;

import com.sda.grouproject.model.Developer;
import com.sda.grouproject.model.Publisher;
import com.sda.grouproject.model.User;
import com.sda.grouproject.repository.DeveloperRepository;
import com.sda.grouproject.repository.GameUserInterface;
import com.sda.grouproject.repository.PublisherRepository;
import com.sda.grouproject.repository.UserRepository;
import com.sda.grouproject.utils.SessionManager;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        DeveloperRepository developerRepository= new DeveloperRepository();
        PublisherRepository publisherRepository= new PublisherRepository();

        User user1= new User("bigPePeEnergy69", "bibPP420@gmail.smokeit","123456");
        Developer developer1= new Developer("ABCD");
        Publisher publisher1= new Publisher("EFGH");

        UserRepository.getInstance().save(user1);
        developerRepository.save(developer1);
        publisherRepository.save(publisher1);

        User user= new User();

        GameUserInterface gameUserInterface= new GameUserInterface();
        gameUserInterface.registerSave(user);

        gameUserInterface.logIn();

        SessionManager.shutDown();
    }
}
