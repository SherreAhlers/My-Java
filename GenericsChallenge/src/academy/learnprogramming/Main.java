package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {
    // CHALLENGE
    // Create a generic class to implement a league table for
    // a sport.
    // The class should allow teams to be added to the list,
    // and store
    // a list of teams that belong to the league.

    // Your class should have a method to print out the teams
    // in order, with the team at the top of the league printed first.

    // Only teams of the same type should be added to any particular
    // instance of the league class - the program should fail to compile
    // if an attempt is made to add an incompatible team.
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeagueTeam = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorn.matchResult(fremantle, 1, 0);
        // this will output: Hawthorn beat Fremantle
        hawthorn.matchResult(adelaideCrows, 3, 8);
        // this will output: Hawthorn lost to Adelaide Crows

        adelaideCrows.matchResult(fremantle, 2, 1);
        // this will output: Adelaide Crows beat Fremantle

        footballLeagueTeam.add(adelaideCrows);
        footballLeagueTeam.add(melbourne);
        footballLeagueTeam.add(hawthorn);
        footballLeagueTeam.add(fremantle);

//        footballLeagueTeam.add(baseballTeam);
        // this will not work because you cannot add a baseball
        // team to a football league

        footballLeagueTeam.showLeagueTable();
        // this will output:
        // Adelaide Crows: 4
        // Hawthorn: 2
        // Melbourne: 0
        // Fremantle: 0

        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

//        Team rawTeam = new Team("Raw Team");
//        rawTeam.addPlayer(beckham); // unchecked warning - not defining types
//        rawTeam.addPlayer(pat); // unchecked warning - not defining types

//        footballLeagueTeam.add(rawTeam);

//        League<Team> rawLeague = new League<>("Raw");
//        rawLeague.add(adelaideCrows); // no warning
//        rawLeague.add(baseballTeam); // no warning
//        rawLeague.add(rawTeam); // no warning

//        League reallyRaw = new League("Really Raw");
//        reallyRaw.add(adelaideCrows); // unchecked warning - not defining types
//        rawLeague.add(baseballTeam); // unchecked warning - not defining types
//        rawLeague.add(rawTeam); // unchecked warning - not defining types




    }
}
