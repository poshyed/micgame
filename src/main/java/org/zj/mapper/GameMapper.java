package org.zj.mapper;

import org.zj.entity.Game;

import java.util.List;

/**
 * Created by poshyed2 on 2017/6/26.
 */
public interface GameMapper {
    List<Game> getGame();

    void deleteGame(Game game);

    void updateGame(Game game);
//    void addGame(String gamename, String gamedescription, String filePath);
}
