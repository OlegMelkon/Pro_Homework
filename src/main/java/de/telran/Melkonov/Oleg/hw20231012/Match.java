package de.telran.Melkonov.Oleg.hw20231012;

public class Match {
    int year;
    int month;
    int day;
    String firstTeam;
    String secondTeam;
    int firstTeamCount;
    int secondTeamCount;
    public int watchers;
    public String stadium;

    String NULL_VALUE = "NULL";

    //2022, 11, 12, Werder Bremen, 1:02, RB Leipzig, 41500, Weser-Stadion
    public Match(String line) {
        String[] column = line.split(", ");
        this.year = Integer.valueOf(column[0]);
        this.month = Integer.valueOf(column[1]);
        this.day = Integer.valueOf(column[2]);
        this.firstTeam = column[3];
        String result = column[4];
        String[] balls = result.split(":");
        firstTeamCount = Integer.valueOf(balls[0]);
        secondTeamCount = Integer.valueOf(balls[1]);
        this.secondTeam = column[5];
        if (!NULL_VALUE.equals(column[6])) {
            watchers = Integer.valueOf(column[6]);
        }
        if (!NULL_VALUE.equals(column[7])) {
            stadium = column[7];
        } else {
            stadium = NULL_VALUE;
        }

    }

    @Override
    public String toString() {
        return "MatchResult{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", firstTeam='" + firstTeam + '\'' +
                ", secondTeam='" + secondTeam + '\'' +
                ", firstTeamCount=" + firstTeamCount +
                ", secondTeamCount=" + secondTeamCount +
                ", watchers=" + watchers +
                ", stadiumName='" + stadium + '\'' +
                '}';
    }
}
