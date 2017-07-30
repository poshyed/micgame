package org.zj.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zj.dao.S_UserDAO;
import org.zj.entity.S_User;
import org.zj.mapper.S_UserMapper;

import java.util.Set;
@Repository("s_userDAO")
public class S_UserDAOImpl implements S_UserDAO {
    @Autowired
    S_UserMapper s_userMapper;
    public S_User findUserByName(String userName) {
        return s_userMapper.findUserByName(userName);
    }

    public Set<String> findRole(String userName) {
        return s_userMapper.findRole(userName);
    }

    public Set<String> findPermissions(String userName) {
        return s_userMapper.findPermissions(userName);
    }
}
