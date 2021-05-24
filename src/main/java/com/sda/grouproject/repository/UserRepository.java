package com.sda.grouproject.repository;

import com.sda.grouproject.model.User;
import com.sda.grouproject.utils.SessionManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.NoResultException;

public class UserRepository {

    private static UserRepository instance;

    private UserRepository() {
    }

    public static UserRepository getInstance()
    {
        if(instance==null) {
            instance= new UserRepository();
        }
        return instance;
    }

    public User findById(Integer id)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        User user= session.find(User.class, id);
        session.close();
        return user;
    }

    public boolean findByUserName(String username)
    {
        try
        {
        Session session= SessionManager.getSessionFactory().openSession();
        String findByUserNameQuerry= "from User u where u.username=: username";
        Query<User> userQuery= session.createQuery(findByUserNameQuerry);
        userQuery.setParameter("username", username);
        User user= userQuery.getSingleResult();
        session.close();
        return user == null;
    } catch (NoResultException e) {
            return true;
        }
    }
    public boolean findByEmail(String email)
    {
        try
        {
            Session session= SessionManager.getSessionFactory().openSession();
            String findByEmailQuery= "from User u where u.email=: email";
            Query<User> userQuery= session.createQuery(findByEmailQuery);
            userQuery.setParameter("email", email);
            User user= userQuery.getSingleResult();
            session.close();
            return user == null;
        } catch (NoResultException e) {
            return true;
        }
    }

    public boolean checkPassword(String password)
    {
        try
        {
            Session session= SessionManager.getSessionFactory().openSession();
            String findByPassword= "from User u where u.password=: password";
            Query<User> userQuery= session.createQuery(findByPassword);
            userQuery.setParameter("password", password);
            User user= userQuery.getSingleResult();
            session.close();
            return user == null;
        } catch (NoResultException e) {
            return true;
        }
    }

    public void save(User user)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }


    public void delete(User user)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }

    public void update(User user)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }
}
