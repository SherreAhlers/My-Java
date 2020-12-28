package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

//        Team adelaideCrows = new Team("Adelaide Crows");
        // must add type argument like below:
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        // this will output: Joe picked for the team Adelaide Crows

//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);
        // the two above no longer work because pat and beckham are not
        // football players


        System.out.println(adelaideCrows.numPlayers());
        // this will output: 1 --- because we have only so far added one player

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        // this will output: Pat picked for the team Chicago Cubs

//        Team<String> brokenTeam = new Team<>("This won't work");
//        brokenTeam.addPlayer("No-one");
        // these two above will throw an error because we have in Team class
        // we defined a cast (Player) player so it won't work with a type String

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);
        // this is now valid because it is calling the <SoccerPlayer> type parameter
        // this will output: Beckham picked for the team this won't work

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);
        // this will output: Gordon picked for the team Melbourne

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        // this will output: Hawthorn beat Fremantle
        hawthorn.matchResult(adelaideCrows, 3, 8);
        // this will output: Hawthorn lost to Adelaide Crows

        adelaideCrows.matchResult(fremantle, 2, 1);
        // this will output: Adelaide Crows beat Fremantle

//        adelaideCrows.matchResult(baseballTeam, 1, 1);
        // this will output: this will give an error because they are two different
        // sport types and cannot be compared.

        System.out.println("Rankings:");
        // this will output: Rankings:
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        // this will output: Adelaide Crows: 4
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        // this will output: Melbourne: 0
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        // this will output: Fremantle: 0
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        // this will output: Hawthorn: 2

        System.out.println(adelaideCrows.compareTo(melbourne));
        // melbourne got a higher ranking
        // output will be: -1
        System.out.println(adelaideCrows.compareTo(hawthorn));
        // hawthorn got a higher ranking
        // output will be: -1

        System.out.println(hawthorn.compareTo(adelaideCrows));
        // this will output: 1 -- because hawthorne ranks higher than adelaideCrows
        System.out.println(melbourne.compareTo(fremantle));
        // this will output: 0 --- because they are the same

    }
}
