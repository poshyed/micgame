package org.zj.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.zj.entity.S_User;
import org.zj.service.S_UserService;

import java.util.Set;

public class MyRealm extends AuthorizingRealm {
    @Autowired
    S_UserService s_userService;
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String userName=principalCollection.getPrimaryPrincipal().toString();
        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        Set<String> roleName=s_userService.findRole(userName);
        Set<String> permissions=s_userService.findPermissions(userName);
        simpleAuthorizationInfo.setRoles(roleName);
        simpleAuthorizationInfo.setStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName=authenticationToken.getCredentials().toString();
        S_User user=s_userService.findUserByName(userName);
        if (user!=null){
            AuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(user.getUserName(),user.getPassword(),"a");
            return authenticationInfo;
        }
        return null;
    }
}