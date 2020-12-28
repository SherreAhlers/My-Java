package academy.learnprogramming;

import java.util.ArrayList;

//public class Team {
// modify to specify type parameter for generic
//public class Team<T> {
    //  now instead of above modify it to:
//public class Team<T extends Player> {
    // now T extends Player class
    // this is how we restrict the type of class for Team - any type that extends
    // from Player - if we use class that doesn't live in Player will get an error

// if want to use multiple bounds could write the class like this:
//public class Team<T extends Player & Coach & Manager> {}
// but if specifying multiple bounds only the Player is allowed to be a class
// Coach and Manager must be Interfaces - cannot be classes

    // we want to be able to compare teams not just players on one team
    // in order to do that must implement Java Comparable:
    public class Team<T extends Player> implements Comparable<Team<T>> {
        // created ability to have generic types such as Team<FootballPlayer>
        // here we are specifying a generic type as a parameter
        // Comparable is an Interface
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

//    private ArrayList<Player> members = new ArrayList<>();
    // modify above to accept type parameter see below:
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//    public boolean addPlayer(Player player) {
        // modify to add type parameter class gf generics see below:
    public boolean addPlayer(T player) {
        // changed type to make it more generic so other classes can use
        // must cast player to Player Object
        if(members.contains(player)) {
//            System.out.println(player.getName() + " is already on this team.");
            // must cast player to Player Object instead of above do:
//            System.out.println(((Player) player).getName() + " already on this team.");

            // because we did type parameter <T extends Player> at the top no longer need to cast
            System.out.println(player.getName() + " is already on this team!");
            return false;
        } else {
            members.add(player);
//            System.out.println(player.getName() + "picked for team " + this.name);
            // must cast player to Player Object instead of above do:
//            System.out.println(((Player) player).getName() + " picked for the team " + this.name);

            // because we did type parameter <T extends Player> at the top no longer need to cast
            System.out.println(player.getName() + " picked for the team " + this.name);
            return true;
        }
    }
    public int numPlayers() {
        return this.members.size();
    }
//    public void matchResult(Team opponent, int ourScore, int theirScore) {
        // must change the above to:
public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

    // because we need the generic Team type Team<T> in order to track what
        // team is being compared and if they are of same sport.
        String message;

        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
            // here we are invoking an opponents result
        }
    }
public int ranking() {
    return (won * 2) + tied;
    // number of games won * 2 plus tied
}

        @Override
        public int compareTo(Team<T> team) {
            if(this.ranking() > team.ranking()) {
                // the higher the score the better
                return -1;
            } else if(this.ranking() < team.ranking()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
