public class StatsTracker {
    public static void main(String[] args) {
        FootballStats playerA = new FootballStats("Christiano Ronaldo");
        playerA.increaseGamesPlayed();
        playerA.increaseGoals();
        playerA.increaseAssists();

        CricketStats playerB = new CricketStats("Alastair Cook");
        playerB.increaseGamesPlayed();
        playerB.Runs(47);
        playerB.takeWicket();
        playerB.increaseGamesPlayed();

        System.out.println(playerA);
        System.out.println(playerB);
    }
}
