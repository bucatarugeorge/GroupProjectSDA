package com.sda.grouproject.repository;

import com.sda.grouproject.enums.Genre;
import com.sda.grouproject.model.Developer;
import com.sda.grouproject.model.Game;
import com.sda.grouproject.model.User;
import com.sda.grouproject.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
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
            if (!UserRepository.getInstance().findByUserName(usernameOrEmail)
                    || !UserRepository.getInstance().findByEmail(usernameOrEmail))
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

    //todo method that searches games from the database based on the user's input

    private List<Game> findByGenre(Genre genre)
    {
            Session session = SessionManager.getSessionFactory().openSession();
            String genreQuery= "from Game g WHERE g.genre = :genre ";
            Query<Game> gameQuery= session.createQuery(genreQuery);
            gameQuery.setParameter("genre", genre);
            List<Game> gameList=gameQuery.list();
            System.out.println(gameList);
            session.close();
            return gameList;
    }

    private List<Game> findByDeveloper(Developer developer)
    {

    }


    private List<Game> findByPublisher()
    {

    }

    private List<Game> findByExclusive()
    {

    }

    private List<Game> findByRating()
    {

    }

    public List<Game> findGames(int number)
    {
        System.out.println("Please select ");
        Scanner scanner= new Scanner(System.in);
        number= scanner.nextInt();
        switch(number) {
            case 1:
                findByGenre(Genre.valueOf(scanner.nextLine()));
                break;
            case 2:
        }
    }
}
