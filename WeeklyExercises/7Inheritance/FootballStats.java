class FootballStats extends Scores {
    private int goals;
    private int assists;

    public FootballStats(String playerName) {
        super(playerName);
        this.goals = 0;
        this.assists = 0;
    }

    public void increaseGoals() {
        goals++;
        increaseScore(1);
    }

    public void increaseAssists() {
        assists++;
    }

    public String toSTring() {
        return super.toString() + ", Goals: " + goals+ ", Assists: " + assists;
    }
}
