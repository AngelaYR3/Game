import java.util.Scanner;

public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;

    public Game() {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }

    public boolean isBonus() {
        return bonus;
    }

    public void makeBonus() {
        bonus = true;
    }

    public Level getLevel(int i) {
        if (i == 1) return levelOne;
        if (i == 2) return levelTwo;
        if (i == 3) return levelThree;
        return null;
    }


    public int getScore() {
    int points = 0;

    if (!levelOne.goalReached()) {
        return 0;  //if lvl 1 goal isn't reached, end result is 0
    }
    points += levelOne.getPoints();

    if (levelTwo.goalReached()) {
        points += levelTwo.getPoints();

        if (levelThree.goalReached()) {
            points += levelThree.getPoints();
        }
    }
    if (isBonus()) {
        points *= 3; //bonus is 3 times the total points
    }
    return points;
    }


    public void play () {
        System.out.println("Enter the number of points.");
        Scanner s = new Scanner(System.in);
        levelOne.setPoints(s.nextInt());
        levelOne.reachGoal();
    }

    public int playManyTimes(int num) {
        int max = 0;

        while (num > 0) {
            play(); //play the game once
            int score = getScore();

            if (score > max) {
                max = score; //the new max is created if this play's score is higher than the old max
            }

            num--; //decrease the number of total plays left

        }
        return max; //return the highest score
    }
}
