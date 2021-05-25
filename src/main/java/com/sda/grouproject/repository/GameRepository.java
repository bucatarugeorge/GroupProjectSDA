package com.sda.grouproject.repository;

import com.sda.grouproject.model.Developer;
import com.sda.grouproject.model.Game;
import com.sda.grouproject.model.User;
import com.sda.grouproject.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.NoResultException;

public class GameRepository extends GenericRepository {

    public Game findById(Integer id)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Game game  = session.find(Game.class, id);
        session.close();
        return game;
    }


    public Game findByGameName(String gameName)
    {
        try {
            Session session = SessionManager.getSessionFactory().openSession();
            String findByGameNameQuerry = "from Game g where g.gameName=: gameName";
            Query<Game> gameQuery = session.createQuery(findByGameNameQuerry);
            gameQuery.setParameter("gameName", gameName);
            Game game = gameQuery.getSingleResult();
            session.close();
            return game;
        }
        catch (NoResultException e)
        {
            System.out.println("Game you searched for is not here.");
            return null;
        }
        //todo make sure this works
    }

}
