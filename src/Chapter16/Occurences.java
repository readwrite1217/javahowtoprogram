package Chapter16;

import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Linha de texto: ");
        String string = input.nextLine();

        System.out.print("Caractere pesquisado: ");
        char key = input.next().charAt(0);
        input.close();

        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {

            }
            if (string.indexOf(key, i) == -1)
                break;
            else {
                counter++;
                i = string.indexOf(key, i);
            }
        }

        System.out.printf("\'%s\' aparece %d vez(es) no texto", key, counter);

    }

}
