package com.company;

/**
 * -----------------------------------------------------
 * Author:          Blerinë Berisha
 * Date:            date
 * Project:         project name
 * Description:     Short description
 * ------------------------------------------------------
 **/
public class HighScore {
    private String player;
    private String date;
    private int time;

    public HighScore(String player, String date, int time) {
        this.player = player;
        this.date = date;
        this.time = time;
    }
    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


}
