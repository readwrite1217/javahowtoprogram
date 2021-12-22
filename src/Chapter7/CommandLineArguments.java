package Chapter7;

public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Provide min 3 integers");
        } else {
            int largest = Integer.parseInt(args[0]);
            int smallest = Integer.parseInt(args[0]);
            for (String num : args) {
                if (largest < Integer.parseInt(num
                ))
                    largest = Integer.parseInt(num);
                if (smallest > Integer.parseInt(num))
                    smallest = Integer.parseInt(num);
            }
//            int average = (smallest + largest) / 2;
            int average = calculateMinMaxAverage(args);
            System.out.println(average);
        }
    }

    private static int calculateMinMaxAverage(String[] args) {
        int largest = Integer.parseInt(args[0]);
        int smallest = Integer.parseInt(args[0]);
        for (String num : args) {
            if (largest < Integer.parseInt(num
            ))
                largest = Integer.parseInt(num);
            if (smallest > Integer.parseInt(num))
                smallest = Integer.parseInt(num);
        }
        int average = (smallest + largest) / 2;
        return average;
    }
}
