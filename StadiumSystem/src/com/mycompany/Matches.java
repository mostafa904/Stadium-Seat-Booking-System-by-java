package com.mycompany;
import java.util.ArrayList;

class Matches {
    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    private String matchName;
    private String matchTime;
    private String matchDate;
    public ArrayList<String> matchesOfSunday = new ArrayList<>();
    public ArrayList<String> matchesOfMonday = new ArrayList<>();
    public ArrayList<String> matchesOfThursday = new ArrayList<>();

    {
        matchesOfSunday.add("El-Ahly VS EL-ZAMALEK AT 4pm");
        matchesOfSunday.add("liverpool VS manchester city At 10 pm");
        matchesOfMonday.add("real madrid VS Barcelona at 5pm");
        matchesOfMonday.add("Arsenal VS Chelsea 9pm ");
        matchesOfThursday.add("manchester united Vs tottenham 2pm");
        matchesOfThursday.add("paris saint german VS monaco 7pm");
    }


    public String getMatchName() {
        return matchName;
    }
    public String getMatchtime() {
        return matchTime;
    }
    public String getMatchDate() {
        return matchDate;
    }
}
