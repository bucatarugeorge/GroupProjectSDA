package com.sda.grouproject.repository;
import com.sda.grouproject.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GenericRepository implements Repository {
    @Override
    public void save(Object object) {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.save(object);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Object object) {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.delete(object);
        transaction.commit();
        session.close();

    }

    @Override
    public void update(Object object) {

        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.update(object);
        transaction.commit();
        session.close();
    }

}
