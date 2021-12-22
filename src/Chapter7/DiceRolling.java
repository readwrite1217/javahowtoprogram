package Chapter7;

import java.util.Random;

public class DiceRolling {
    private static Random random = new Random();

    public static void main(String[] args) {

        int[] countForSum = new int[11]; // 11 possible values for sum 2-12
        for (int i = 0; i < 36000000; i++) {
            int dice1 = rollDice();
            int dice2 = rollDice();
            int sum = dice1 + dice2;
            ++countForSum[sum - 2]; // if sum is 2 , keep incrementing the countForSum[0]
        }
        for (int i = 0; i < countForSum.length; i++) {
            System.out.printf("%4d --> %4d\n", i + 2, countForSum[i]);
        }
    }

    private static int rollDice() {
        return random.nextInt(6) + 1;
    }

}

