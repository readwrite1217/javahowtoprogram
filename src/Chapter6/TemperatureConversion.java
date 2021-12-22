package Chapter6;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temp in Celsius");
        double tempInCelsius = scanner.nextDouble();
        System.out.println(fahrenheit(tempInCelsius));
        System.out.println("Enter the temp in Fahrenheit");
        double tempInFahrenheit = scanner.nextDouble();
        System.out.println(celsius(tempInFahrenheit));
    }

    private static double celsius(double tempInFahrenheit) {
        return (5.0 / 9.0 * (tempInFahrenheit - 32));
    }

    private static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}
