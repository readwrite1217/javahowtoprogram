package Chapter7;

import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        int size = 5;
        int count = 0;
        int[] a = new int[size];
        // a [1,2,3,3,4]
        Scanner scanner = new Scanner(System.in);

        while (count < size) {
            System.out.println("Enter the number");
            int num = scanner.nextInt();
            a[count] = num;
            boolean hasDupe = false;
            for (int i = 0; i < count; i++) {
                if (count == 0) {
                    hasDupe = false;
                } else {
                    if (a[count] == a[i]) {
                        hasDupe = true;
                        a[count] = -1;
                        a[i] = a[count];
                        break;
                    }
                }
            }
            if (!hasDupe) {
                System.out.println(num);
            }
            count++;
        }
        System.out.println(count);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                System.out.println(a[i]);
            }
        }

    }
}
