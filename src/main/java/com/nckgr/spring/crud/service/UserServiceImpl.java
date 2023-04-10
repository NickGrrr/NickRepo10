package com.nckgr.spring.crud.service;


import com.nckgr.spring.crud.dao.UserDAO;
import com.nckgr.spring.crud.dao.UserDAOImpl;
import com.nckgr.spring.crud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
    @Override
    @Transactional
    public void saveUser(User user) {userDAO.saveUser(user);
    }

//    @Override
//    @Transactional
//    public void updateUser(User user) {
//        userDAO.updateUser(user);
//    }

    @Override
    @Transactional
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
