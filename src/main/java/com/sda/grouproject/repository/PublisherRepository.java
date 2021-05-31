package com.sda.grouproject.repository;

import com.sda.grouproject.model.Developer;
import com.sda.grouproject.model.Publisher;
import com.sda.grouproject.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PublisherRepository extends GenericRepository {

    private static PublisherRepository instance;
    private PublisherRepository()
    {

    }

    public static PublisherRepository getInstance()
    {
        if(instance==null)
        {
            instance= new PublisherRepository();
        }
        return instance;
    }

    public Publisher findById(Integer id)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Publisher publisher= session.find(Publisher.class, id);
        session.close();
        return publisher;
    }



}
