package Chapter4;

public class Chapter4_31 {
    public static void main(String[] args) {

        //13

        int num = 1101;
        int sum = 0;
        int count = 0;
        while (num != 0) {
            int remainder = num % 10;
            sum += (int) (remainder * Math.pow(2, count));
            num /= 10;
            count++;
        }
        System.out.println(sum);
    }
}
