package org.zj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zj.dao.UserDAO;
import org.zj.entity.User;
import org.zj.service.UserService;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by poshyed2 on 2017/6/27.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    public void addUser(User user) {
        userDAO.addUser(user);
    }

    public Map<Integer, String> checkLoginUser(String username, String password) {
        User user = userDAO.findLoginUser(username);
        if (user != null && user.getPassword().equals(password)) {
            Map<Integer,String> userInfo=new HashMap<Integer, String>();
            userInfo.put(user.getId(),user.getUsername());
            return userInfo;
        }
        return null;
    }

    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    public void deleteUser(User user) {
        userDAO.deleteUser(user);
    }
}
