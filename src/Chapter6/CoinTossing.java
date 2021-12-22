package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class CoinTossing {

    private enum Coin {HEADS, TAILS}

    public static void main(String[] args) {
        boolean quit = false;
        int countHeads = 0;
        int countTails = 0;
        int totalFlips = 0;
        Scanner scanner = new Scanner(System.in);
        while (!quit) {

            System.out.println("T to toss Q to exit");
            String val = scanner.nextLine();
            if (val.equalsIgnoreCase("T")) {
                Coin flip = flip();
                if (flip == Coin.HEADS) {
                    System.out.println(Coin.HEADS);
                    countHeads++;
                } else {
                    System.out.println(Coin.TAILS);
                    countTails++;
                }
                totalFlips++;
            } else if (val.equalsIgnoreCase("q")) {
                quit = true;
            }
            System.out.println(countHeads);
            System.out.println(countTails);
            System.out.println(totalFlips);
        }
    }

    public static Coin flip() {
        Random random = new Random();
        int num = random.nextInt(2);
        if (num == 0) {

            return Coin.HEADS;
        } else {

            return Coin.TAILS;
        }
    }

}
