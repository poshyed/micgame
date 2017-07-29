package org.zj.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zj.dao.UserDAO;
import org.zj.entity.User;
import org.zj.mapper.UserMapper;

/**
 * Created by poshyed2 on 2017/6/26.
 */
@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
    @Autowired
    UserMapper userMapper;

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public User findLoginUser(String username) {
        return userMapper.findLoginUser(username);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public void deleteUser(User user) {
        userMapper.deleteUser(user);
    }
}
