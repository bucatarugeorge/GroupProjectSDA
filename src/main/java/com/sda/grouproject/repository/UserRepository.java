package com.sda.grouproject.repository;

import com.sda.grouproject.model.User;
import com.sda.grouproject.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.NoResultException;

public class UserRepository extends GenericRepository {

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

    public boolean findByColumn(String columnName, String username)
    {
        try
        {
        Session session= SessionManager.getSessionFactory().openSession();
        String findByUserNameQuerry= "from User u where u."+ columnName + "=: username";
        Query<User> userQuery= session.createQuery(findByUserNameQuerry);
        userQuery.setParameter("username", username);
        User user= userQuery.getSingleResult();
        session.close();
        return user == null;
    } catch (NoResultException e) {
            return true;
        }
    }
//    public boolean findByEmail(String email)
//    {
//        try
//        {
//            Session session= SessionManager.getSessionFactory().openSession();
//            String findByEmailQuery= "from User u where u.email=: email";
//            Query<User> userQuery= session.createQuery(findByEmailQuery);
//            //userQuery.setParameter("column", column);
//            userQuery.setParameter("email", email);
//            User user= userQuery.getSingleResult();
//            session.close();
//            return user == null;
//        } catch (NoResultException e) {
//            return true;
//        }
//    }

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

}
