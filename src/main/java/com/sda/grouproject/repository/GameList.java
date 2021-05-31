package com.sda.grouproject.repository;

import com.sda.grouproject.enums.AgeRestriction;
import com.sda.grouproject.enums.Exclusive;
import com.sda.grouproject.enums.Genre;
import com.sda.grouproject.model.Developer;
import com.sda.grouproject.model.Game;
import com.sda.grouproject.model.Publisher;

public class GameList {
    public static void  addItemsToDatabase() {

        Developer developer1 = new Developer("ABCD");
        DeveloperRepository.getInstance().save(developer1);

        Developer developer2 = new Developer("Bungie");
        DeveloperRepository.getInstance().save(developer2);

        Developer developer3 = new Developer("Mojang");
        DeveloperRepository.getInstance().save(developer3);

        Developer developer4 = new Developer("Engine Software");
        DeveloperRepository.getInstance().save(developer4);

        Developer developer5 = new Developer("Blizzard Entertainment");
        DeveloperRepository.getInstance().save(developer5);

        Developer developer6 = new Developer("Square Enix");
        DeveloperRepository.getInstance().save(developer6);

        Developer developer7 = new Developer("SkyBox Labs");
        DeveloperRepository.getInstance().save(developer7);

        Developer developer8 = new Developer("Shiro Games");
        DeveloperRepository.getInstance().save(developer8);

        Developer developer9 = new Developer("Cavedog Entertainment");
        DeveloperRepository.getInstance().save(developer9);

        Developer developer10 = new Developer("Infinity Ward");
        DeveloperRepository.getInstance().save(developer10);

        Developer developer11 = new Developer("id Software");
        DeveloperRepository.getInstance().save(developer11);

        Developer developer12 = new Developer("Valve Corporation");
        DeveloperRepository.getInstance().save(developer12);

        Developer developer13 = new Developer("Riot Games");
        DeveloperRepository.getInstance().save(developer13);

        Developer developer14 = new Developer("Motiga");
        DeveloperRepository.getInstance().save(developer14);

        Developer developer15 = new Developer("Bethesda Game");
        DeveloperRepository.getInstance().save(developer15);

        Developer developer16 = new Developer("CD Projekt");
        DeveloperRepository.getInstance().save(developer16);

        Developer developer17 = new Developer("Haemimont Games");
        DeveloperRepository.getInstance().save(developer17);

        Developer developer18 = new Developer("Lesta Studio");
        DeveloperRepository.getInstance().save(developer18);

        Developer developer19 = new Developer("Hempuli Oy");
        DeveloperRepository.getInstance().save(developer19);

        Developer developer20 = new Developer("Level-5");
        DeveloperRepository.getInstance().save(developer20);

        Developer developer21 = new Developer("Devoler Digital");
        DeveloperRepository.getInstance().save(developer21);

        Developer developer22 = new Developer("Nintendo EPD");
        DeveloperRepository.getInstance().save(developer22);

        Developer developer23 = new Developer("Rockstar Studios");
        DeveloperRepository.getInstance().save(developer23);

        Developer developer24 = new Developer("Ubisoft Montreal");
        DeveloperRepository.getInstance().save(developer24);

        Developer developer25 = new Developer("Double Moose");
        DeveloperRepository.getInstance().save(developer25);

        Developer developer26 = new Developer("Systemic Reaction");
        DeveloperRepository.getInstance().save(developer26);

        Developer developer27 = new Developer("Standing Stone Games");
        DeveloperRepository.getInstance().save(developer27);

        Developer developer28 = new Developer("Gibier Games");
        DeveloperRepository.getInstance().save(developer28);

        Developer developer29 = new Developer("Tango Gameworks");
        DeveloperRepository.getInstance().save(developer29);

        Developer developer30 = new Developer("Team Salvato");
        DeveloperRepository.getInstance().save(developer30);

        Developer developer31 = new Developer("Behaviour Interactive");
        DeveloperRepository.getInstance().save(developer31);

        Developer developer32 = new Developer("Virgin Interactive");
        DeveloperRepository.getInstance().save(developer32);

        Developer developer33 = new Developer("Yacht Club Games");
        DeveloperRepository.getInstance().save(developer33);

        Developer developer34 = new Developer("HAL Laboratory");
        DeveloperRepository.getInstance().save(developer34);

        Publisher publisher1 = new Publisher("EFGH");
        PublisherRepository.getInstance().save(publisher1);

        Publisher publisher2 = new Publisher("Bungie");
        PublisherRepository.getInstance().save(publisher2);

        Publisher publisher3 = new Publisher("Mojang Studios");
        PublisherRepository.getInstance().save(publisher3);

        Publisher publisher4 = new Publisher("505 Games");
        PublisherRepository.getInstance().save(publisher4);

        Publisher publisher5 = new Publisher("Vivendi Universal");
        PublisherRepository.getInstance().save(publisher5);

        Publisher publisher6 = new Publisher("Square Enix");
        PublisherRepository.getInstance().save(publisher6);

        Publisher publisher7 = new Publisher("Xbox Game Studios");
        PublisherRepository.getInstance().save(publisher7);

        Publisher publisher8 = new Publisher("Shiro Games");
        PublisherRepository.getInstance().save(publisher8);

        Publisher publisher9 = new Publisher("Wargaming.net");
        PublisherRepository.getInstance().save(publisher9);

        Publisher publisher10 = new Publisher("Activision");
        PublisherRepository.getInstance().save(publisher10);

        Publisher publisher11 = new Publisher("Bethesda Softworks");
        PublisherRepository.getInstance().save(publisher11);

        Publisher publisher12 = new Publisher("Sierra Entertainment");
        PublisherRepository.getInstance().save(publisher12);

        Publisher publisher13 = new Publisher("Garena");
        PublisherRepository.getInstance().save(publisher13);

        Publisher publisher14 = new Publisher("Perfect World Entertainment");
        PublisherRepository.getInstance().save(publisher14);

        Publisher publisher15 = new Publisher("Valve");
        PublisherRepository.getInstance().save(publisher15);

        Publisher publisher16 = new Publisher("CD Projekt");
        PublisherRepository.getInstance().save(publisher16);

        Publisher publisher17 = new Publisher("Paradox Interactive");
        PublisherRepository.getInstance().save(publisher17);

        Publisher publisher18 = new Publisher("Hempuli Oy");
        PublisherRepository.getInstance().save(publisher18);

        Publisher publisher19 = new Publisher("Level-5");
        PublisherRepository.getInstance().save(publisher19);

        Publisher publisher20 = new Publisher("Setordub");
        PublisherRepository.getInstance().save(publisher20);

        Publisher publisher21 = new Publisher("Nintendo");
        PublisherRepository.getInstance().save(publisher21);

        Publisher publisher22 = new Publisher("Rockstar Games");
        PublisherRepository.getInstance().save(publisher22);

        Publisher publisher23 = new Publisher("Ubisoft");
        PublisherRepository.getInstance().save(publisher23);

        Publisher publisher24 = new Publisher("Curve Digital");
        PublisherRepository.getInstance().save(publisher24);

        Publisher publisher25 = new Publisher("Avalanche Studios");
        PublisherRepository.getInstance().save(publisher25);

        Publisher publisher26 = new Publisher("Standing Stone Games");
        PublisherRepository.getInstance().save(publisher26);

        Publisher publisher27 = new Publisher("Playism");
        PublisherRepository.getInstance().save(publisher27);

        Publisher publisher28 = new Publisher("Team Salvato");
        PublisherRepository.getInstance().save(publisher28);

        Publisher publisher29 = new Publisher("Virgin Interactive");
        PublisherRepository.getInstance().save(publisher29);

        Publisher publisher30 = new Publisher("Yacht Club Games");
        PublisherRepository.getInstance().save(publisher30);

        Game game1 = new Game("Cyberpunk 2077", 60.0, "Dissapointment", Genre.SANDBOX, Exclusive.ALL, 3, AgeRestriction.MATURE, publisher1, developer1);
        game1.setTotalRatingSum(10);
        game1.setRatingCount(4);
        GameRepository.getInstance().save(game1);

        Game game2 = new Game("Destiny 2", 60.0, "Depression", Genre.MMORPG, Exclusive.ALL, 5, AgeRestriction.TEEN, publisher2, developer2);
        game2.setTotalRatingSum(25);
        game2.setRatingCount(5);
        GameRepository.getInstance().save(game2);

        Game game3 = new Game("Minecraft", 20.0, "Weird", Genre.SANDBOX, Exclusive.ALL, 4, AgeRestriction.EVERYONE, publisher3, developer3);
        game3.setTotalRatingSum(50);
        game3.setRatingCount(20);
        GameRepository.getInstance().save(game3);

        Game game4 = new Game("Terraria", 25.0, "Positive", Genre.SANDBOX, Exclusive.ALL, 5, AgeRestriction.EVERYONE, publisher4, developer4);
        game4.setTotalRatingSum(40);
        game4.setRatingCount(15);
        GameRepository.getInstance().save(game4);

        Game game5 = new Game("World of Warcraft", 40.0, "Excitement", Genre.MMORPG, Exclusive.PC, 5, AgeRestriction.EARLY_CHILDHOOD, publisher5, developer5);
        game5.setTotalRatingSum(30);
        game5.setRatingCount(5);
        GameRepository.getInstance().save(game5);

        Game game6 = new Game("Final Fantasy", 50.0, "Feelings", Genre.MMORPG, Exclusive.PS5, 4, AgeRestriction.TEEN, publisher6, developer6);
        game6.setTotalRatingSum(17);
        game6.setRatingCount(5);
        GameRepository.getInstance().save(game6);

        Game game7 = new Game("Age of Mythology", 35.0, "Historical", Genre.RTS, Exclusive.XBOX_X, 3, AgeRestriction.EARLY_CHILDHOOD, publisher7, developer7);
        game7.setTotalRatingSum(80);
        game7.setRatingCount(30);
        GameRepository.getInstance().save(game7);

        Game game8 = new Game("Northgard", 30.0, "Interesting", Genre.RTS, Exclusive.NINTENDO_SWITCH, 3, AgeRestriction.TEEN, publisher8, developer8);
        game8.setTotalRatingSum(25);
        game8.setRatingCount(6);
        GameRepository.getInstance().save(game8);

        Game game9 = new Game("Total Annihilation", 25.0, "Beginner", Genre.RTS, Exclusive.PC, 2, AgeRestriction.EARLY_CHILDHOOD, publisher9, developer9);
        game9.setTotalRatingSum(45);
        game9.setRatingCount(21);
        GameRepository.getInstance().save(game9);

        Game game10 = new Game("Call of Duty", 70.0, "Instinct", Genre.SHOOTERS, Exclusive.PC, 5, AgeRestriction.MATURE, publisher10, developer10);
        game10.setTotalRatingSum(20);
        game10.setRatingCount(20);
        GameRepository.getInstance().save(game10);

        Game game11 = new Game("Doom Eternal", 65.0, "Alone", Genre.SHOOTERS, Exclusive.ALL, 5, AgeRestriction.EVERYONE, publisher11, developer11);
        game11.setTotalRatingSum(90);
        game11.setRatingCount(20);
        GameRepository.getInstance().save(game11);

        Game game12 = new Game("Counter Strike", 55.0, "TeamWork", Genre.SHOOTERS, Exclusive.PC, 5, AgeRestriction.EARLY_CHILDHOOD, publisher12, developer12);
        game12.setTotalRatingSum(100);
        game12.setRatingCount(50);
        GameRepository.getInstance().save(game12);

        Game game13 = new Game("League of Legends", 0.0, "Strategy", Genre.MOBA, Exclusive.ALL, 5, AgeRestriction.TEEN, publisher13, developer13);
        game13.setTotalRatingSum(120);
        game13.setRatingCount(59);
        GameRepository.getInstance().save(game13);

        Game game14 = new Game("Gigantic", 45.0, "Abstract", Genre.MOBA, Exclusive.XBOX_X, 4, AgeRestriction.EARLY_CHILDHOOD, publisher14, developer14);
        game14.setTotalRatingSum(200);
        game14.setRatingCount(50);
        GameRepository.getInstance().save(game14);

        Game game15 = new Game("Dota 2", 0.0, "Competition", Genre.MOBA, Exclusive.PC, 3, AgeRestriction.TEEN, publisher15, developer12);
        game15.setTotalRatingSum(90);
        game15.setRatingCount(23);
        GameRepository.getInstance().save(game15);

        Game game16 = new Game("Oblivion", 50.0, "Medieval", Genre.RPG, Exclusive.PC, 4, AgeRestriction.EARLY_CHILDHOOD, publisher11, developer15);
        game16.setTotalRatingSum(300);
        game16.setRatingCount(69);
        GameRepository.getInstance().save(game16);

        Game game17 = new Game("The Witcher", 85.0, "Toss a Coin to Your Witcher", Genre.RPG, Exclusive.NINTENDO_SWITCH, 5, AgeRestriction.MATURE, publisher16, developer16);
        game17.setTotalRatingSum(420);
        game17.setRatingCount(69);
        GameRepository.getInstance().save(game17);

        Game game18 = new Game("Skyrim", 75.0, "Impressed", Genre.RPG, Exclusive.ALL, 5, AgeRestriction.TEEN, publisher11, developer15);
        game18.setTotalRatingSum(250);
        game18.setRatingCount(57);
        GameRepository.getInstance().save(game18);

        Game game19 = new Game("Gryphons and Gargoyles", 39.0, "Fear", Genre.SIMULATION, Exclusive.PS5, 4, AgeRestriction.EVERYONE, publisher6, developer6);
        game19.setTotalRatingSum(200);
        game19.setRatingCount(29);
        GameRepository.getInstance().save(game19);

        Game game20 = new Game("Surviving Mars", 25.0, "Interstellar", Genre.SIMULATION, Exclusive.ALL, 3, AgeRestriction.MATURE, publisher17, developer17);
        game20.setTotalRatingSum(690);
        game20.setRatingCount(120);
        GameRepository.getInstance().save(game20);

        Game game21 = new Game("World of Warships", 55.0, "Anger", Genre.SIMULATION, Exclusive.ALL, 1, AgeRestriction.ADULT, publisher9, developer18);
        game21.setTotalRatingSum(500);
        game21.setRatingCount(120);
        GameRepository.getInstance().save(game21);

        Game game22 = new Game("Baba Is You", 32.0, "What?", Genre.PUZZLER, Exclusive.NINTENDO_SWITCH, 3, AgeRestriction.TEEN, publisher18, developer19);
        game22.setTotalRatingSum(210);
        game22.setRatingCount(300);
        GameRepository.getInstance().save(game22);

        Game game23 = new Game("Laytons Mystery Journey", 29.0, "Conspiracy", Genre.PUZZLER, Exclusive.PC, 2, AgeRestriction.EVERYONE, publisher19, developer20);
        game23.setTotalRatingSum(9);
        game23.setRatingCount(4);
        GameRepository.getInstance().save(game23);

        Game game24 = new Game("Pikuniku", 20.0, "Nanii", Genre.PUZZLER, Exclusive.NINTENDO_SWITCH, 4, AgeRestriction.EARLY_CHILDHOOD, publisher20, developer21);
        game24.setTotalRatingSum(40);
        game24.setRatingCount(10);
        GameRepository.getInstance().save(game24);

        Game game25 = new Game("Super Mario Odyssey", 40.0, "Lost", Genre.ACTION, Exclusive.NINTENDO_SWITCH, 4, AgeRestriction.ADULT, publisher21, developer22);
        game25.setTotalRatingSum(250);
        game25.setRatingCount(150);
        GameRepository.getInstance().save(game25);

        Game game26 = new Game("Red Dead Redemption", 47.0, "Western", Genre.ACTION, Exclusive.PS5, 2, AgeRestriction.MATURE, publisher22, developer23);
        game26.setTotalRatingSum(260);
        game26.setRatingCount(140);
        GameRepository.getInstance().save(game26);

        Game game27 = new Game("Assassin Creed Valhalla", 62.0, "Innovative", Genre.ACTION, Exclusive.XBOX_X, 5, AgeRestriction.ADULT, publisher23, developer24);
        game27.setTotalRatingSum(290);
        game27.setRatingCount(120);
        GameRepository.getInstance().save(game27);

        Game game28 = new Game("The Legend of Zelda", 44.0, "Legendary", Genre.ADVENTURE, Exclusive.NINTENDO_SWITCH, 5, AgeRestriction.TEEN, publisher21, developer22);
        game28.setTotalRatingSum(900);
        game28.setRatingCount(599);
        GameRepository.getInstance().save(game28);

        Game game29 = new Game("GTA San Andreas", 66.0, "Mobster", Genre.ADVENTURE, Exclusive.ALL, 5, AgeRestriction.MATURE, publisher22, developer23);
        game29.setTotalRatingSum(1000);
        game29.setRatingCount(500);
        GameRepository.getInstance().save(game29);

        Game game30 = new Game("Just Die Already", 15.0, "Shiny", Genre.ADVENTURE, Exclusive.PC, 1, AgeRestriction.ADULT, publisher24, developer25);
        game30.setTotalRatingSum(300);
        game30.setRatingCount(150);
        GameRepository.getInstance().save(game30);

        Game game31 = new Game("Second Extinction", 22.0, "Dinosaurs", Genre.SURVIVAL, Exclusive.XBOX_X, 3, AgeRestriction.EARLY_CHILDHOOD, publisher25, developer26);
        game31.setTotalRatingSum(250);
        game31.setRatingCount(190);
        GameRepository.getInstance().save(game31);

        Game game32 = new Game("Dungeons & Dragons", 58.0, "Energy", Genre.SURVIVAL, Exclusive.PC, 5, AgeRestriction.MATURE, publisher26, developer27);
        game32.setTotalRatingSum(1800);
        game32.setRatingCount(500);
        GameRepository.getInstance().save(game32);

        Game game33 = new Game("Deeeer Simulator", 13.0, "Deerify", Genre.SURVIVAL, Exclusive.PC, 4, AgeRestriction.ADULT, publisher27, developer28);
        game33.setTotalRatingSum(520);
        game33.setRatingCount(200);
        GameRepository.getInstance().save(game33);

        Game game34 = new Game("The Evil Within", 33.0, "Hurtful", Genre.HORROR, Exclusive.ALL, 4, AgeRestriction.MATURE, publisher11, developer29);
        game34.setTotalRatingSum(999);
        game34.setRatingCount(290);
        GameRepository.getInstance().save(game34);

        Game game35 = new Game("Doki Doki Literature Club!", 41.0, "Kawaii", Genre.HORROR, Exclusive.PC, 5, AgeRestriction.ADULT, publisher28, developer30);
        game35.setTotalRatingSum(1999);
        game35.setRatingCount(350);
        GameRepository.getInstance().save(game35);

        Game game36 = new Game("Dead by Daylight", 66.0, "Deadly", Genre.HORROR, Exclusive.ALL, 3, AgeRestriction.ADULT, publisher4, developer31);
        game36.setTotalRatingSum(666);
        game36.setRatingCount(234);
        GameRepository.getInstance().save(game36);

        Game game37 = new Game("The Lion King", 10.0, "DOS needed", Genre.PLATFORMER, Exclusive.PC, 3, AgeRestriction.EVERYONE, publisher29, developer32);
        game37.setTotalRatingSum(200);
        game37.setRatingCount(69);
        GameRepository.getInstance().save(game37);

        Game game38 = new Game("Shovel Knight", 23.0, "CricketSound", Genre.PLATFORMER, Exclusive.PS5, 4, AgeRestriction.EARLY_CHILDHOOD, publisher30, developer33);
        game38.setTotalRatingSum(699);
        game38.setRatingCount(420);
        GameRepository.getInstance().save(game38);

        Game game39 = new Game("Kirby Star Allies", 17.0, "Poke-Distraction", Genre.PLATFORMER, Exclusive.NINTENDO_SWITCH, 3, AgeRestriction.TEEN, publisher21, developer34);
        game39.setTotalRatingSum(66);
        game39.setRatingCount(23);
        GameRepository.getInstance().save(game39);

    }
}
