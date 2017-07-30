package org.zj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zj.dao.S_UserDAO;
import org.zj.entity.S_User;
import org.zj.service.S_UserService;

import java.util.Set;
@Service
public class S_UserServiceImpl implements S_UserService {
    @Autowired
    S_UserDAO s_userDAO;
    public S_User findUserByName(String userName) {
        return s_userDAO.findUserByName(userName);
    }

    public Set<String> findRole(String userName) {
        return s_userDAO.findRole(userName);
    }

    public Set<String> findPermissions(String userName) {
        return s_userDAO.findPermissions(userName);
    }
}
