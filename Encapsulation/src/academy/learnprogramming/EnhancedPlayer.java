package academy.learnprogramming;

public class EnhancedPlayer {
    // ENCAPSULATION EXAMPLE
    private String name;
    private int hitPoints = 100;
    // If you want to change all of the instances of one word
    // highlight word - right click - select Refactor - then rename
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            // value between 1-100 is value we are allowing for health.
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for player
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
    // The biggest benefit of encapsulation is we can make all the
    // changes to EnhancedPlayer class and can change names at any time
    // without changing the rest of code.
    // More control over code with encapsulation.

}
