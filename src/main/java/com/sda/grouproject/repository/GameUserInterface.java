package com.sda.grouproject.repository;

import com.sda.grouproject.model.User;

import java.util.Scanner;

public class GameUserInterface {


    public void registerByUserName()
    {

        Scanner scanner= new Scanner(System.in);
        User user= new User();
        System.out.println("Username:");
        String usernameOption= scanner.nextLine();

        if(UserRepository.getInstance().findByUserName(usernameOption))
        {
            user.setUsername(usernameOption);
        }
        else
        {
            System.out.println("Username is already in use. Please introduce another.");
            registerByUserName();
        }
        System.out.println("Email:");
        user.setEmail(scanner.nextLine());
        System.out.println("Password");
        user.setPassword(scanner.nextLine());
        UserRepository.getInstance().save(user);

    }
}
