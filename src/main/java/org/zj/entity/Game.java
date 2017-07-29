package org.zj.entity;

import com.mysql.jdbc.Blob;

/**
 * Created by poshyed2 on 2017/6/26.
 */
public class Game {
    private int id;
    private String gamename;
    private String gamedescription;
    private String filepath;
    private Blob longblob;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGamename() {
        return gamename;
    }

    public void setGamename(String gamename) {
        this.gamename = gamename;
    }

    public String getGamedescription() {
        return gamedescription;
    }

    public void setGamedescription(String gamedescription) {
        this.gamedescription = gamedescription;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Blob getLongblob() {
        return longblob;
    }

    public void setLongblob(Blob longblob) {
        this.longblob = longblob;
    }
}
