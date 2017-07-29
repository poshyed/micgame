package org.zj.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zj.dao.GameDAO;
import org.zj.entity.Game;
import org.zj.mapper.GameMapper;

import java.util.List;

/**
 * Created by poshyed2 on 2017/6/27.
 */
@Repository("gameDAO")
public class GameDAOImpl implements GameDAO {
    @Autowired
    GameMapper gameMapper;

    public List<Game> getGame() {
        System.out.println("dao");
        return gameMapper.getGame();
    }

    public void deleteGame(Game game) {
        gameMapper.deleteGame(game);
    }

    public void updateGame(Game game) {
        gameMapper.updateGame(game);
    }
}
