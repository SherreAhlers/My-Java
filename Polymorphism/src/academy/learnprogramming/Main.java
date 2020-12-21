package academy.learnprogramming;

// if you create classes in main it is because they will not
// be used anywhere else.


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot() {
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    public String plot() {
        return "A shark eats lots of people.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over the planet Earth.";
    }
}
class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}
class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe.";
    }
}
class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
    // No plot method for Forgettable.
}

public class Main {

    public static void main(String[] args) {
	    // POLYMORPHISM
        // mechanism in object oriented programming that allows
        // actions to act differently that the actions is being
        // performed on
        // must create a number of classes to discuss polymorphism

        // HERE is where we use Polymorphism
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
            // this will output: Random number generated was 2
            // Movie #1 : Independence Day
            // Plot: Aliens attempt to take over the planet Earth.
            // Random number generated was 2
            // Movie #2 : Independence Day
            // Plot: Aliens attempt to take over the planet Earth.
            // Random number generated was 2
            // Movie #3 : Independence Day
            // Plot: Aliens attempt to take over the planet Earth.
            // Random number generated was 5
            // Movie #4 : Forgettable
            // Plot: No plot here.
            // Random number generated was 5
            // Movie #5 : Forgettable
            // Plot: No plot here.
            // Random number generated was 2
            // Movie #6 : Independence Day
            // Plot: Aliens attempt to take over the planet Earth.
            // Random number generated was 4
            // Movie #7 : Star Wars
            // Plot: Imperial forces try to take over the universe.
            // Random number generated was 4
            // Movie #8 : Star Wars
            // Plot: Imperial forces try to take over the universe.
            // Random number generated was 1
            // Movie #9 : Jaws
            // Plot: A shark eats lots of people.
            // Random number generated was 4
            // Movie #10 : Star Wars
            // Plot: Imperial forces try to take over the universe.
            // Stops at movie 10 because we asked for anything less than 11
        }
    }
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();

//            default:
//                return null;
            // OR LIKE THIS:
        }
        return null;
    }
}
