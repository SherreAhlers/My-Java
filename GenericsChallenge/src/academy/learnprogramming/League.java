package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }
    public boolean add(T team) {
        if(league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }
    public void showLeagueTable() {
        Collections.sort(league);
        // this works because in Team we have written our compare to
        // method and Java will automatically use that method when
        // Collections.sort() is called.
        for(T t : league) {
            // league is a paramatarized type bound by the Team class
            // it is used in declaration of ArrayList above which will
            // hold leagues teams
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
