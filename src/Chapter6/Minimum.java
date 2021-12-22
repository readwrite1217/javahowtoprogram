package Chapter6;

public class Minimum {
    public static void main(String[] args) {
        float num1 = 2.05f;
        float num2 = 3.05f;
        float num3 = 4.05f;

        System.out.println(Math.min(num3, Math.min(num1, num2)));
    }
}
