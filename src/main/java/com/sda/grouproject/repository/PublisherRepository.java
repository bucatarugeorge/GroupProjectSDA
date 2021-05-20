package com.sda.grouproject.repository;

import com.sda.grouproject.model.Developer;
import com.sda.grouproject.model.Publisher;
import com.sda.grouproject.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PublisherRepository {

    public Publisher findById(Integer id)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Publisher publisher= session.find(Publisher.class, id);
        session.close();
        return publisher;
    }

    public void save(Publisher publisher)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.save(publisher);
        transaction.commit();
        session.close();
    }

    public void delete(Publisher publisher)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.delete(publisher);
        transaction.commit();
        session.close();
    }

    public void update(Publisher publisher)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.update(publisher);
        transaction.commit();
        session.close();
    }

}
