package com.xin.service.impl;
import com.xin.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xin.pojo.User;
import com.xin.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public User login(int id, String password) {
        return userDao.getUserByIdAndPassword(id,password);
    }

}
