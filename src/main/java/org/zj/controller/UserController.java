package org.zj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.zj.entity.Game;
import org.zj.entity.User;
import org.zj.service.GameSevice;
import org.zj.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by poshyed2 on 2017/6/27.
 */
@Controller
@Scope(value = "prototype")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    private GameSevice gameSevice;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(User user, HttpServletRequest request) {
        Map<Integer, String> userInfo = userService.checkLoginUser(user.getUsername(), user.getPassword());
        ModelAndView mav = new ModelAndView();
        if (userInfo != null) {
            HttpSession session = request.getSession();
            for (Integer userid : userInfo.keySet()) {
                String username = userInfo.get(userid);
                session.setAttribute("userid", userid);
                session.setAttribute("username", username);
            }
            mav.setViewName("welcome");
            return mav;
        }
        mav.setViewName("fail");
        return mav;
    }

    @RequestMapping(value = "/changeaccount", method = RequestMethod.POST)
    public ModelAndView change(User user, HttpServletRequest request) {
        HttpSession session = request.getSession();
        ModelAndView mav = new ModelAndView();
        if (session.getAttribute("username") != null) {
            user.setId((Integer) session.getAttribute("userid"));
            userService.updateUser(user);
            mav.addObject("massage", "请重新登录");
            mav.setViewName("/login");
            return mav;
        }
        mav.addObject("massage", "你没有权限");
        mav.setViewName("/login");
        return mav;
    }

    @RequestMapping("/usercenter")
    public ModelAndView userCenter() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/usercenter/usermain");
        return mav;
    }
}
