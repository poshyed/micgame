package org.zj.dao;

import org.zj.entity.Game;

import java.util.List;

/**
 * Created by poshyed2 on 2017/6/26.
 */
public interface GameDAO {
    List<Game> getGame();

    void deleteGame(Game game);

    void updateGame(Game game);
}
