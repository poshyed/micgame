package org.zj.service;

import org.zj.entity.User;

import java.util.Map;

/**
 * Created by poshyed2 on 2017/6/27.
 */
public interface UserService {
    void addUser(User user);

    Map<Integer,String> checkLoginUser(String username, String password);

    void updateUser(User user);

    void deleteUser(User user);
}
