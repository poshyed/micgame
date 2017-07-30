package org.zj.mapper;

import org.zj.entity.S_User;

import java.util.Set;

public interface S_UserMapper {
    S_User findUserByName(String userName);
    Set<String> findRole(String userName);
    Set<String> findPermissions(String userName);
}
