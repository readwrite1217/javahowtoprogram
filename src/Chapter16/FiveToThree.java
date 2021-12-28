package Chapter16;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FiveToThree {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        Scanner sc = null;
        List<String> words = new ArrayList<>();
        try {
            inputStream = new FileInputStream("/Users/subsharma/Desktop/words.txt");
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                words.add(line.strip().toLowerCase());

            }
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
        }
        while (true) {

            System.out.println("Enter a five letter word");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }

            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j < input.length(); j++) {
                    for (int k = 0; k < input.length(); k++) {
                        if (i == j || i == k || j == k)
                            continue;
                        StringBuilder sb1 = new StringBuilder();
                        sb1.append(input.charAt(i)).append(input.charAt(j)).append(input.charAt(k));
                        if (words.contains(sb1.toString())) {
                            System.out.println(sb1);
                        }
                    }
                }


            }
        }
    }
}
