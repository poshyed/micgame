package org.zj.dao;

import org.zj.entity.User;

/**
 * Created by poshyed2 on 2017/6/26.
 */
public interface UserDAO {
    void addUser(User user);

    User findLoginUser(String username);

    void updateUser(User user);

    void deleteUser(User user);
}
