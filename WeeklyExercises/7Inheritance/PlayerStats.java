class PlayerStats {
    protected String playerName;
    protected int gamesPlayed;

    public PlayerStats(String playerName) {
        this.playerName = playerName;
        this.gamesPlayed = 0;
    }

    public void increaseGamesPlayed() {
        gamesPlayed++;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public String toString() {
        return "Player: " + playerName + ", Games played: " + gamesPlayed;
    }
}

abstract class Scores extends PlayerStats {
    protected int score;

    public Scores(String playerName) {
        super(playerName);
        this.score = 0;
    }

    public void increaseScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return super.toString() + ", Score: " + score;
    }
}
