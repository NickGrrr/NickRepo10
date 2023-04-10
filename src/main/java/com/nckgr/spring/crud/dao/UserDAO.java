package com.nckgr.spring.crud.dao;





import com.nckgr.spring.crud.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDAO {
    public List <User> getAllUsers();
    public void saveUser(User user);
//    public void updateUser(User user);
    public User getUser(int id);

    public void deleteUser(int id);
}
