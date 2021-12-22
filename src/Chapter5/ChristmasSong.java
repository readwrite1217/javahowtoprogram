package Chapter5;

public class ChristmasSong {

    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.printf("On the %s day of Christmas\n My good friends brought to me\n %s", getDay(i), getRemainderOfEachVerse(i));
        }
    }

    private static String getRemainderOfEachVerse(int i) {

        String repeatedVerse = "And a song for the Christmas tree\n";
        String remainderOfVerse = "";

        switch (i) {
            case 1:
                remainderOfVerse = "A song and a Christmas tree\n";
                System.out.println();
                break;
            default:
                remainderOfVerse = christmanGitsForDay(i) + repeatedVerse;
                System.out.println();
        }
        return remainderOfVerse;
    }

    private static String christmanGitsForDay(int i) {
        StringBuilder s = new StringBuilder();
        //length 11
        String[] christmanGits = new String[]{"(All their good wishes)", " (Gifts for one and all)", "(Some mistletoe)", "  (A guardian angel)", "(Gold and silver tinsel)", "(Candles a glowing)",
                "(Little silver bells)", "(A shining star)", "(Four colored lights)", "(Three boughs of holly)", "(Two candy canes)"};
        for (int j = 0; j < i - 1; j++) {

            s.append(christmanGits[christmanGits.length - j - 1]);
            s.append("\n");
        }
        return s.toString();
    }

    private static String getDay(int i) {
        String day = "";
        switch (i) {
            case 1:
                day = "first";
                break;
            case 2:
                day = "second";
                break;
            case 3:
                day = "third";
                break;
            case 4:
                day = "forth";
                break;
            case 5:
                day = "fifth";
                break;
            case 6:
                day = "sixth";
                break;
            case 7:
                day = "seventh";
                break;
            case 8:
                day = "eight";
                break;
            case 9:
                day = "nineth";
                break;
            case 10:
                day = "tenth";
                break;
            case 11:
                day = "eleventh";
                break;
            case 12:
                day = "twelveth";
                break;

        }
        return day;
    }
}
