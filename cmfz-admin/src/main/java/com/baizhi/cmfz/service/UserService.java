package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by yx on 2018/7/4.
 */

public interface UserService {
    public User queryUser(String userName,String userPassword);

    public int removeUserById(int userId);

    public int modifyUser(User user);

    public int addUser(User user);
}
