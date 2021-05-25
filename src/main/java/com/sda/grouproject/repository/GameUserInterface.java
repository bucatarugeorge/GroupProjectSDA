package com.sda.grouproject.repository;

import com.sda.grouproject.enums.Exclusive;
import com.sda.grouproject.enums.Genre;
import com.sda.grouproject.model.Game;
import com.sda.grouproject.model.User;
import com.sda.grouproject.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameUserInterface {

    String FIND_BY_DEVELOPER= "from Game g WHERE g.developer.developerName =";
    String FIND_BY_PUBLISHER= "from Game g WHERE g.publisher.publisherName =";
    String FIND_BY_NAME= "from Game g WHERE g.name =";
    String FIND_BY_EXCLUSIVE= "from Game g WHERE g.exclusive =";
    String FIND_BY_GENRE= "from Game g WHERE g.genre =";
    String FIND_BY_RATING= "from Game g WHERE g.rating >=";
    String FIND_ALL_GAMES= "from Game";

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
            if (!UserRepository.getInstance().findByColumn("username",usernameOrEmail)
                    || !UserRepository.getInstance().findByColumn("email",usernameOrEmail))
            {
                System.out.println("Please introduce your password:");
                String password= scanner.nextLine();
                if(!UserRepository.getInstance().checkPassword(password)) {
                    System.out.println(usernameOrEmail + " welcome to GameShop.");
                }
            }
            else
            {
                System.out.println("Something went wrong, check your credentials.");
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

        if(UserRepository.getInstance().findByColumn("username",usernameOption))
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

        if(UserRepository.getInstance().findByColumn("email",emailOption))
        {
            user.setEmail(emailOption);
        }
        else
        {
            System.out.println("Email is already in use. Please introduce another.");
            registerEmail(user);
        }
    }

    //todo method that searches games from the database based on the user's input

    private List<Game> findByGameColumnName(String findBy, String object)
    {
            Session session = SessionManager.getSessionFactory().openSession();
            String genreQuery= findBy+ " '" + object+ "' ";
            Query<Game> gameQuery= session.createQuery(genreQuery);
            List<Game> gameList=gameQuery.list();
            System.out.println(gameList);
            session.close();
            return gameList;
    }

    public List<Game> findGames() {
        System.out.println("Please select a number from 1 to 9.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Game> games= new ArrayList<>();
        switch (number) {
            case 1:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Find By developer name. Please input one.");
                games = findByGameColumnName(FIND_BY_DEVELOPER, scanner2.nextLine());
                break;
            case 2:
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Find by publisher name.");
                games=findByGameColumnName(FIND_BY_PUBLISHER, scanner3.nextLine());
                break;
            case 3:
                Scanner scanner4 = new Scanner(System.in);
                System.out.println("Find by game name.");
                games=findByGameColumnName(FIND_BY_NAME, scanner4.nextLine());
                break;
            case 4:
                Scanner scanner5 = new Scanner(System.in);
                System.out.println("Find by genre");
                games=findByGameColumnName(FIND_BY_GENRE, scanner5.nextLine());
                break;
            case 5:
                Scanner scanner6 = new Scanner(System.in);
                System.out.println("Find by exclusives");
                games=findByGameColumnName(FIND_BY_EXCLUSIVE, scanner6.nextLine());
                break;
            case 6:
                Scanner scanner7 = new Scanner(System.in);
                System.out.println("Find by rating");
                games=findByGameColumnName(FIND_BY_RATING, scanner7.nextLine());
                break;
            case 7:
                Scanner scanner8 = new Scanner(System.in);
                System.out.println("Show all games.");
                games=findByGameColumnName(FIND_ALL_GAMES, "");
                break;
            default:
                System.out.println("YO DAWG, I SAID NUMBERS.");
                findGames();
                break;
        }
        return games;
    }
}
