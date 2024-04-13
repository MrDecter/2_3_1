package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Transactional
    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }


    @Transactional
    @Override
    public void updateUser(User user) {

    }


    @Transactional
    @Override
    public void deleteUser(int id) {

    }


    @Transactional
    @Override
    public User getUser(int id) {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }
}
