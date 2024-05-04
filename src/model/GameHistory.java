package model;

import java.util.Date;

public class GameHistory {
    private User enemyUser;
    private Player enemyPlayer;
    private Date date;
    private int userRound1Score;
    private int userRound2Score;
    private int userRound3Score;
    private int enemyRound1Score;
    private int enemyRound2Score;
    private int enemyRound3Score;
    private int userScore;
    private int enemyScore;
    private boolean winner; // true for user, false for enemy

    public GameHistory(User enemyUser, Player enemyPlayer, Date date) {
        this.enemyUser = enemyUser;
        this.enemyPlayer = enemyPlayer;
        this.date = date;
        this.userScore=-1;
        this.userRound1Score=-1;
        this.userRound2Score=-1;
        this.userRound3Score=-1;
        this.enemyScore=-1;
        this.enemyRound1Score=-1;
        this.enemyRound2Score=-1;
        this.enemyRound3Score=-1;
        this.winner=false;
    }

    public void setUserRound1Score(int userRound1Score) {
        this.userRound1Score = userRound1Score;
    }

    public void setUserRound2Score(int userRound2Score) {
        this.userRound2Score = userRound2Score;
    }

    public void setUserRound3Score(int userRound3Score) {
        this.userRound3Score = userRound3Score;
    }

    public void setEnemyRound1Score(int enemyRound1Score) {
        this.enemyRound1Score = enemyRound1Score;
    }

    public void setEnemyRound2Score(int enemyRound2Score) {
        this.enemyRound2Score = enemyRound2Score;
    }

    public void setEnemyRound3Score(int enemyRound3Score) {
        this.enemyRound3Score = enemyRound3Score;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }

    public void setEnemyScore(int enemyScore) {
        this.enemyScore = enemyScore;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }
}
