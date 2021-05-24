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

    public void logIn() {
//        System.out.print("Welcome to GameShop: Register or Login.");
//        //todo login functionality based on username or email
//        System.out.println("Welcome to GameShop. Please select the Genre you wish to search.");
//        //todo method that searches games from the database based on the user's input

        System.out.print("Welcome to GameShop: Register or Login?:");
        Scanner scanner = new Scanner(System.in);
        String chosenOption = scanner.nextLine();
        if (chosenOption.equals("Register")) {
            User user= new User();
            registerSave(user);
            logIn();
        } else if (chosenOption.equals("Login")) {
            System.out.println("Please introduce your username or email:");
            String usernameOrEmail = scanner.nextLine();
            if (!(UserRepository.getInstance().findByUserName(usernameOrEmail)
                    || UserRepository.getInstance().findByEmail(usernameOrEmail)))
            {
                System.out.println("Please introduce your password:");
                String password= scanner.nextLine();
                if(!UserRepository.getInstance().checkPassword(password)) {
                    System.out.println(usernameOrEmail + " welcome to GameShop. Please select the Genre you wish to search.");
                }
            }
            else
            {
                System.out.println("You done fucked it up mate, something's wrong with your credentials.");
                logIn();
            }
        } else {
            System.out.println("The option introduced is incorrect!");
        }

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
