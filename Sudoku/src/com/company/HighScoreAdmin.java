package com.company;

/**
 * -----------------------------------------------------
 * Author:          Blerinë Berisha
 * Date:            date
 * Project:         project name
 * Description:     Short description
 * ------------------------------------------------------
 **/
public class HighScoreAdmin {
    private HighScore[] highscores;

    public HighScoreAdmin(HighScore[] highscores) {
        this.highscores = highscores;
    }

    public HighScore[] getHighscores() {
        return highscores;
    }

    public void setHighscores(HighScore[] highscores) {
        this.highscores = highscores;
    }

    public HighScore[] getHighScores(){

    }
}
