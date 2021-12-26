package Chapter16;

import java.util.Random;

public class RandomSentences {
    private static Random random = new Random();

    public static void main(String[] args) {
        /*"the", "a", "one", "some" and "any"; the noun array should contain the nouns "boy", "girl", "dog", "town" and "car"; the verb array should con- tain the verbs "drove", "jumped", "ran", "walked" and "skipped"; the preposition array should contain the prepositions "to", "from", "over", "under" and "on".*/
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

//        article , noun, verb, preposition
        for (int i = 0; i < 25; i++) {
            String firstString = article[getRandom()];
            System.out.println(firstString.substring(0, 1).toUpperCase().concat(firstString.substring(1)).concat(" ").concat(noun[getRandom()]).concat(" ").concat(verb[getRandom()]).concat(" ").concat(preposition[getRandom()]).concat(" ").concat(article[getRandom()]).concat(" ").concat(noun[getRandom()].concat(".")));

        }
        getRandom();
    }

    private static int getRandom() {
        return random.nextInt(4);
    }


}
