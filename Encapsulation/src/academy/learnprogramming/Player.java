package academy.learnprogramming;


public class Player {
    // THIS IS EXAMPLE OF CLASS WITHOUT ENCAPSULATION
    public String name;
    public int health;
    public String weapon;
    // if we were to change anything above, we would have to find the
    // other parts of code that use the original value not the changed
    // value.

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for player
        }
    }
    public int healthRemaining() {
        return this.health;
    }
}
