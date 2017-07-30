package org.zj.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zj.entity.S_User;
import org.zj.service.S_UserService;

@Controller
@RequestMapping("/")
public class S_UserController {
    @Autowired
    private S_UserService s_userService;
    @RequestMapping("/login")
    public String login(S_User user, Model model){
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(user.getUserName(),user.getPassword());
        try{
            subject.login(token);
            return "admin";
        }catch (Exception e){
            model.addAttribute("error","用户或密码错误");
            return "../../login";
        }
    }
}
