package org.zj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zj.entity.Game;
import org.zj.service.GameSevice;

import java.util.List;

/**
 * Created by poshyed2 on 2017/6/27.
 */
@Controller
@Scope(value = "prototype")
@RequestMapping("/game")
public class GameListController {
    @Autowired
    GameSevice gameSevice;
    @RequestMapping("/list")
    public ModelAndView listGame(){
        ModelAndView mav=new ModelAndView();
        List<Game> gameList=gameSevice.getGame();
        mav.addObject("game",gameList);
        mav.setViewName("gamelist");
        return mav;
    }
}
