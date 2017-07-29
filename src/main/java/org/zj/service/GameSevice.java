package org.zj.service;

import org.zj.entity.Game;

import java.util.List;

/**
 * Created by poshyed2 on 2017/6/27.
 */
public interface GameSevice {
    List<Game> getGame();

    void deleteGame(Game game);

    void updateGame(Game game);
}
