package com.nckgr.spring.crud.service;





import com.nckgr.spring.crud.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public List <User> getAllUsers();
    public void saveUser(User user);

//    public void updateUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
