public class Main {
    public static void main(String[] args) {
        Game one = new Game();

//test cases part a) 1 to 4 in the table

        one.getLevel(1).reachGoal(); //lvl 1 reached: 200 points
        one.getLevel(1).setPoints(200);
        one.getLevel(2).reachGoal(); //lvl 2 reached: 100 points
        one.getLevel(2).setPoints(100);
        one.getLevel(3).reachGoal(); //lvl 3 reached: 500 points
        one.getLevel(3).setPoints(500);
        one.makeBonus();
        System.out.println(one.getScore()); //prints 2400 because (200+100+500)3 = 2400

        Game two = new Game();
        two.getLevel(1).reachGoal(); //lvl 1 reached: 200 points
        two.getLevel(1).setPoints(200);
        two.getLevel(2).reachGoal(); //lvl 2 reached: 100 points
        two.getLevel(2).setPoints(100);
        two.getLevel(3).setPoints(500); //no reachGoal is seen for 3, so lvl 3 is not reached
        System.out.println(two.getScore()); //prints 300 because 200 + 100 = 300 and there is no bonus

        Game three = new Game();
        three.getLevel(1).reachGoal(); //lvl 1 reached: 200 points
        three.getLevel(1).setPoints(200);
        three.getLevel(2).setPoints(100); //lvl 2 not reached
        three.getLevel(3).reachGoal(); //lvl 3 reached
        three.getLevel(3).setPoints(500);
        three.makeBonus();
        System.out.println(three.getScore()); //print 600

        Game four = new Game();
        four.getLevel(1).setPoints(200); //lvl 1 not reached
        four.getLevel(2).reachGoal(); //lvl 2 reached
        four.getLevel(2).setPoints(100);
        four.getLevel(3).reachGoal(); //lvl 3 reached
        four.getLevel(3).setPoints(500);
        System.out.println(four.getScore()); //print 0
    }

//test case b
//
//    Game five = new Game();
//    System.out.println(five.playManyTimes(4));

}