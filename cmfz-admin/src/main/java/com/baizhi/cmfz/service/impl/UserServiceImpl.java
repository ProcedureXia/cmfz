package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.UserDao;
import com.baizhi.cmfz.entity.User;
import com.baizhi.cmfz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yx on 2018/7/4.
 */
@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,readOnly = false)
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User queryUser(String userName, String userPassword) {
        return userDao.selectUser(userName,userPassword);
    }

    @Override
    public int removeUserById(int userId) {
        int i = userDao.deleteUser(userId);
        return i;
    }

    @Override
    public int modifyUser(User user) {
        int i = userDao.updateUser(user);
        return i;
    }

    @Override
    public int addUser(User user) {
        int i = userDao.insertUser(user);
        return i;
    }
}
