class CricketStats extends Scores {
    private int wickets;

    public CricketStats(String playerName) {
        super(playerName);
        this.wickets = 0;
    }

    public void Runs(int runsScored) {
        increaseScore(runsScored);
    }

    public void takeWicket() {
        wickets++;
    }

    public String toString() {
        return super.toString() + ", Wickets: " + wickets;
    }
}