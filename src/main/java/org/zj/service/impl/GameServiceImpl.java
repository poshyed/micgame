package org.zj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zj.dao.GameDAO;
import org.zj.entity.Game;
import org.zj.service.GameSevice;

import java.util.List;

/**
 * Created by poshyed2 on 2017/6/27.
 */
@Service
public class GameServiceImpl implements GameSevice {
    @Autowired
    GameDAO gameDAO;
    public List<Game> getGame() {
        System.out.println("service");
        return gameDAO.getGame();
    }

    public void deleteGame(Game game) {
        gameDAO.deleteGame(game);
    }

    public void updateGame(Game game) {
        gameDAO.updateGame(game);
    }
}
