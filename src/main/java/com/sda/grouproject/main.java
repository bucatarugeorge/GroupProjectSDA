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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        GameUserInterface gameUserInterface = new GameUserInterface();

//        try {
//            File myObj = new File("E:\\SDA WORK/GameDatabase.txt");
//            Scanner myReader = new Scanner(myObj);
//            myReader.useDelimiter("-");
//            Set<Game> gameSet= new HashSet<>();
//            while (myReader.hasNextLine()) {
//                String gameName = myReader.nextLine();
//                double gamePrice= myReader.nextDouble();
//                String gameDescription= myReader.nextLine();
//                Genre gameGenre= Genre.valueOf(myReader.nextLine());
//                Exclusive gameExclusive= Exclusive.valueOf(myReader.nextLine());
//                int gameRating= myReader.nextInt();
//                AgeRestriction gameAgeRestriction= AgeRestriction.valueOf(myReader.nextLine());
//                Game game = new Game(gameName, gamePrice, gameDescription, gameGenre, gameExclusive,gameRating, gameAgeRestriction);
//                gameSet.add(game);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }

        Scanner scanner= new Scanner(System.in);
        GameList.addItemsToDatabase();
        do {
            GameUserInterface.logIn();
            List<Game> listOfGamesInShoppingCart = gameUserInterface.addGamesToShoppingCartAndPay(gameUserInterface.findGames());
            if (!listOfGamesInShoppingCart.isEmpty()) {
                gameUserInterface.rateGames(listOfGamesInShoppingCart);
            }
        }
        while(!scanner.nextLine().equals("Exit"));
        SessionManager.shutDown();
    }
}
