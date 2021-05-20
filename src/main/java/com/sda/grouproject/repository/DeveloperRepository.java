package com.sda.grouproject.repository;

import com.sda.grouproject.model.Developer;
import com.sda.grouproject.model.User;
import com.sda.grouproject.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeveloperRepository {

    public Developer findById(Integer id)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Developer developer= session.find(Developer.class, id);
        session.close();
        return developer;
    }

    public void save(Developer developer)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.save(developer);
        transaction.commit();
        session.close();
    }

    public void delete(Developer developer)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.delete(developer);
        transaction.commit();
        session.close();
    }

    public void update(Developer developer)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.update(developer);
        transaction.commit();
        session.close();
    }
}
