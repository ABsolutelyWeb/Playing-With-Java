class Operators {
    public static void main(String args[]) {
        double trouble = 20;
        System.out.println("trouble is " + trouble);

        double troubleTwo = 80;
        System.out.println("troubleTwo is " + troubleTwo);

        double action = (trouble + troubleTwo)*25;
        System.out.println("action is " + action);

        double actionRemainder = action%40;
        System.out.println("actionRemainder is " + actionRemainder);

        if (actionRemainder <= 20) {
            System.out.println("Remainder exceeded!");
        }

        int firstScore = calcScore(true, 100, 800, 5);
        int secondScore = calcScore(false, 0, 0, 0);
        int totalScore = firstScore+secondScore;
        System.out.println("First score + second score = " + totalScore);
        System.out.println("=================================================");

        int pos = calcPosition(1001);
        System.out.println("First place return value is: " + pos);
        showPosition("Bloo", pos);

        System.out.println("");

        pos = calcPosition(600);
        System.out.println("Second place return value is: " + pos);
        showPosition("Gary", pos);

        System.out.println("");

        pos = calcPosition(400);
        System.out.println("Third place return value is: " + pos);
        showPosition("Sam", pos);

        System.out.println("");

        pos = calcPosition(50);
        System.out.println("Fourth place return value is: " + pos);
        showPosition("Clue", pos);

        System.out.println("=================================================");


    }

    public static int calcScore (boolean over, int bonus, int score, int completed) {

        if (over == true) {
            int finalScore = score + (bonus * completed);
            finalScore += 1000;
            System.out.println("Final Score: " + finalScore);
            return finalScore;
        } else {
            System.out.println("Game isn't over!");
            return 0;
        }
    }

    public static void showPosition(String player, int position){
        System.out.println(player + " is currently #" + position + " on the score chart!");
    }

    public static int calcPosition(int posScore) {
        if (posScore >= 1000 ) return 1;
        if ( (posScore >= 500) && (posScore < 1000) ) return 2;
        if ( (posScore >= 100) && (posScore < 500) ) return 3;
        return 4;
    }
}
/*
SAMPLE OUTPUT

trouble is 20.0
troubleTwo is 80.0
action is 2500.0
actionRemainder is 20.0
Remainder exceeded!
Final Score: 2300
Game isn't over!
First score + second score = 2300
=================================================
First place return value is: 1
Bloo is currently #1 on the score chart!

Second place return value is: 2
Gary is currently #2 on the score chart!

Third place return value is: 3
Sam is currently #3 on the score chart!

Fourth place return value is: 4
Clue is currently #4 on the score chart!
=================================================

*/