package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // This is an example without ENCAPSULATION

//        Player player = new Player();
//        player.name = "Sherre";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//        // this will output: Remaining health 10
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//        // this will output:
//        // Player knocked out
//        // Remaining health -1

        // this is an example of Encapsulation

        EnhancedPlayer player = new EnhancedPlayer("Sherre", 50, "Sword");
        // if we put 200 instead of 50 above it will output: 100 because that is the default if validation fails
        System.out.println("Initial health is " + player.getHitPoints());
        // this will output: Initial health is 50
    }
}
