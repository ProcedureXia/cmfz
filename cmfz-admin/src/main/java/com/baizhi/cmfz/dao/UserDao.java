package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by yx on 2018/7/4.
 */
public interface UserDao {
    public User selectUser(@Param("userName") String userName,@Param("userPassword") String userPassword);

    public int insertUser(User user);

    public int updateUser(User user);

    public int deleteUser(@Param("id") int id);

}
