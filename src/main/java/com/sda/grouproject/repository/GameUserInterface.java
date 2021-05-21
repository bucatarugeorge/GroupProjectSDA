package com.sda.grouproject.repository;

import com.sda.grouproject.model.User;

import java.util.Scanner;

public class GameUserInterface {

    public void registerSave(User user)
    {
        Scanner scanner= new Scanner(System.in);
        registerUserName(user);
        registerEmail(user);
        System.out.println("Pasword:");
        user.setPassword(scanner.nextLine());
        UserRepository.getInstance().save(user);

    }

    public void logIn()
    {
        System.out.print("Welcome to GameShop: Register or Login.");
        //todo login functionality based on username or email
        System.out.println("Welcome to GameShop. Please select the Genre you wish to search.");
        //todo method that searches games from the database based on the user's input
    }

    private void registerUserName(User user)
    {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Username:");
        String usernameOption= scanner.nextLine();

        if(UserRepository.getInstance().findByUserName(usernameOption))
        {
            user.setUsername(usernameOption);
        }
        else
        {
            System.out.println("Username is already in use. Please introduce another.");
            registerUserName(user);
        }

    }

    private void registerEmail(User user)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Email:");
        String emailOption= scanner.nextLine();

        if(UserRepository.getInstance().findByEmail(emailOption))
        {
            user.setEmail(emailOption);
        }
        else
        {
            System.out.println("Email is already in use. Please introduce another.");
            registerEmail(user);
        }
    }
}
