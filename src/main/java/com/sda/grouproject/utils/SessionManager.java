package com.sda.grouproject.utils;



import com.sda.grouproject.model.Developer;
import com.sda.grouproject.model.Game;
import com.sda.grouproject.model.Publisher;
import com.sda.grouproject.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager extends AbstractSessionManager {
    private static final SessionManager INSTANCE = new SessionManager();

    private SessionManager() {
    }

    public static void shutDown() {
        INSTANCE.shutdownSessionManager();
    }

    public static SessionFactory getSessionFactory(){
        return INSTANCE.getSessionFactory("gameShop?serverTimezone=UTC");

    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Developer.class);
        configuration.addAnnotatedClass(Game.class);
        configuration.addAnnotatedClass(Publisher.class);
    }


}
