package com.sda.grouproject.repository;

import com.sda.grouproject.model.Developer;
import com.sda.grouproject.utils.SessionManager;
import org.hibernate.Session;

public class DeveloperRepository extends GenericRepository {

    private static DeveloperRepository instance;
    private DeveloperRepository()
    {

    }

    public static DeveloperRepository getInstance()
    {
        if(instance==null)
        {
            instance= new DeveloperRepository();
        }
        return instance;
    }
    public Developer findById(Integer id)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Developer developer= session.find(Developer.class, id);
        session.close();
        return developer;
    }

}
