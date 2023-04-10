package com.nckgr.spring.crud.dao;



import com.nckgr.spring.crud.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers(){
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.merge(user);
    }
//    @Override
//    public void updateUser(User user) {
//        entityManager.merge(user);
//    }

    @Override
    public User getUser(int id) {
         User user = entityManager.find(User.class, id);
        return user;
    }

    @Override
    public void deleteUser(int id) {
//        Query<User> query = session.createQuery("delete from User where id =:userId");
//        query.setParameter("userId", id);
//        query.executeUpdate();
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }
}
